import java.util.List;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.function.IntBinaryOperator;

import java.util.stream.Stream;
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

    System.out.println("each stream...");
    Stream<String> s = Stream.empty();
    s.limit(10).forEach(System.out::println);

    Stream<Usuario> streamDeUsuarios = Stream.of(
        new Usuario("marlene", 200), new Usuario("jezebel", 700));

    System.out.println("Stream.of...");
    Stream<Usuario> stream = Stream.of(
        new Usuario("afanásio", 450), 
        new Usuario("joca", 400)
    );
    stream
      .filter(u -> u.getPontos() > 400)
      .map(Usuario::getNome)
      .forEach(System.out::println);

    Stream
      .concat(streamDeUsuarios, Stream.of(new Usuario("sâmila", 230)))
      .forEach(System.out::println);
  }
}

