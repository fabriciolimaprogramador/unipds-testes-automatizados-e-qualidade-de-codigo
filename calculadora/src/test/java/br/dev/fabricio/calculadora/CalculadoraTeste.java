package br.dev.fabricio.calculadora;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculadoraTeste {


  @Test
  void soma(){
    double resultado = Calculadora.somar(2,2);
    Assertions.assertEquals(4, resultado);
  }

}
