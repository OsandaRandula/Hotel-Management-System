/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dto;

/**
 *
 * @author osand
 */
public class RoomCategoryDto {
    
    private String catName;
    private Double fbPrice;
    private Double hbPrice;
    private Double bbPrice;

    public RoomCategoryDto() {
    }

    public RoomCategoryDto(String catName, Double fbPrice, Double hbPrice, Double bbPrice) {
        this.catName = catName;
        this.fbPrice = fbPrice;
        this.hbPrice = hbPrice;
        this.bbPrice = bbPrice;
    }

    
    
    @Override
    public String toString() {
        return "RoomCategoryDto{" + "catName=" + getCatName() + ", fbPrice=" + getFbPrice() + ", hbPrice=" + getHbPrice() + ", bbPrice=" + getBbPrice() + '}';
    }

    /**
     * @return the catName
     */
    public String getCatName() {
        return catName;
    }

    /**
     * @param catName the catName to set
     */
    public void setCatName(String catName) {
        this.catName = catName;
    }

    /**
     * @return the fbPrice
     */
    public Double getFbPrice() {
        return fbPrice;
    }

    /**
     * @param fbPrice the fbPrice to set
     */
    public void setFbPrice(Double fbPrice) {
        this.fbPrice = fbPrice;
    }

    /**
     * @return the hbPrice
     */
    public Double getHbPrice() {
        return hbPrice;
    }

    /**
     * @param hbPrice the hbPrice to set
     */
    public void setHbPrice(Double hbPrice) {
        this.hbPrice = hbPrice;
    }

    /**
     * @return the bbPrice
     */
    public Double getBbPrice() {
        return bbPrice;
    }

    /**
     * @param bbPrice the bbPrice to set
     */
    public void setBbPrice(Double bbPrice) {
        this.bbPrice = bbPrice;
    }

  
    
    
           
    
}
