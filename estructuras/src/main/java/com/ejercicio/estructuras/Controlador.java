package com.ejercicio.estructuras;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;



@RestController
public class Controlador {
@PostMapping("/parImpar")
public String ejercicio1(@RequestParam int numero) {
    String ret = " ";
    ret = numero % 2 == 0?"par":"impar";
    return ret;
}
@PostMapping("/tablaMultiplicar")
public String postMethodName(@RequestParam int numero) {
    int resultado = 0;
    String devolver = " ";
    for (int i = 1 ; i <= 10 ; i++ ){
        resultado = numero * i;
        devolver += numero + "x" + i + "=" + resultado + "<br>";
    }
        return devolver;
    
    
}



}
