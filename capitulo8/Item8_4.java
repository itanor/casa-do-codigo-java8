import java.util.List;
import java.util.ArrayList;
import java.util.Comparator;

import static java.util.stream.Collectors.toList;

public class Item8_4 {

  public static void main(String... args) {
    List<Usuario> usuarios = new ArrayList<>();
    usuarios.add(new Usuario("itanor", 30));
    usuarios.add(new Usuario("pedro",  240));
    usuarios.add(new Usuario("jose",   520));
    usuarios.add(new Usuario("maria",  100));

    // executar uma tarefa toda vez que processa um elemento...
    // 'findAny', 'collect' e 'forEach' são operações terminais...
    usuarios.stream()
      .filter(u -> u.getPontos() > 100)
      .peek(System.out::println)
      .findAny();

    // 'sorted' é uma operação intermediária stateful
    usuarios.stream()
      .sorted(Comparator.comparing(Usuario::getNome))
      .peek(System.out::println)
      .findAny();
  }
}

