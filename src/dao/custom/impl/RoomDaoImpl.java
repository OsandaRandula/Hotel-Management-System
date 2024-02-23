/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao.custom.impl;

import dao.CrudUtil;
import dao.custom.RoomDao;
import entity.RoomEntity;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author osand
 */
public class RoomDaoImpl implements RoomDao {

    @Override
    public boolean save(RoomEntity t) throws Exception {
    
    return CrudUtil.executeUpdate("INSERT INTO room VALUES(?,?,?,?,?,?,?)",
                 t.getRoomId(),
                 t.getFloor(),
                 t.getFloorArea(),
                 t.getBedType(),
                 t.getAc(),
                 t.getAttachedBathrooms(),
                 t.getCatID()
                 
         );     
    
    }

    @Override
    public boolean update(RoomEntity t) throws Exception {
        
        return CrudUtil.executeUpdate("UPDATE room set floor=?, floorArea=?,bedType=?,ac=?,attachedBathrooms=?,catID=? WHERE roomId=?",
                 
                 t.getFloor(),
                 t.getFloorArea(),
                 t.getBedType(),
                 t.getAc(),
                 t.getAttachedBathrooms(),
                 t.getCatID(),
                 t.getRoomId()
                 
         );     
    
    
    
    }

    @Override
    public boolean delete(String id) throws Exception {
        
         return CrudUtil.executeUpdate("DELETE FROM room WHERE roomId= ?", id);
    
    }

    @Override
    public RoomEntity get(String id) throws Exception {
       
      ResultSet rst = CrudUtil.executeQuery("SELECT * FROM room WHERE roomId= ?", id);
      while(rst.next()){
      
      return new RoomEntity(
              
              rst.getString("roomId"),
              rst.getInt("floor"),
              rst.getDouble("floorArea"),
              rst.getString("bedType"),
              rst.getString("ac"),
              rst.getString("attachedBathrooms"),
              rst.getString("catID")
                       
      );
      
      
      
      }
      
      return null;
        
    }

    @Override
    public List<RoomEntity> getAll() throws Exception {
       
      List<RoomEntity> list = new ArrayList<>(); 
      ResultSet rst = CrudUtil.executeQuery("SELECT * FROM room ");
      while(rst.next()){
      
      list.add(new RoomEntity(
      
              rst.getString("roomId"),
              rst.getInt("floor"),
              rst.getDouble("floorArea"),
              rst.getString("bedType"),
              rst.getString("ac"),
              rst.getString("attachedBathrooms"),
              rst.getString("catID")
      
      ));
      
      }
    
      return list;
    
    }

    @Override
    public List<RoomEntity> getRoomsFromSpecificCategory(String category) throws Exception {
    
    
     List<RoomEntity> list = new ArrayList<>(); 
     ResultSet rst = CrudUtil.executeQuery("SELECT * FROM room WHERE catID = ?",category);
     
     
      while(rst.next()){
         
      list.add(new RoomEntity(
                  
              rst.getString("roomId"),
              rst.getInt("floor"),
              rst.getDouble("floorArea"),
              rst.getString("bedType"),
              rst.getString("ac"),
              rst.getString("attachedBathrooms"),
              rst.getString("catID")
      
      ));
      
      
      }
    
      return list;
      
    
    
    }
    
}
