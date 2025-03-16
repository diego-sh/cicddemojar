package com.example.demojar;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/demo1")
public class Demo1Controlador {

    @GetMapping("/holamundo")
    public ResponseEntity holamundo() {
        return ResponseEntity.ok(Boolean.TRUE);
    }

}
