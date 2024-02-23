/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package service.custom;

import dto.RoomDto;
import java.util.List;
import service.SuperService;

/**
 *
 * @author osand
 */
public interface RoomService extends SuperService{

    public String saveRoom(RoomDto roomDto) throws Exception;

    public String updateRoom(RoomDto roomDto) throws Exception;

    public String deleteRoom(String id) throws Exception;

    public RoomDto searchRoom(String id) throws Exception;

    public List<RoomDto> loadRoom() throws Exception;

    public List<RoomDto> getRoomsFromSpecificCategory(String category) throws Exception;
    
}
