package Conjuntos;
import java.util.Set;

public class Main {

  public static void main(String[] args) {

    // Set<Integer> teste = new HashSet<>();
    Set<Integer> c1 = Set.of(2, 4, 6, 9);
    Set<Integer> c2 = Set.of(1, 3, 6, 9);

 Set<Integer> r1 = Conjuntos.uniao(c1, c2);
 System.out.println(r1); // [1, 2, 3, 4, 6, 9]

 Set<Integer> r2 = Conjuntos.interseccao(c1, c2);
 System.out.println(r2); // [6, 9]

    Set<Integer> r3 = Conjuntos.diferenca(c1, c2);
    System.out.println(r3); // [2, 4]

  Set<Integer> r4 = Conjuntos.diferenca(c2, c1);
  System.out.println(r4); // [1, 3]
  }  
}