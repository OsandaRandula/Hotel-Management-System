/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao.custom.impl;

import dao.CrudUtil;
import dao.custom.RoomCategoryDao;
import entity.RoomCategoryEntity;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author osand
 */
public class RoomCategoryDaoImpl implements RoomCategoryDao {

    @Override
    public boolean save(RoomCategoryEntity t) throws Exception {
        
        return CrudUtil.executeUpdate("INSERT INTO room_category VALUES(?,?,?,?)",
                               
                t.getCatName(),
                t.getFbPrice(),
                t.getHbPrice(),
                t.getBbPrice()
         );     
    
    }

    @Override
    public boolean update(RoomCategoryEntity t) throws Exception {
 
    
        return CrudUtil.executeUpdate("UPDATE room_category set FbPrice=?,HbPrice=?,BbPrice=? WHERE CatID=? ",
                 
      
               
                t.getFbPrice(),
                t.getHbPrice(),
                t.getBbPrice(),
                t.getCatName()
                
         );    
    
    }

    @Override
    public boolean delete(String id) throws Exception {
 
        return CrudUtil.executeUpdate("DELETE FROM room_category WHERE CatID=?", id);
    
    }

    @Override
    public RoomCategoryEntity get(String id) throws Exception {
      
      ResultSet rst = CrudUtil.executeQuery("SELECT * FROM room_category WHERE CatID= ?", id);
      while(rst.next()){
      
      return new RoomCategoryEntity(
                       
              
              rst.getString("CatID"),
              rst.getDouble("FbPrice"),
              rst.getDouble("HbPrice"),
              rst.getDouble("BbPrice")
                       
      );
      
      }
      
      return null;
    
    }

    @Override
    public List<RoomCategoryEntity> getAll() throws Exception {
   
      List<RoomCategoryEntity> list = new ArrayList<>();
      ResultSet rst = CrudUtil.executeQuery("SELECT * FROM room_category");
      while(rst.next()){
      
       list.add(new RoomCategoryEntity(          
              
              rst.getString("CatID"),
              rst.getDouble("FbPrice"),
              rst.getDouble("HbPrice"),
              rst.getDouble("BbPrice")
                       
      ));
      
      }
    
      return list;
    
    }
    
}
