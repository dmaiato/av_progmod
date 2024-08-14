package GeradorMne;

public class gerador {
  
  static String geradorMne (String texto){
    String senha = "";

    String[] lista = texto.split(" ");

    for (String i: lista) {
      senha += i.charAt(0);
    }

    return senha;
  }
}
