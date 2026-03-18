package br.dev.fabricio.calculadora;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

class DescontoServiceTestComAssertJ {

  private final DescontoService descontoService = new DescontoService();

  @Test
  void deveAplicarDescontoQuandoValorForMaiorQue100() {
    BigDecimal total = new BigDecimal("150.00");

    BigDecimal valorComDesconto = descontoService.aplicarDesconto(total);

    Assertions.assertThat(valorComDesconto).isEqualByComparingTo("135.00");


  }

  @Test
  void naoDeveAplicarDescontoQuandoValorForMaiorQue100() {
    BigDecimal total = new BigDecimal("100.00");

    BigDecimal valorSemDesconto = descontoService.aplicarDesconto(total);

    Assertions.assertThat(valorSemDesconto).isEqualByComparingTo(total);


  }


}