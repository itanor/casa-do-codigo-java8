import java.util.List;
import java.util.Set;
import java.util.HashSet;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.OptionalDouble;

import static java.util.Comparator.comparing;
import static java.util.Comparator.comparingInt;
import static java.util.stream.Collectors.toList;
import static java.util.stream.Collectors.toSet;
import static java.util.stream.Collectors.toCollection;

public class Item7_6 {

  public static void main(String... args) {
    List<Usuario> usuarios = new ArrayList<>();
    usuarios.add(new Usuario("itanor", 30));
    usuarios.add(new Usuario("pedro", 240));
    usuarios.add(new Usuario("jose", 520));
    usuarios.add(new Usuario("maria", 100));

    List<Integer> pontos = usuarios
      .stream()
      .map(Usuario::getPontos)    // gera autoboxing...
      .collect(toList());

    pontos.forEach(System.out::println);

    int[] arrayDePontos = usuarios
      .stream()
      .mapToInt(Usuario::getPontos)
      .toArray();

    for(int ponto: arrayDePontos) {
      System.out.println(ponto);
    }

    double pontuacaoMedia = usuarios
      .stream()
      .mapToInt(Usuario::getPontos)
      .average()
      .getAsDouble();

    System.out.println("Pontuação média: " + pontuacaoMedia);

    OptionalInt pontuacaoMaxima = usuarios
      .stream()
      .mapToInt(Usuario::getPontos)
      .max();

    System.out.println("Pontuação máxima: " + pontuacaoMaxima.getAsInt());

    pontuacaoMedia = usuarios
      .stream()
      .mapToInt(Usuario::getPontos)
      .average()
      .orElse(0.0);

    List<String> nomes = new ArrayList<>();

    double m = nomes
      .stream()
      .mapToInt(String::length)
      .average()
      .orElse(0.0);
      //.orElseThrow(IllegalStateException::new);
    
    System.out.println("m: " + m);

    nomes
      .stream()
      .mapToInt(String::length)
      .average()
      .ifPresent(System.out::println);

    Optional<String> nomeComMaisPontos = usuarios
      .stream()
      .max(comparingInt(Usuario::getPontos))
      .map(Usuario::getNome);

    System.out.println(nomeComMaisPontos.orElse("Jesus"));
  }
}

