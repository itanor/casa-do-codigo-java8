import java.util.function.Function;
import java.util.function.ToIntFunction;

import java.util.List;
import java.util.ArrayList;
import java.util.Comparator;

public class OrdenandoPorPontosEAutoBoxing {

  public static void main(String... args) {
    Function<Usuario, Integer> extraiPontos = u -> u.getPontos();

    List<Usuario> usuarios = new ArrayList<>();
    usuarios.add(new Usuario("Pedro", 100));
    usuarios.add(new Usuario("Maria", 110));
    usuarios.add(new Usuario("Mario", 98));
    usuarios.add(new Usuario("Jose", 75));

    Comparator<Usuario> comparaPelosPontos = Comparator.comparing(extraiPontos);
    usuarios.sort(comparaPelosPontos);
    usuarios.forEach(u -> System.out.println(u.getPontos()));

    // a função extraiPontos gera autoBoxing toda vez que é invocada..
    // se possuir uma lista enorme, pode consumir muita memória...
    // Deve-se usar, nesse caso, ToIntFunction...
    ToIntFunction<Usuario> extraiPontosToInt = u -> u.getPontos();
    usuarios.add(new Usuario("Itanor", 300));

    System.out.println("---");
    usuarios.sort(Comparator.comparingInt(extraiPontosToInt));
    usuarios.forEach(u -> System.out.println(u.getPontos()));
  }
}

