/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service.custom.impl;

import dao.DaoFactory;
import dao.custom.RoomDao;
import dto.RoomDto;
import entity.RoomEntity;
import java.util.ArrayList;
import java.util.List;
import service.custom.RoomService;

/**
 *
 * @author osand
 */
public class RoomServiceImpl implements RoomService{

     RoomDao roomDao = (RoomDao) DaoFactory.getInstance().getDao(DaoFactory.DaoType.ROOM);

    
    @Override
    public String saveRoom(RoomDto roomDto) throws Exception {
        
       RoomEntity t = new RoomEntity(
       
               roomDto.getRoomId(),
               roomDto.getFloor(),
               roomDto.getFloorArea(),
               roomDto.getBedType(),
               roomDto.getAc(),
               roomDto.getAttachedBathrooms(),
               roomDto.getCatID()
      
       );
       
       if(roomDao.save(t)){
       
       return "Success";
       
       }
       else{
       
       return "Fail";
       }
    }

    @Override
    public String updateRoom(RoomDto roomDto) throws Exception {
    
    RoomEntity t = new RoomEntity(
       
               roomDto.getRoomId(),
               roomDto.getFloor(),
               roomDto.getFloorArea(),
               roomDto.getBedType(),
               roomDto.getAc(),
               roomDto.getAttachedBathrooms(),
               roomDto.getCatID()
      
       );
       
       if(roomDao.update(t)){
       
       return "Success";
       
       }
       else{
       
       return "Fail";
       }
    
    }

    @Override
    public String deleteRoom(String id) throws Exception {
       
        if(roomDao.delete(id)){
       
        return "Success";
       
       }
       else{
       
        return "Fail";
       }  
    }

    @Override
    public RoomDto searchRoom(String id) throws Exception {
    
    RoomEntity t = roomDao.get(id);
    
        return new RoomDto(
        
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
    public List<RoomDto> loadRoom() throws Exception {
    
        List<RoomEntity> roomEntityList = roomDao.getAll();
        List<RoomDto> roomDtoList = new ArrayList<>();
        
        for(RoomEntity t:roomEntityList){
        
   
            roomDtoList.add(new RoomDto(
            
               t.getRoomId(),
               t.getFloor(),
               t.getFloorArea(),
               t.getBedType(),
               t.getAc(),
               t.getAttachedBathrooms(),
               t.getCatID()  
            
            
            ));
        
        }
    
        return roomDtoList;
    }

    @Override
    public List<RoomDto> getRoomsFromSpecificCategory(String category) throws Exception {
    
        List<RoomEntity> roomEntityList = roomDao.getRoomsFromSpecificCategory(category);
        
        List<RoomDto> roomDtoList = new ArrayList<>();
        
        for(RoomEntity t:roomEntityList){
        
   
            roomDtoList.add(new RoomDto(
            
               t.getRoomId(),
               t.getFloor(),
               t.getFloorArea(),
               t.getBedType(),
               t.getAc(),
               t.getAttachedBathrooms(),
               t.getCatID()  
            
            
            ));
        
        }
    
        return roomDtoList;
          
    }
    
    
     
    
}
