/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package control;

import dto.CustomerDto;
import java.util.List;
import service.ServiceFactory;
import service.custom.CustomerService;

/**
 *
 * @author osand
 */
public class CustomerController {
    
    private final CustomerService customerService = (CustomerService) ServiceFactory.getInstance().getService(ServiceFactory.ServiceType.CUSTOMER);

    public String saveCustomer(CustomerDto customerDto) throws Exception {
        
        return customerService.saveCustomer(customerDto);
        
    }

    public List<CustomerDto> getAll() throws Exception {
        
        return customerService.getAll();
    }

    public String updateCustomer(CustomerDto customerDto) throws Exception {
        
        return customerService.updateCustomer(customerDto);
              
    }

    public CustomerDto getCustomer(String id) throws Exception {
       
        return customerService.getCustomer(id);
    }

    public String deleteCustomer(String id) throws Exception {
        
        return customerService.deleteCustomer(id);
    }
    
}