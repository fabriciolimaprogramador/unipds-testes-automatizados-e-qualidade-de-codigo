package br.dev.fabricio.calculadora;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

class DescontoServiceTest {

  private final DescontoService descontoService = new DescontoService();

  @Test
  void deveAplicarDescontoQuandoValorForMaiorQue100() {
    BigDecimal total = new BigDecimal("150.00");

    BigDecimal resultado = descontoService.aplicarDesconto(total);

    Assertions.assertEquals(resultado, new BigDecimal("135.000"));

  }

}