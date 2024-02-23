/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package control;

import dto.RoomDto;
import java.util.List;
import service.ServiceFactory;
import service.custom.RoomService;

/**
 *
 * @author osand
 */
public class RoomController {
    
    private final RoomService roomService = (RoomService) ServiceFactory.getInstance().getService(ServiceFactory.ServiceType.ROOM);

   

    public String saveRoom(RoomDto roomDto) throws Exception {
        
        return roomService.saveRoom(roomDto);
    
    }  

    public String updateRoom(RoomDto roomDto) throws Exception {
        
        return roomService.updateRoom(roomDto);
        
    }

    public String deleteRoom(String id) throws Exception  {
        
        return roomService.deleteRoom(id);
    
    }

    public RoomDto serchRoom(String id) throws Exception {
        
        return roomService.searchRoom(id);
    }

    public List<RoomDto> loadRoom() throws Exception {
    
        return roomService.loadRoom();
    
    }

    public List<RoomDto> getRoomsFromSpecificCategory(String category) throws Exception {
        
     
        return roomService.getRoomsFromSpecificCategory(category);
    
    }
    
}
