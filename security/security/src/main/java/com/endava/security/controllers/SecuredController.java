package com.endava.security.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1.0/users")
public class SecuredController {
    @GetMapping("/count")
    public ResponseEntity<String> method1(){
        return ResponseEntity.ok("Metodo publico");
    }
    @GetMapping()
    public ResponseEntity<String> method2(){
        return ResponseEntity.ok("Metodo privado solo para administradores");
    }
    @GetMapping("/{id}")
    public ResponseEntity<String> method3(@PathVariable String id){
        return ResponseEntity.ok("Metodo privado solo para el usuario");
    }
}
