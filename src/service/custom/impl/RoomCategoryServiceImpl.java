/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service.custom.impl;

import dao.DaoFactory;
import dao.custom.RoomCategoryDao;
import dto.RoomCategoryDto;
import entity.RoomCategoryEntity;
import java.util.ArrayList;
import java.util.List;
import service.custom.RoomCategoryService;

/**
 *
 * @author osand
 */
public class RoomCategoryServiceImpl implements RoomCategoryService {

    RoomCategoryDao roomCategoryDao = (RoomCategoryDao)DaoFactory.getInstance().getDao(DaoFactory.DaoType.ROOMCATEGORY);
    
    @Override
    public String saveCategory(RoomCategoryDto roomCategoryDto) throws Exception  {
        
        RoomCategoryEntity roomCategoryEntity = new RoomCategoryEntity(
        
             
             roomCategoryDto.getCatName(),
             roomCategoryDto.getFbPrice(),
             roomCategoryDto.getHbPrice(),
             roomCategoryDto.getBbPrice()
        );
        
        if(roomCategoryDao.save(roomCategoryEntity)){
        
            return "Succes";
        
        }
        
        else{
        
        return "Fail";
        
        }
        
    
    }

    @Override
    public String deleteCategory(String id) throws Exception{
       
        if(roomCategoryDao.delete(id)){
        
            return "Succes";
        
        }
        
        else{
        
        return "Fail";
        
        }
    
    
    }

    @Override
    public String updateCategory(RoomCategoryDto roomCategoryDto) throws Exception {
        
    RoomCategoryEntity roomCategoryEntity = new RoomCategoryEntity(
        
             
             roomCategoryDto.getCatName(),
             roomCategoryDto.getFbPrice(),
             roomCategoryDto.getHbPrice(),
             roomCategoryDto.getBbPrice()
        );
        
        if(roomCategoryDao.update(roomCategoryEntity)){
        
            return "Succes";
        
        }
        
        else{
        
        return "Fail";
        
        }
    
    }

    @Override
    public RoomCategoryDto serchCategory(String id) throws Exception {
    
        RoomCategoryEntity t = roomCategoryDao.get(id);
        return new RoomCategoryDto(
            
             t.getCatName(),
             t.getFbPrice(),
             t.getHbPrice(),
             t.getBbPrice()
        
        );    
         
    }

    @Override
    public List<RoomCategoryDto> loadCategory() throws Exception {
 
     List<RoomCategoryDto> list = new ArrayList<>();
     List<RoomCategoryEntity> entitylist = roomCategoryDao.getAll();
     
     for(RoomCategoryEntity t : entitylist){
     
        list.add( new RoomCategoryDto(
              
             
             t.getCatName(),
             t.getFbPrice(),
             t.getHbPrice(),
             t.getBbPrice()
                
        ) );
     
     }
        return list;
    
    }

   
    
}
