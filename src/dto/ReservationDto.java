/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dto;

import java.util.Date;
import java.util.List;

/**
 *
 * @author osand
 */
public class ReservationDto {
    
    private String resID;
    private Date date;
    private Integer custID;
    private List<ReservationDetailsDto> reservationDetailsList;

    public ReservationDto() {
    }

    public ReservationDto(String resID, Date date, Integer custID, List<ReservationDetailsDto> reservationDetailsList) {
        this.resID = resID;
        this.date = date;
        this.custID = custID;
        this.reservationDetailsList = reservationDetailsList;
    }

    /**
     * @return the resID
     */
    public String getResID() {
        return resID;
    }

    /**
     * @param resID the resID to set
     */
    public void setResID(String resID) {
        this.resID = resID;
    }

    /**
     * @return the date
     */
    public Date getDate() {
        return date;
    }

    /**
     * @param date the date to set
     */
    public void setDate(Date date) {
        this.date = date;
    }

    /**
     * @return the custID
     */
    public Integer getCustID() {
        return custID;
    }

    /**
     * @param custID the custID to set
     */
    public void setCustID(Integer custID) {
        this.custID = custID;
    }

    /**
     * @return the reservationDetailsList
     */
    public List<ReservationDetailsDto> getReservationDetailsList() {
        return reservationDetailsList;
    }

    /**
     * @param reservationDetailsList the reservationDetailsList to set
     */
    public void setReservationDetailsList(List<ReservationDetailsDto> reservationDetailsList) {
        this.reservationDetailsList = reservationDetailsList;
    }

    @Override
    public String toString() {
        return "ReservationDto{" + "resID=" + resID + ", date=" + date + ", custID=" + custID + ", reservationDetailsList=" + reservationDetailsList + '}';
    }

   
     
}
