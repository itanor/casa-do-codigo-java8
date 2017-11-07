import java.util.List;
import java.util.ArrayList;
import java.util.Comparator;

public class Capitulo6 {

  public static void main(String... args) {
    List<Usuario> usuarios = new ArrayList<>();
    usuarios.add(new Usuario("Itanor", 20));
    usuarios.add(new Usuario("Pedro",  20));
    usuarios.add(new Usuario("Joana",  40));

    usuarios.forEach(Usuario::tornaModerador);
    usuarios.forEach(u -> System.out.println(u.isModerador()));

    //usuarios.sort(Comparator.comparing(Usuario::getNome));
    //usuarios.forEach(u -> System.out.println(u.getNome()));

    Comparator<Usuario> c = Comparator
      .comparingInt(Usuario::getPontos)
      .thenComparing(Usuario::getNome);
    
    usuarios.sort(c);
    System.out.println("---");
    usuarios.forEach(u -> System.out.println(u.getNome()));

    c = Comparator.nullsLast(Comparator.comparing(Usuario::getNome));
    System.out.println("---");
    usuarios.add(null);
    usuarios.add(new Usuario("Joaquim", 44));
    usuarios.sort(c);
    usuarios.forEach(u -> System.out.println(u));
    
    System.out.println("---");
    usuarios.sort(c.reversed());
    usuarios.forEach(u -> System.out.println(u));
  }
}

