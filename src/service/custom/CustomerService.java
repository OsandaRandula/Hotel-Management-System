/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package service.custom;

import dto.CustomerDto;
import java.util.List;
import service.SuperService;

/**
 *
 * @author osand
 */
public interface CustomerService extends SuperService {
    
    String saveCustomer(CustomerDto customerDto) throws Exception;
    String updateCustomer(CustomerDto customerDto) throws Exception;
    String deleteCustomer(String id) throws Exception;
    CustomerDto getCustomer(String id) throws Exception;
    List<CustomerDto> getAll() throws Exception; 
    
}
