import java.util.stream.Stream;
import java.util.function.Supplier;
import java.util.Random;

import java.util.List;
import java.util.UUID;
import static java.util.stream.Collectors.toList;

public class Item8_7 {

  public static void main(String... args) {
    Random random = new Random(0);
    Supplier<Integer> supplier = () -> random.nextInt();
    Stream<Integer> stream = Stream.generate(supplier);
    System.out.println(stream.findFirst());

    Stream.generate(supplier)
      .limit(10)
      .collect(toList())
      .forEach(System.out::println);

    Stream.generate(() -> UUID.randomUUID().toString())
      .limit(10)
      .collect(toList())
      .forEach(System.out::println);
  }
}

