/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao.custom.impl;

import dao.CrudUtil;
import dao.custom.ReservationDetailsDao;
import entity.ReservationDetailsEntity;
import java.sql.ResultSet;
import java.util.List;

/**
 *
 * @author osand
 */
public class ReservationDetailsDaoImpl implements ReservationDetailsDao {

    @Override
    public boolean save(ReservationDetailsEntity t) throws Exception {
    
         return CrudUtil.executeUpdate("INSERT INTO reservation_details VALUES(?,?,?,?,?,?)",
                 
                t.getResId(),
                t.getRoomId(),
                t.getInDate(),
                t.getOutDate(),
                t.getPakage(),
                t.getPrice()
                 
         );   
    
    
    }

    @Override
    public boolean update(ReservationDetailsEntity t) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean delete(String id) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public ReservationDetailsEntity get(String id) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List<ReservationDetailsEntity> getAll() throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean availability(ReservationDetailsEntity t) throws Exception {
    
        ResultSet rst = CrudUtil.executeQuery("SELECT * FROM reservation_details WHERE NOT(? >= outDate OR ? <= inDate) AND roomId=?",
                
                t.getInDate(),
                t.getOutDate(),               
                t.getRoomId()
        );
        
        if (rst.next()) {
    
            return false;
            
        } else {
    
            return true;
            
        }
         
              
    }    
      
   
    
}
