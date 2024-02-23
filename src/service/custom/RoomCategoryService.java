/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package service.custom;

import dto.RoomCategoryDto;
import java.util.List;
import service.SuperService;

/**
 *
 * @author osand
 */
public interface RoomCategoryService extends SuperService{
    
    String saveCategory(RoomCategoryDto roomCategoryDto)throws Exception;
    String deleteCategory(String id)throws Exception; 
    String updateCategory(RoomCategoryDto roomCategoryDto)throws Exception;
    RoomCategoryDto serchCategory(String id)throws Exception;
    List<RoomCategoryDto> loadCategory()throws Exception;
     
}
