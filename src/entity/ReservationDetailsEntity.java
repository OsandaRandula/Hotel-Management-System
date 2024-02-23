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
public class ReservationDetailsEntity {
    
    private String resId;
    private String roomId;
    private Date inDate;
    private Date outDate;
    private String pakage;
    private Double price;

    public ReservationDetailsEntity() {
    }

    public ReservationDetailsEntity(String resId, String roomId, Date inDate, Date outDate, String pakage, Double price) {
        this.resId = resId;
        this.roomId = roomId;
        this.inDate = inDate;
        this.outDate = outDate;
        this.pakage = pakage;
        this.price = price;
    }

    /**
     * @return the resId
     */
    public String getResId() {
        return resId;
    }

    /**
     * @param resId the resId to set
     */
    public void setResId(String resId) {
        this.resId = resId;
    }

    /**
     * @return the roomId
     */
    public String getRoomId() {
        return roomId;
    }

    /**
     * @param roomId the roomId to set
     */
    public void setRoomId(String roomId) {
        this.roomId = roomId;
    }

    /**
     * @return the inDate
     */
    public Date getInDate() {
        return inDate;
    }

    /**
     * @param inDate the inDate to set
     */
    public void setInDate(Date inDate) {
        this.inDate = inDate;
    }

    /**
     * @return the outDate
     */
    public Date getOutDate() {
        return outDate;
    }

    /**
     * @param outDate the outDate to set
     */
    public void setOutDate(Date outDate) {
        this.outDate = outDate;
    }

    /**
     * @return the pakage
     */
    public String getPakage() {
        return pakage;
    }

    /**
     * @param pakage the pakage to set
     */
    public void setPakage(String pakage) {
        this.pakage = pakage;
    }

    /**
     * @return the price
     */
    public Double getPrice() {
        return price;
    }

    /**
     * @param price the price to set
     */
    public void setPrice(Double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "ReservationDetailsEntity{" + "resId=" + resId + ", roomId=" + roomId + ", inDate=" + inDate + ", outDate=" + outDate + ", pakage=" + pakage + ", price=" + price + '}';
    }
    
    
}
