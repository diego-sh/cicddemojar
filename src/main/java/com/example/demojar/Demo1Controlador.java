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
        String aux = this.metodoComplejo2(3);
        return ResponseEntity.ok(this.metodoComplejo(numero));
    }

    private String metodoComplejo(int numero) {

        if (numero % 2 == 0) {
            return "Numero Par";
        } else {
            return "Numero Impar";
        }

    }

    private String metodoComplejo2(int numero) {
        String a = "";
        switch (numero) {
            case 1:
                a = "da";
                break;

            case 2:
                a = "da";
                break;
            case 3:
                a = "da";
                break;
            case 4:
                a = "da";
                break;
            case 5:
                a = "da";
                break;
            case 6:
                a = "da";
                break;
            case 7:
                a = "da";
                break;
            case 8:
                a = "da";
                break;
        }
        ;

        if (numero % 2 == 0) {
            return "Numero Par";
        } else {
            return "Numero Impar";
        }

    }

}
