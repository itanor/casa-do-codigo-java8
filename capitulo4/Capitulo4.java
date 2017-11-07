import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;

import java.util.function.Consumer;
import java.util.function.Predicate;

public class Capitulo4 {

  public static void main(String... args) {
    Usuario u1 = new Usuario("Paulo Silveira", 150);
    Usuario u2 = new Usuario("Rodrigo Turini", 120);
    Usuario u3 = new Usuario("Guilherme Silveira", 190);

    List<Usuario> usuarios = Arrays.asList(u1,u2,u3);
    Consumer<Usuario> mostraMensagem = u -> System.out.println("antes de imprimir o nome");
    Consumer<Usuario> imprimeNome = u -> System.out.println(u.getNome());

    usuarios.forEach(mostraMensagem.andThen(imprimeNome));

    testRemoveIf();
  }

  private static void testRemoveIf() {
    Predicate<Usuario> maisDe160Pontos = new Predicate<Usuario>() {
      public boolean test(Usuario u) {
        return u.getPontos() > 160;
      }
    };

    List<Usuario> usuarios = new ArrayList<>();
    usuarios.add(new Usuario("", 150));
    usuarios.add(new Usuario("", 120));
    usuarios.add(new Usuario("", 190));

    usuarios.removeIf(maisDe160Pontos);   // ou: usuarios.removeIf(u -> u.getPontos() > 160);
    usuarios.forEach(u -> System.out.println(u));
  }
}

