/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package service.custom;

import dto.ReservationDetailsDto;
import dto.ReservationDto;
import service.SuperService;

/**
 *
 * @author osand
 */
public interface ReservationService extends SuperService {
      
String saveReservation(ReservationDto reservationDto) throws Exception;

double getPrice(long numOfDays, String roomType, String packageType) throws Exception;

boolean roomAvailablity(ReservationDetailsDto reservationDetailsDto) throws Exception;

String deleteReservation(String resId, String roomId) throws Exception;
    
}
