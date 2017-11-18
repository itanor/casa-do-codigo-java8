import java.util.List;
import java.util.ArrayList;

import static java.util.stream.Collectors.toList;

public class Item8_3 {

  public static void main(String... args) {
    List<Usuario> usuarios = new ArrayList<>();
    usuarios.add(new Usuario("itanor", 30));
    usuarios.add(new Usuario("pedro",  240));
    usuarios.add(new Usuario("jose",   520));
    usuarios.add(new Usuario("maria",  100));

    // recuperar qualquer usuario com mais de 100 pontos...
    Usuario maisDe100 = usuarios.stream()
      .filter(u -> u.getPontos() > 100)
      .collect(toList())
      .get(0);

    System.out.println(maisDe100);

    // com findAny...
    Usuario alguem = usuarios.stream()
      .filter(u -> u.getPontos() > 600)
      .findAny()
      .orElse(new Usuario("Joao Ninguém", 0));

    System.out.println(alguem);
  }
}

