/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;

import service.custom.impl.CustomerServiceImpl;
import service.custom.impl.ReservationServiceImpl;
import service.custom.impl.RoomCategoryServiceImpl;
import service.custom.impl.RoomServiceImpl;

/**
 *
 * @author osand
 */
public class ServiceFactory {
    
    
    private static ServiceFactory serviceFactory;
    
    private ServiceFactory(){}
    
    public static ServiceFactory getInstance(){
        if(serviceFactory == null){
            serviceFactory = new ServiceFactory();
        }
        
        return serviceFactory;
    }
    
    public SuperService getService(ServiceType type){
        switch (type) {
            case CUSTOMER:
                return new CustomerServiceImpl();
                
            case ROOMCATEGORY:
                return new RoomCategoryServiceImpl();
                
            case ROOM:
                return new RoomServiceImpl();
                
            case RESERVATION:
                return new ReservationServiceImpl();
                
            default:
                return null;
        }
    }
    
    public enum ServiceType{
        CUSTOMER, ROOMCATEGORY,ROOM,RESERVATION
    }

}
    

