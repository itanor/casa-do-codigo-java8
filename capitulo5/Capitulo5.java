import java.util.Comparator;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Arrays;

import static java.util.Comparator.comparing;

public class Capitulo5 {

  public static void main(String... args) {
    List<Usuario> usuarios = new ArrayList<>();
    usuarios.add(new Usuario("Itanor", 100));
    usuarios.add(new Usuario("Pedro",  110));
    usuarios.add(new Usuario("Maria",  120));

    Comparator<Usuario> comparator = new Comparator<Usuario>() {
      public int compare(Usuario u1, Usuario u2) {
        return u1.getNome().compareTo(u2.getNome());
      }
    };
    Collections.sort(usuarios, comparator);
    usuarios.forEach(u -> System.out.println(u.getNome()));

    // ou...
    usuarios.add(new Usuario("Joao", 130));
    usuarios.add(new Usuario("Mauro", 160));
    Collections.sort(usuarios, (u1,u2) -> u1.getNome().compareTo(u2.getNome()));
    System.out.println("---");
    usuarios.forEach(u -> System.out.println(u.getNome()));

    //ou...
    usuarios.add(new Usuario("Mariana", 200));
    usuarios.add(new Usuario("Abel",    220));
    usuarios.sort((u1,u2) -> u1.getNome().compareTo(u2.getNome()));
    System.out.println("---");
    usuarios.forEach(u -> System.out.println(u.getNome()));

    //ou...
    System.out.println("---");
    usuarios.sort(comparing(u -> u.getNome()));
    usuarios.forEach(u -> System.out.println(u.getNome()));

    // para uma lista de objetos que implementam Comparable, como String...
    List<String> palavras = Arrays.asList("Casa do Código", "Alura", "Caelum");
    palavras.sort(Comparator.naturalOrder());
    System.out.println("--- natural order ---");
    palavras.forEach(p -> System.out.println(p));

    palavras.sort(Comparator.reverseOrder());
    System.out.println("--- reverse order ---");
    palavras.forEach(p -> System.out.println(p));
  }
}

