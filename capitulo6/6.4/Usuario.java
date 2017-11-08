class Usuario {

  String nome;
  int pontos;
  boolean moderador;

  public Usuario() {}

  public Usuario(String nome) {
    this(nome, 0);
  }

  public Usuario(String nome, int pontos) {
    this.pontos = pontos;
    this.nome = nome;
    this.moderador = false;
  }

  public String getNome() {
    return nome;
  }

  public int getPontos() {
    return pontos;
  }

  public void tornaModerador() {
    this.moderador = true;
  }

  public boolean isModerador() {
    return moderador;
  }

  public String toString() {
    return 
      "Nome: " + nome + 
      " - Pontos: " + pontos + 
      " - Moderador: " + moderador;
  }
}

