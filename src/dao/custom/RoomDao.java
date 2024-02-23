/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package dao.custom;

import dao.CrudDao;
import entity.RoomEntity;
import java.util.List;

/**
 *
 * @author osand
 */
public interface RoomDao extends CrudDao<RoomEntity , String> {

     public List<RoomEntity> getRoomsFromSpecificCategory(String category) throws Exception;
    
}
