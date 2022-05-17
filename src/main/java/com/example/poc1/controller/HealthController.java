package com.example.poc1.controller;


import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HealthController extends Poc1Controller{

    @GetMapping("/ping")
    public ResponseEntity<String> getHealth() {
        return ResponseEntity.status(200).body("Pong -> svc 1");
    }

}
