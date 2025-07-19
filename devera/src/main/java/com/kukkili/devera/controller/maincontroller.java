package com.kukkili.devera.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins="*")
public class maincontroller {

    @GetMapping("/hello")
    public ResponseEntity<String> endpoint(){
       return ResponseEntity.ok("HEllo Ganesh");
    }
    @GetMapping("/{id}")
    public ResponseEntity<String> number(@PathVariable Integer id){
        return ResponseEntity.ok("Your entered id is "+id);
    }
}
