package br.dev.fabricio.calculadora;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class CalculadoraTeste {

  @Test
  void soma() {
    double resultado = Calculadora.somar(2, 2);
    Assertions.assertEquals(4, resultado);
  }

  @Test
  void subtracao() {
    double resultado = Calculadora.subtrair(10, 5);
    Assertions.assertEquals(5, resultado);
  }

  @Test
  void multiplicacao() {
    double resultado = Calculadora.multiplicar(2, 2);
    Assertions.assertEquals(4, resultado);
  }

  @Test
  void divisao() {
    double resultado = Calculadora.dividir(10, 2);
    Assertions.assertEquals(5, resultado);
  }

  @Test
  void divisaoDoisValoresZeroResultadoEmNaN() {
    double resultado = Calculadora.dividir(0, 0);
    Assertions.assertEquals(Double.NaN, resultado);
  }

  @Test
  void divisaoPorZeroResultandoEmPositivoInfinito() {
    double resultado = Calculadora.dividir(10, 0);
    Assertions.assertEquals(Double.POSITIVE_INFINITY, resultado);
  }


}
