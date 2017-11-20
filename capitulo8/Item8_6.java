import java.util.List;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.function.IntBinaryOperator;

import static java.util.stream.Collectors.toList;

public class Item8_6 {

  public static void main(String... args) {
    List<Usuario> usuarios = new ArrayList<>();
    usuarios.add(new Usuario("itanor", 30));
    usuarios.add(new Usuario("pedro",  240));
    usuarios.add(new Usuario("jose",   520));
    usuarios.add(new Usuario("maria",  100));
    usuarios.add(new Usuario("joao",   200));
    usuarios.add(new Usuario("sandra", 140));
    usuarios.add(new Usuario("joana",  160));

    // utilizar iterator quando for modificar os objetos de um stream...
    usuarios.stream()
      .iterator()
      .forEachRemaining(System.out::println);

    boolean hasModerator = usuarios.stream()
      .anyMatch(Usuario::isModerador);

    System.out.println(hasModerator);

    boolean allModerators = usuarios.stream()
      .allMatch(Usuario::isModerador);

    System.out.println(allModerators);

    boolean noneModerator = usuarios.stream()
      .noneMatch(Usuario::isModerador);

    System.out.println(noneModerator);

    long totalDeUsuarios = usuarios.stream()
      .count();

    System.out.println(totalDeUsuarios);

    long totalDeUsuariosMenosDoisPrimeiros = usuarios.stream()
      .skip(2)
      .count();

    System.out.println(totalDeUsuariosMenosDoisPrimeiros);

    List<Usuario> tresPrimeiros = usuarios.stream()
      .limit(3)
      .collect(toList());

    tresPrimeiros.forEach(System.out::println);
  }
}

