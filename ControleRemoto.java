class ControleRemoto {
    String marca;
    int pilhas;
    private boolean ligado;

    // Construtor: define a marca e o número de pilhas
    public ControleRemoto(String marca, int pilhas) {
        this.marca = marca;
        this.pilhas = pilhas;
        this.ligado = false; // Começa sempre desligado
    }

    public String toString(){
        return "Marca: " + this.marca + "\nPilhas: " + this.pilhas + "\nEstado Atual: " + this.ligado;
    }

    // Método para ligar o controle
    public void ligar() {
        if (!this.ligado) {
            this.ligado = true;
            System.out.println("O controle remoto " + this.marca + " foi ligado.");
        } else {
            System.out.println("O controle já está ligado.");
        }
    }

    // Método para desligar o controle
    public void desligar() {
        if (this.ligado) {
            this.ligado = false;
            System.out.println("O controle remoto " + this.marca + " foi desligado.");
        } else {
            System.out.println("O controle já está desligado.");
        }
    }

     public static void main(String[] args) {
            ControleRemoto p = new ControleRemoto("Philipss", "Duracell");
            System.out.println("Marca: " + p.marca);
            System.out.println("Pilhas: " + p.pilhas);
    }
  
}
