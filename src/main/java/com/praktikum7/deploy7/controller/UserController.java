package com.praktikum7.deploy7.controller;

import com.praktikum7.deploy7.model.User;
import com.praktikum7.deploy7.services.UserServices;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/users")
public class UserController {

    private final UserServices userServices;

    public UserController(UserServices userServices) {
        this.userServices = userServices;
    }
    @PostMapping
    public String createUser(@RequestBody User request) {
        userServices.addUser(request);
        return "User created successfully";
    }


}