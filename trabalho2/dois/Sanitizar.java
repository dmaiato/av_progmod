package dois;

import java.util.ArrayList;
import java.util.List;

class Sanitizar {
  
  public static List<String> filtro = new ArrayList<>();

  static String censurar(String texto) {
    
    String retorno = texto;
    
    for (int i = 0; i < filtro.size(); i++) {

      String palavra = filtro.get(i);
      for (int j = 0; j < texto.length(); j++) {

        if (texto.indexOf(palavra) == j) {
          retorno = retorno.replace(palavra.substring(0, palavra.length()-1), "*".repeat(palavra.length()-1));
        }
      }
    }

    return retorno;

  }

  static String censurar(String texto, int limite) {
    
    String retorno = texto;

    
    for (int i = 0; i < filtro.size(); i++) {
      String palavra = filtro.get(i);

      if (limite > palavra.length()) continue;
            
      String nomeTrocado = "*".repeat(palavra.length()-limite) + palavra.substring(palavra.length()-limite);
      // for (int j = 0; j < palavra.length()-limite; j++) {
      //   nomeTrocado = nomeTrocado.replace(palavra, "*".repeat(palavra.length()-limite));
      //   nomeTrocado += palavra.charAt(palavra.length()-1);
      // }
      //.replace(palavra.substring(0, palavra.length()-limite), "*".repeat(palavra.length()-1));
              
      for (int j = 0; j < texto.length(); j++) {
        if (texto.indexOf(palavra) == j) {
          retorno = retorno.replace(palavra, nomeTrocado);
        }
      }
    }

    return retorno;

  }
  
}
