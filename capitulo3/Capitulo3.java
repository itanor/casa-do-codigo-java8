public class Capitulo3 {

  public static void main(String... args) {
    // versão 1
    Validador<String> validador1 = new Validador<String>() {
      public boolean valida(String valor) {
        return valor.matches("[0-9]{5}-[0-9]{3}");
      }
    };

    // versão 2
    Validador<String> validador2 =
      valor -> {return valor.matches("[0-9]{5}-[0-9]{3}");};

    System.out.println(validador2.valida("04101-300"));
  }
}

