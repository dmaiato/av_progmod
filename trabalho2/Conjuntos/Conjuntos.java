package Conjuntos;
import java.util.HashSet;
import java.util.Set;

class Conjuntos {
  
  static Set<Integer> uniao(Set<Integer> set1, Set<Integer> set2) {

    Set<Integer> retorno = new HashSet<>();
    retorno.addAll(set1);
    for (Integer i: set2) {
      if (!set1.contains(i)) {
        retorno.add(i);
      }
    }

    return retorno;
  }

  static Set<Integer> interseccao(Set<Integer> set1, Set<Integer> set2) {

    Set<Integer> retorno = new HashSet<>();

    for (Integer i: set1) {
      if (set2.contains(i)) {
        retorno.add(i);
      }

    }

    return retorno;
  }
  static Set<Integer> diferenca(Set<Integer> set1, Set<Integer> set2) {

    Set<Integer> retorno = new HashSet<>();

    for (Integer i: set1) {
      if (!set2.contains(i)) {
        retorno.add(i);
      }

    }

    return retorno;
  }


}
