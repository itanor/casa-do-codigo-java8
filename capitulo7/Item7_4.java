import java.util.List;
import java.util.ArrayList;
import static java.util.Comparator.comparing;
import static java.util.stream.Collectors.toList;

public class Item7_4 {

  public static void main(String... args) {
    List<Usuario> usuarios = new ArrayList<>();
    usuarios.add(new Usuario("itanor", 30));
    usuarios.add(new Usuario("pedro", 240));
    usuarios.add(new Usuario("jose", 520));
    usuarios.add(new Usuario("maria", 100));

    List<Usuario> comMaisDeCemPontos = usuarios
      .stream()
      .filter(u -> u.getPontos() > 100)
      .collect(toList());

    comMaisDeCemPontos.forEach(System.out::println);
  }
}

