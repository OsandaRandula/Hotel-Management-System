/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package control;

import dto.RoomCategoryDto;
import java.util.List;
import service.ServiceFactory;
import service.custom.RoomCategoryService;

/**
 *
 * @author osand
 */
public class RoomCategoryController {
    
    private final RoomCategoryService roomCategoryService = (RoomCategoryService) ServiceFactory.getInstance().getService(ServiceFactory.ServiceType.ROOMCATEGORY);

    public String saveCategory(RoomCategoryDto roomCategoryDto) throws Exception {
        
     return roomCategoryService.saveCategory(roomCategoryDto);
    }

    public String deleteCategory(String id) throws Exception {
      return roomCategoryService.deleteCategory(id);
    }

    public String updateCategory(RoomCategoryDto roomCategoryDto) throws Exception {
        return roomCategoryService.updateCategory(roomCategoryDto);
                
    }

    public RoomCategoryDto serchCategory(String id) throws Exception {
       
        return roomCategoryService.serchCategory(id);
    }

    public List<RoomCategoryDto> loadCategory() throws Exception {

        return roomCategoryService.loadCategory();
    }
    
}
