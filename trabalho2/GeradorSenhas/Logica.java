package GeradorSenhas;
import java.util.List;
import java.util.Random;

class Logica {
  static List<Character> possibleChars;
  
  static String gerador(int length) {

    Random aleatorio = new Random();
    String senha = "";
    for (int i = 0; i < length; i++) {
      
      senha += possibleChars.get(aleatorio.nextInt(possibleChars.size()));
    }

    return senha;
  }
}
