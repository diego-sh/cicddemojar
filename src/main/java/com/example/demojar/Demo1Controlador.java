package com.example.demojar;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/demo1")
public class Demo1Controlador {

    @GetMapping("/holamundo")
    public ResponseEntity holamundo() {
        return ResponseEntity.ok(Boolean.TRUE);
    }

    @GetMapping("/numeroParImpar")
    public ResponseEntity holamundo(@RequestParam int numero) {

        return ResponseEntity.ok(this.metodoComplejo(numero));
    }

    private String metodoComplejo( int numero) {
       
            if (numero % 2 == 0) {
                return "Numero Par";
            } else {
                return "Numero Impar";
            }
        
    }
    
    private String metodoComplejo2( int numero) {
       
        if (numero % 2 == 0) {
            return "Numero Par";
        } else {
            return "Numero Impar";
        }
    
    }

}
