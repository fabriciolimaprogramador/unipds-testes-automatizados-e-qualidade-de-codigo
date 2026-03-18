package br.dev.fabricio.spotbugs;

import java.io.FileWriter;
import java.io.IOException;

public class ExemploSpotBugs {

  public void executa() throws IOException {
    FileWriter fileWriter = new FileWriter("arquivo.txt");
    fileWriter.write("Teste");

    String senha = "123456";
    if(senha == "123456"){
      System.out.println("Senha correta");
    }

    String texto = null;
    if(texto.equals("abc")){
      System.out.println("Texto é abc");
    }


  }

}
