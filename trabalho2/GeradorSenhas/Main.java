package GeradorSenhas;

import java.util.List;

// Requisito: existe o Main e a lógica numa classe separada.
// Especificação:
// Dado que eu defina um dicionário de caracteres, ex: letras, números, símbolos, etc, eu possa gerar uma senha de um tamanho definido.
public class Main {

  public static void main(String[] args) {
    Logica.possibleChars = List.of('a','b','c');
    System.out.println(Logica.gerador(10));
  }
  
}