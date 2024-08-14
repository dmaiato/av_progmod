package dois;

import java.util.List;

public class Main {

  public static void main(String[] args) {
    String texto = "acordar cedo na segunda-feira é uma droga, realmente uma porcaria, um lixo";

    Sanitizar.filtro = List.of("droga", "porcaria");



    String polido = Sanitizar.censurar(texto);

    // System.out.println(polido); // acordar cedo na segunda-feira é uma ****a, realmente uma *******a, um lixo

    Sanitizar.filtro = List.of("teste", "exemplo");

    // System.out.println(Sanitizar.censurar("este e um teste ou um exemplo")); // este e um ****e ou um ******o

    //System.out.println(Sanitizar.censurar("este e um teste ou um exemplo", 2)); // este e um ***te ou um *****lo

    System.out.println(Sanitizar.censurar("este e um teste ou um exemplo", 10)); // este e um **ste ou um ****plo
    }
}
