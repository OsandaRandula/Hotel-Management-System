/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

/**
 *
 * @author osand
 */
public class RoomEntity {
    
    private String roomId ;
    private Integer floor ;
    private Double floorArea;
    private String bedType ;
    private String ac ;
    private String attachedBathrooms ;
    private String catID ;

    public RoomEntity() {
    }

    public RoomEntity(String roomId, Integer floor, Double floorArea, String bedType, String ac, String attachedBathrooms, String catID) {
        this.roomId = roomId;
        this.floor = floor;
        this.floorArea = floorArea;
        this.bedType = bedType;
        this.ac = ac;
        this.attachedBathrooms = attachedBathrooms;
        this.catID = catID;
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
     * @return the floor
     */
    public Integer getFloor() {
        return floor;
    }

    /**
     * @param floor the floor to set
     */
    public void setFloor(Integer floor) {
        this.floor = floor;
    }

    /**
     * @return the floorArea
     */
    public Double getFloorArea() {
        return floorArea;
    }

    /**
     * @param floorArea the floorArea to set
     */
    public void setFloorArea(Double floorArea) {
        this.floorArea = floorArea;
    }

    /**
     * @return the bedType
     */
    public String getBedType() {
        return bedType;
    }

    /**
     * @param bedType the bedType to set
     */
    public void setBedType(String bedType) {
        this.bedType = bedType;
    }

    /**
     * @return the ac
     */
    public String getAc() {
        return ac;
    }

    /**
     * @param ac the ac to set
     */
    public void setAc(String ac) {
        this.ac = ac;
    }

    /**
     * @return the attachedBathrooms
     */
    public String getAttachedBathrooms() {
        return attachedBathrooms;
    }

    /**
     * @param attachedBathrooms the attachedBathrooms to set
     */
    public void setAttachedBathrooms(String attachedBathrooms) {
        this.attachedBathrooms = attachedBathrooms;
    }

    /**
     * @return the catID
     */
    public String getCatID() {
        return catID;
    }

    /**
     * @param catID the catID to set
     */
    public void setCatID(String catID) {
        this.catID = catID;
    }

    @Override
    public String toString() {
        return "RoomEntity{" + "roomId=" + roomId + ", floor=" + floor + ", floorArea=" + floorArea + ", bedType=" + bedType + ", ac=" + ac + ", attachedBathrooms=" + attachedBathrooms + ", catID=" + catID + '}';
    }
    
    
    
}
