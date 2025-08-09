package com.demo.demo.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.*;

@RestController
@RequestMapping("user")
public class UserController {

    @GetMapping("afficher")
    public String user(){
        return "Hey nour";
    }
    @GetMapping("users")
    public ResponseEntity<Map<String,Object>> getUser(){
        Map<String,Object> response= new HashMap<>();
        response.put("status","ok");
        List<String> users= new ArrayList<>();
        users.add("john");
        users.add("john");
        users.add("mary");
        users.add("jane");
        Set<String> users1= new HashSet<>();
        users1.add("john");
        users1.add("john");
        users1.add("mary");
        users1.add("jane");
        response.put("data",users);
        response.put("data2",users1);
        return ResponseEntity.ok(response);
    }
}
