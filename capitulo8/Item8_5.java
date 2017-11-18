import java.util.List;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.function.IntBinaryOperator;

import static java.util.stream.Collectors.toList;

public class Item8_5 {

  public static void main(String... args) {
    List<Usuario> usuarios = new ArrayList<>();
    usuarios.add(new Usuario("itanor", 30));
    usuarios.add(new Usuario("pedro",  240));
    usuarios.add(new Usuario("jose",   520));
    usuarios.add(new Usuario("maria",  100));

    int soma = usuarios.stream()
      .mapToInt(Usuario::getPontos)
      .sum();

    System.out.println(soma);

    int valorInicial = 0;
    IntBinaryOperator operacao = (a,b) -> a + b;

    soma = usuarios.stream()
      .mapToInt(Usuario::getPontos)
      .peek(System.out::println)
      .reduce(valorInicial, operacao);

    //ou...
    soma = usuarios.stream()
      .mapToInt(Usuario::getPontos)
      .peek(System.out::println)
      .reduce(0, (a, b) -> a + b);

    System.out.println(soma);

    //ou...
    soma = usuarios.stream()
      .mapToInt(Usuario::getPontos)
      .reduce(0, Integer::sum);

    System.out.println(soma);

    int multiplicacao = usuarios.stream()
      .mapToInt(Usuario::getPontos)
      .reduce(1, (a, b) -> a * b);

    System.out.println(multiplicacao);
  }
}

