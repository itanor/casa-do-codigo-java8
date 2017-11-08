import java.util.function.Supplier;
import java.util.function.Function;
import java.util.function.BiFunction;
import java.util.function.ToIntBiFunction;
import java.util.function.IntBinaryOperator;

public class Item6_6 {

  public static void main(String... args) {
    // class Usuario must have a default constructor...
    Supplier<Usuario> criadorDeUsuarios = Usuario::new;
    Usuario novo = criadorDeUsuarios.get();
    System.out.println(novo);

    // to create from a constructor with one argument...
    Function<String, Usuario> criadorDeUsuarios2 = Usuario::new;
    Usuario mary = criadorDeUsuarios2.apply("Mary");
    Usuario fred = criadorDeUsuarios2.apply("Fred");

    // to create from a constructor with two arguments...
    BiFunction<String, Integer, Usuario> criadorDeUsuarios3 = Usuario::new;
    Usuario jim = criadorDeUsuarios3.apply("Jim", 40);

    // for a static method...
    BiFunction<Integer, Integer, Integer> maxBuilder = Math::max;
    System.out.println("Max: " + maxBuilder.apply(2, 3));

    // ...and to evict auto boxing...
    ToIntBiFunction<Integer, Integer> maxBuilderForInt = Math::max;
    IntBinaryOperator maxBuilderOperator = Math::max;
  }
}

