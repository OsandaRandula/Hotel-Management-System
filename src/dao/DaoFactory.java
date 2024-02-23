/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import dao.custom.impl.CustomerDaoImpl;
import dao.custom.impl.ReservationDaoImpl;
import dao.custom.impl.ReservationDetailsDaoImpl;
import dao.custom.impl.RoomCategoryDaoImpl;
import dao.custom.impl.RoomDaoImpl;

/**
 *
 * @author osand
 */
public class DaoFactory {
    
    private static DaoFactory davoFactory;

    private DaoFactory() {
        
    }
    
    public static DaoFactory getInstance(){
        if(davoFactory == null){
            davoFactory = new DaoFactory();
        }
        
        return davoFactory;
    }
    
     public SuperDao getDao(DaoType type){
        switch (type) {
            
            case CUSTOMER:
               return new CustomerDaoImpl();
            case ROOMCATEGORY:    
                return new RoomCategoryDaoImpl();
            case ROOM:
                return new RoomDaoImpl();
            case RESERVATION:
                return new ReservationDaoImpl();
            case RESERVATION_DETAILS:
                return new ReservationDetailsDaoImpl();
                                               
            default:
                return null;
        }
    }
    
    public enum DaoType{
        CUSTOMER,ROOMCATEGORY,ROOM,RESERVATION,RESERVATION_DETAILS
    }
    
}

    

