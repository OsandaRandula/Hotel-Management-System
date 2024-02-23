/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

import java.util.Date;

/**
 *
 * @author osand
 */
public class ReservationEntity {
    
    
 private String  resID;
 private Date date;
 private Double totalPrice;
 private Integer custID;

    public ReservationEntity() {
    }

    public ReservationEntity(String  resID, Date date, Double totalPrice, Integer custID) {
        this.resID = resID;
        this.date = date;
        this.totalPrice = totalPrice;
        this.custID = custID;
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
     * @return the totalPrice
     */
    public Double getTotalPrice() {
        return totalPrice;
    }

    /**
     * @param totalPrice the totalPrice to set
     */
    public void setTotalPrice(Double totalPrice) {
        this.totalPrice = totalPrice;
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

    @Override
    public String toString() {
        return "ReservationEntity{" + "resID=" + resID + ", date=" + date + ", totalPrice=" + totalPrice + ", custID=" + custID + '}';
    }
 
 
    
}
