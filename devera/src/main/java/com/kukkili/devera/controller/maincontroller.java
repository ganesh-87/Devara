package com.kukkili.devera.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins="*")
public class maincontroller {

    @GetMapping("/hello")
    public ResponseEntity<String> endpoint(){
       return ResponseEntity.ok("HEllo Ganesh");
    }
}
