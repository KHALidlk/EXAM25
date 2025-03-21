package com.example.exam25.Controler;

import com.example.exam25.Entity.User;
import com.example.exam25.Service.Userservice;
import jakarta.inject.Named;

@Named("userBean")
public class UserController {
    private Userservice userService = new Userservice();
private User user=new User();
    public void addUser(User user) {
        userService.ajouterUser(user);
    }

    // You can add more methods to handle other operations, such as retrieving, updating, or deleting users
}