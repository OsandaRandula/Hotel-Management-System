/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao.custom.impl;

import dao.CrudUtil;
import dao.custom.CustomerDao;
import entity.CustomerEntity;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author osand
 */
public class CustomerDaoImpl implements CustomerDao {

    @Override
    public boolean save(CustomerEntity t) throws Exception {
        
         return CrudUtil.executeUpdate("INSERT INTO customer VALUES(?,?,?,?,?,?,?)",
                 t.getId(),
                 t.getDesignation(),
                 t.getFirstName(),
                 t.getLastName(),
                 t.getAddress(),
                 t.getNic(),
                 t.getContact()   
         );     
                
    }

    @Override
    public boolean update(CustomerEntity t) throws Exception {
       
        return CrudUtil.executeUpdate("UPDATE customer set designation=?,firstName=?, lastName=?,address=?,nic=?,contact=? WHERE id=?", 
                
                 t.getDesignation(),
                 t.getFirstName(),
                 t.getLastName(),
                 t.getAddress(),
                 t.getNic(),
                 t.getContact(),
                 t.getId()
                
                );
        
    }

    @Override
    public boolean delete(String id) throws Exception {
        return CrudUtil.executeUpdate("DELETE FROM customer WHERE id=?", id);
    }

    @Override
    public CustomerEntity get(String id) throws Exception {
        
         ResultSet rst = CrudUtil.executeQuery("SELECT * FROM customer WHERE id = ?", Integer.valueOf(id));
      while(rst.next()){
      
      return new CustomerEntity(
              
              
              rst.getInt("id"),
              rst.getString("designation"),
              rst.getString("firstName"),
              rst.getString("lastName"),
              rst.getString("address"),
              rst.getString("nic"),
              rst.getString("contact")
                       
      
      );
      
      }
      
      return null;
        
    }

    @Override
    public List<CustomerEntity> getAll() throws Exception {
        
        ResultSet rst = CrudUtil.executeQuery("SELECT * from customer");
        
        List<CustomerEntity> customerEntities = new ArrayList<>();
        
        while(rst.next()){ customerEntities.add(new CustomerEntity(
              
              
              rst.getInt("id"),
              rst.getString("designation"),
              rst.getString("firstName"),
              rst.getString("lastName"),
              rst.getString("address"),
              rst.getString("nic"),
              rst.getString("contact")
                       
      
      ));
        
        }
        
        return customerEntities;
        
    }
    
}
