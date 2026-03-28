package remington.euconfio.dto;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.Assert;

class CalculadoraTest {
    private Calculadora calculadora;

    public CalculadoraTest(){
        this.calculadora = new Calculadora();
    }

    // Suma de dos numeros 2 y 4, que den como resultado 6
    @Test
    public void sumaOk(){
        int numero1 = 2;
        int numero2 = 4;
        int resultado = 0;
        resultado = calculadora.suma(numero1,numero2);
        System.out.println(resultado);
        Assertions.assertEquals(6,resultado);
    }

    // Suma de dos numeros 2 y 4, que den como resultado 6
    @Test
    public void sumaFalse(){
        int numero1 = 0;
        int numero2 = 4;
        int resultado = 0;
        resultado = calculadora.suma(numero1,numero2);
        System.out.println(resultado);
        Assertions.assertNotEquals(6,resultado);
    }

    /// HOLA


}
