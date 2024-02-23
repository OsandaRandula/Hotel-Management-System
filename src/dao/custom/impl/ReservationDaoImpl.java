/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao.custom.impl;

import dao.CrudUtil;
import dao.custom.ReservationDao;
import entity.ReservationEntity;
import java.util.List;

/**
 *
 * @author osand
 */
public class ReservationDaoImpl implements ReservationDao {

    @Override
    public boolean save(ReservationEntity t) throws Exception {
        
        return CrudUtil.executeUpdate("INSERT INTO reservation VALUES(?,?,?,?)",
                
                t.getResID(),
                t.getDate(),
                t.getTotalPrice(),
                t.getCustID()
         );   
    
    
    }

    @Override
    public boolean update(ReservationEntity t) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean delete(String id) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public ReservationEntity get(String id) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List<ReservationEntity> getAll() throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
