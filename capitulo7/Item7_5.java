import java.util.List;
import java.util.Set;
import java.util.HashSet;
import java.util.ArrayList;
import static java.util.Comparator.comparing;
import static java.util.stream.Collectors.toSet;
import static java.util.stream.Collectors.toCollection;

public class Item7_5 {

  public static void main(String... args) {
    List<Usuario> usuarios = new ArrayList<>();
    usuarios.add(new Usuario("itanor", 30));
    usuarios.add(new Usuario("pedro", 240));
    usuarios.add(new Usuario("jose", 520));
    usuarios.add(new Usuario("maria", 100));

    Set<Usuario> comMaisDeCemPontos = usuarios
      .stream()
      .filter(u -> u.getPontos() > 100)
      .collect(toSet());

    comMaisDeCemPontos.forEach(System.out::println);

    comMaisDeCemPontos = usuarios
      .stream()
      .filter(u -> u.getPontos() > 100)
      .collect(toCollection(HashSet::new));
  }
}

