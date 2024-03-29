/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service.custom.impl;

import dao.DaoFactory;
import dao.custom.ReservationDao;
import dao.custom.ReservationDetailsDao;
import dao.custom.RoomCategoryDao;
import db.DBConnection;
import dto.ReservationDetailsDto;
import dto.ReservationDto;
import entity.ReservationDetailsEntity;
import entity.ReservationEntity;
import entity.RoomCategoryEntity;
import java.sql.Connection;
import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.temporal.ChronoUnit;
import java.util.Date;
import service.custom.ReservationService;

/**
 *
 * @author osand
 */
public class ReservationServiceImpl implements ReservationService {

     private ReservationDao reservationDao = (ReservationDao) DaoFactory.getInstance().getDao(DaoFactory.DaoType.RESERVATION);
     private ReservationDetailsDao reservationDetailsDao = (ReservationDetailsDao) DaoFactory.getInstance().getDao(DaoFactory.DaoType.RESERVATION_DETAILS);
     private RoomCategoryDao roomCategoryDao = (RoomCategoryDao)DaoFactory.getInstance().getDao(DaoFactory.DaoType.ROOMCATEGORY);
     
    @Override
    public String saveReservation(ReservationDto reservationDto) throws Exception {
        
        double totalPrice = 0;
        
        for(ReservationDetailsDto d : reservationDto.getReservationDetailsList()){
    
        totalPrice += d.getPrice();
    
        }
        
       Connection connection =  DBConnection.getTnstence().getConnection();  
       connection.setAutoCommit(false);
    
        ReservationEntity reservationEntity = new ReservationEntity(
                reservationDto.getResID(),
                reservationDto.getDate(),
                totalPrice,
                reservationDto.getCustID()       
        );
        
        if(reservationDao.save(reservationEntity)){
        
        boolean isSaveReservationDetails = true;
            
        for(ReservationDetailsDto d : reservationDto.getReservationDetailsList()){
    
            ReservationDetailsEntity reservationDetailsEntity = new ReservationDetailsEntity(
            
                reservationDto.getResID(),
                d.getRoomId(),
                d.getInDate(),
                d.getOutDate(),
                d.getPakage(),
                d.getPrice()
            
            );
            
            if( ! reservationDetailsDao.save(reservationDetailsEntity)){
            
                isSaveReservationDetails = false;               
                
            }       
            
        }    
            
        if(isSaveReservationDetails){
        
            connection.commit();
            return "Sucsess";
        }
        
        else{
        
            connection.rollback();
            return "Error in Saving Reservation Details";
         
        }
            
        
        }
        
        else{
        
         connection.rollback();
         return "Error in Saving Reservation";
         
        }
        
        
    
    }

    @Override
    public double getPrice(long numOfDays, String roomType, String packageType) throws Exception {
    
    
        RoomCategoryEntity t = roomCategoryDao.get(roomType);
        if("FB".equals(packageType)){return t.getFbPrice()*numOfDays;}
        else if ("HB".equals(packageType)){return t.getHbPrice()*numOfDays;}
        else return t.getBbPrice()*numOfDays;     

    }

    @Override
    public boolean roomAvailablity(ReservationDetailsDto reservationDetailsDto) throws Exception {
    
    ReservationDetailsEntity t = new ReservationDetailsEntity();
    
         t.setInDate(reservationDetailsDto.getInDate());
         t.setOutDate(reservationDetailsDto.getOutDate());
         t.setRoomId(reservationDetailsDto.getRoomId());
    
      return reservationDetailsDao.availability(t);
      
    
    }

    @Override
    public String deleteReservation(String resId, String roomId) throws Exception {
    
        Connection connection =  DBConnection.getTnstence().getConnection();  
        connection.setAutoCommit(false);
        
        ReservationDetailsEntity t = reservationDetailsDao.get(resId, roomId);
        
        Double price = t.getPrice();
        Date inDate = t.getInDate();
        LocalDate localDateIn = inDate.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        
        LocalDateTime inDateTime = localDateIn.atTime(12, 0);
        LocalDateTime curDateTime = LocalDateTime.now();
        
        
        Duration duration = Duration.between(curDateTime, inDateTime);
        
        if(duration.toHours()>=24){
              
        if(reservationDetailsDao.delete(resId,roomId)){
        
        ReservationEntity a = new ReservationEntity();
        a.setResID(resId);
        a.setTotalPrice(price);
        
        if(reservationDao.update(a)){
        
        connection.commit();
        return "Succsesfuly Cancel";
        
        }
        
        
        else {
        
            connection.rollback();
            return "Eror in Cancel";
        
        }
        
        
        }
        
        else {
        
           connection.rollback();
           return "Eror in Cancel";
           
        }
        
        }
        
        else {
        
        return "You cannot cancel this reservation";
        
        
        }
        
        
        
    
    
    }

    
    
}
