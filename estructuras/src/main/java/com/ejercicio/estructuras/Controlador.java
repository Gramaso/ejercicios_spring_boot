package com.ejercicio.estructuras;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@RestController
public class Controlador {
@PostMapping("/parImpar")
public String ejercicio1(@RequestParam int numero) {
    String ret = " ";
    if(numero%2 == 0){
        ret = "par";
    } else {
        ret = "impar";
    }
    return ret;
}


}
