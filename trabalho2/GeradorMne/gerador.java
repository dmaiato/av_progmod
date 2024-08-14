package GeradorMne;

import java.util.Arrays;
import java.util.List;

public class gerador {
  
  static String geradorMne (String texto){
    String senha = "";

    List<String> lista = List.of(texto.split(" "));

    for (String i: lista) {
      senha += i.charAt(0);
    }

    return senha;

  }

}
