import java.util.List;
import java.util.Arrays;

import java.util.function.Consumer;

public class Capitulo2 {

  public static void main(String... args) {
    Usuario user1 = new Usuario("Paulo Silveira", 150);
    Usuario user2 = new Usuario("Rogrigo Turini", 120);
    Usuario user3 = new Usuario("Guilherme Silveira", 190);

    List<Usuario> usuarios = Arrays.asList(user1, user2, user3);

    // versão 1
    for(Usuario u: usuarios) {
      System.out.println(u.getNome());
    }

    // versão 2
    usuarios.forEach(new Mostrador());

    // versão 3
    Consumer<Usuario> m1 = (Usuario u) -> {System.out.println(u.getNome());};

    // versão 4
    Consumer<Usuario> m2 = u -> {System.out.println(u.getNome());};

    // versão 5
    Consumer<Usuario> m3 = u -> System.out.println(u.getNome());

    usuarios.forEach(u -> System.out.println(u.getNome()));
    usuarios.forEach(u -> u.tornaModerador());
  }
}

