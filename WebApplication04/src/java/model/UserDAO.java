/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author ADMIN
 */
public class UserDAO {
    ArrayList<UserDTO> uList;

    public UserDAO() {
        this.uList = new ArrayList<>();
        uList.add(new UserDTO("admin", "admin", "Administrator", "AD", true));
        uList.add(new UserDTO("user1", "123", "Hoa Hau TT", "US", true));
        uList.add(new UserDTO("user2", "345", "User 02", "US", true));
    }
    
    public boolean login(String userID, String password){
        for (UserDTO userDTO : uList) {
            if(userDTO.getUserID().equalsIgnoreCase(userID)
                    && userDTO.getPassword().equals(password)){
                return true;
            }
        }
        return false;
    }
    
    public UserDTO getUserByID(String id){
        for (UserDTO userDTO : uList) {
            if(userDTO.getUserID().equalsIgnoreCase(id)){
                return userDTO;
            }
        }
        return null;
    }
}

