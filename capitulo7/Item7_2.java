import java.util.List;
import java.util.ArrayList;
import static java.util.Comparator.comparing;

public class Item7_2 {

  public static void main(String... args) {
    List<Usuario> usuarios = new ArrayList<>();
    usuarios.add(new Usuario("itanor", 30));
    usuarios.add(new Usuario("pedro", 240));
    usuarios.add(new Usuario("jose", 520));
    usuarios.add(new Usuario("maria", 100));

    usuarios
      .stream()
      .filter(u -> u.getPontos() > 100)
      .forEach(Usuario::tornaModerador);

    usuarios.forEach(System.out::println);
  }
}

