package remington.euconfio.dto;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;


public class Calculadora {
    public Calculadora(){
    }

    public int suma(int numero1, int numero2){
        return numero1 + numero2;
    }

    public String saludMetodo() {
        return "OK";
    }

    public int resta(int numero1, int numero2){
        return numero1 - numero2;
    }

    public int multiplicacion(int numero1, int numero2){
        return numero1 * numero2;
    }

    public int division(int numero1, int numero2){
        return numero1 / numero2;
    }

}




/*
* JAVA - habilidades blandas
* GIT
* Infra - websocket
* DevOps
* Testing
* Ing software
*/