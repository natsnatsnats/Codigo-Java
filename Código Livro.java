class Livro {
    String titulo;
    String capa;
    int folhas;
    private int paginaAtual;

    // Construtor: define a capa, título e total de folhas do livro
    public Livro(String titulo, String capa, int folhas) {
        this.titulo = titulo;
        this.capa = capa;
        this.folhas = folhas;
        this.paginaAtual = 1; // Começa na primeira página
    }

    // Método para avançar uma página
    public void virarPagina() {
        if (this.paginaAtual < this.folhas) {
            this.paginaAtual++;
            System.out.println("Você virou a página. Agora está na página " + this.paginaAtual);
        } else {
            System.out.println("Você já está na última página do livro.");
        }
    }

    // Método para obter a página atual
    public int getPaginaAtual() {
        return this.paginaAtual;
    }

    public static void main(String[] args) {
        Livro livro = new Livro("Ordem Paranormal Iniciação", "Capa dura", 121);

        System.out.println("Título do livro: " + livro.titulo);
        System.out.println("Páginas totais: " + livro.folhas);
        System.out.println("Página atual: " + livro.getPaginaAtual());

        livro.virarPagina();
        livro.virarPagina();
        livro.virarPagina();
    
        System.out.println("Página atual depois de virar 3 vezes: " + livro.getPaginaAtual());
  }
  
}
