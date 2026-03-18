package br.dev.fabricio.calculadora;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.ArrayList;
import java.util.List;

@ExtendWith(MockitoExtension.class)
public class SpyTeste {

  @Test
  void exemploDeSpyComLista(){
    List<String> listaReal = new ArrayList<>();
    List<String> spyList = Mockito.spy(listaReal);

    spyList.add("Java");
    spyList.add("JUnit");

    Mockito.verify(spyList).add("Java");
    Mockito.verify(spyList).add("JUnit");

    Assertions.assertThat(spyList).hasSize(2).contains("Java","JUnit");
  }



}
