/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dto;

import java.util.Date;

/**
 *
 * @author osand
 */
public class ReservationDetailsDto {
    
    private String roomId;
    private Date inDate;
    private Date outDate;
    private String pakage;
    private String roomCategory;
    private Double price;

    public ReservationDetailsDto() {
    }

    public ReservationDetailsDto(String roomId, Date inDate, Date outDate, String pakage, String roomCategory, Double price) {
        this.roomId = roomId;
        this.inDate = inDate;
        this.outDate = outDate;
        this.pakage = pakage;
        this.roomCategory = roomCategory;
        this.price = price;
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
     * @return the roomCategory
     */
    public String getRoomCategory() {
        return roomCategory;
    }

    /**
     * @param roomCategory the roomCategory to set
     */
    public void setRoomCategory(String roomCategory) {
        this.roomCategory = roomCategory;
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
        return "ReservationDetailsDto{" + "roomId=" + roomId + ", inDate=" + inDate + ", outDate=" + outDate + ", pakage=" + pakage + ", roomCategory=" + roomCategory + ", price=" + price + '}';
    }
    

    
}
