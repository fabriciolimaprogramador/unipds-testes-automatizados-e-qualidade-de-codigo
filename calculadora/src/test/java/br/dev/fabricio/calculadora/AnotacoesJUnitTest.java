package br.dev.fabricio.calculadora;

import org.junit.jupiter.api.*;

public class AnotacoesJUnitTest {

  @BeforeAll
  static void preCondicaoPorTodosOsTestes(){
    //Inicializações de recursos como kafka , banco, docker
    System.out.println("Executou a precondicao antes de todos os testes");
  }

  @AfterAll
  static void posCondicaoPorTodosOsTestes(){
    System.out.println("Executou a poscondicao depois de todos os testes");
  }


  @BeforeEach
  void preCondicaoPorTeste(){
    //Inicialização de recursos por teste, inserir algum dado especifico no banco
    System.out.println("Executou a precondicao por teste");
  }

  @AfterEach
  void posCondicaoPorTeste(){
    System.out.println("Executou a poscondicao por teste");
  }



  @Test
  void aMeuTeste(){
    System.out.println("Executou teste A");
  }

  @Test
  void bMeuTeste(){
    System.out.println("Executou teste B");
  }

  @Test
  void cMeuTeste(){
    System.out.println("Executou teste C");
  }



}
