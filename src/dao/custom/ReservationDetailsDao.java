/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package dao.custom;

import dao.CrudDao;
import entity.ReservationDetailsEntity;

/**
 *
 * @author osand
 */
public interface ReservationDetailsDao extends CrudDao < ReservationDetailsEntity , String> {

    boolean availability(ReservationDetailsEntity t) throws Exception;
    
}
