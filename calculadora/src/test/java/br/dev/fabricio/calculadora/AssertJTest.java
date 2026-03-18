package br.dev.fabricio.calculadora;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class AssertJTest {

  @Test
  void exemplo(){
    String nome = "Ana Maria Ribeiro";

    Assertions.assertThat(nome)
            .isNotNull()
            .startsWith("Ana")
            .contains("Maria")
            .endsWith("Ribeiro");
  }

}
