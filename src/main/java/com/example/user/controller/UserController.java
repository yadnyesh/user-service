package com.example.user.controller;

import com.example.user.entity.User;
import com.example.user.service.UserService;
import com.example.user.valueobjects.ResponseTemplateVO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
@Slf4j
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("")
    public User saveUser(@RequestBody User user) {
        log.info("USER CONTROLLER - saveUser: " + user.toString());
        return userService.saveUser(user);
    }

    @GetMapping("/{id}")
    public ResponseTemplateVO getUserByDepartment(@PathVariable("id") Long userId) {
        return userService.getUserByDepartment(userId);
    }


}
