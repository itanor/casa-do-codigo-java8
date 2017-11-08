
public class Item6_4 {

  public static void main(String... args) {
    Usuario rodrigo = new Usuario("", 50);
    System.out.println(rodrigo);
    Runnable bloco = rodrigo::tornaModerador;
    bloco.run();
    System.out.println(rodrigo);
  }
}

