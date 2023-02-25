package com.example.sql_learning;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserService userService;

    @PostMapping("/addUser")
    public String addUser(@RequestBody() User user) {
        try{
           userService.addUser(user);
        } catch (Exception e){
            return "User already exists";
        }
        return "User added successfully";
    }
    @GetMapping("/getUser")
    public User getUser(@RequestParam("id") int id) {
        return userService.getUser(id);
    }

    @GetMapping("/getAllUsers")
    public List<User> getAllUsers() {
        return userService.getAllUsers();
    }
}
