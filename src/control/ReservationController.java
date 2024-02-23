/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package control;

import dto.ReservationDetailsDto;
import dto.ReservationDto;
import service.ServiceFactory;
import service.custom.ReservationService;

/**
 *
 * @author osand
 */
public class ReservationController {
    
    private final ReservationService reservationService = (ReservationService) ServiceFactory.getInstance().getService(ServiceFactory.ServiceType.RESERVATION);

    public String reserve(ReservationDto reservationDto) throws Exception {
    
        return reservationService.saveReservation(reservationDto);
    }

    public double getPrice(long numOfDays, String roomType, String packageType) throws Exception {
       
        return reservationService.getPrice(numOfDays, roomType, packageType);
    
    }

    public boolean roomAvailablity(ReservationDetailsDto reservationDetailsDto) throws Exception {
    
        return reservationService.roomAvailablity(reservationDetailsDto);
        
    }
    
    
    
    
}
