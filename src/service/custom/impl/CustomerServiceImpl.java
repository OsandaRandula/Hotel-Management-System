/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service.custom.impl;

import dao.DaoFactory;
import dao.custom.CustomerDao;
import dto.CustomerDto;
import entity.CustomerEntity;
import java.util.ArrayList;
import java.util.List;
import service.custom.CustomerService;

/**
 *
 * @author osand
 */
public class CustomerServiceImpl implements CustomerService {
    
    CustomerDao customerDao = (CustomerDao) DaoFactory.getInstance().getDao(DaoFactory.DaoType.CUSTOMER);

    @Override
    public String saveCustomer(CustomerDto customerDto) throws Exception {
       
        CustomerEntity customerEntity = new CustomerEntity(
        
        customerDto.getId(),
        customerDto.getDesignation(),
        customerDto.getFirstName(),
        customerDto.getLastName(),
        customerDto.getAddress(),
        customerDto.getNic(),
        customerDto.getContact()
        );
        
        if(customerDao.save(customerEntity)){
        
            return "Scsess";
        }
        
        else {
        
            return "Fail";
        }
    }

    @Override
    public String updateCustomer(CustomerDto customerDto) throws Exception {
        
        CustomerEntity customerEntity = new CustomerEntity(
        
        customerDto.getId(),
        customerDto.getDesignation(),
        customerDto.getFirstName(),
        customerDto.getLastName(),
        customerDto.getAddress(),
        customerDto.getNic(),
        customerDto.getContact()
        );
        
        if(customerDao.update(customerEntity)){
        
            return "Scsess";
        }
        
        else {
        
            return "Fail";
        }
        
    }

    @Override
    public String deleteCustomer(String id) throws Exception {
        
        if(customerDao.delete(id)){
        
            return "Scsess";
        }
        
        else {
        
            return "Fail";
        }
        
    }

    @Override
    public CustomerDto getCustomer(String id) throws Exception {
        
        CustomerEntity customerEntity = customerDao.get(id);
       
       return new CustomerDto(
               
        customerEntity.getId(),
        customerEntity.getDesignation(),
        customerEntity.getFirstName(),
        customerEntity.getLastName(),
        customerEntity.getAddress(),
        customerEntity.getNic(),
        customerEntity.getContact()
       
       );
    }

    @Override
    public List<CustomerDto> getAll() throws Exception {
        
        List<CustomerDto> customerDtos = new ArrayList<>(); 
         List<CustomerEntity> customerEntities = customerDao.getAll();
        
       
        for (CustomerEntity entity : customerEntities) {
        customerDtos.add(new CustomerDto(entity.getId(),
        entity.getDesignation(),
        entity.getFirstName(),
        entity.getLastName(),
        entity.getAddress(),
        entity.getNic(),
        entity.getContact()));
        }
        return customerDtos;
        
        
    }
    
       
}
