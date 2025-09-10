class Lampada {
    private int voltagem;

    // Este é o construtor, que cria o objeto Lampada
    public Lampada(int voltagem) {
        this.voltagem = voltagem;
    }
    
}

class Main {
    public static void main(String[] args) {
        Lampada lampada = new Lampada(110);
        System.out.println("Voltagem: " + lampada.getVoltagem());
    }
}

class ContaBancaria {
    String banco;
    float valor;
    String proprietario;

    // Construtor: inicializa os atributos do objeto
    public ContaBancaria(String banco, String proprietario, float valorInicial) {
        this.banco = banco;
        this.proprietario = proprietario;
        this.valor = valorInicial;
    }

    // Método para depositar dinheiro
    public void depositar(float quantia) {
        this.valor += quantia;
        System.out.println("Depósito de " + quantia + " realizado. Saldo atual: " + this.valor);
    }

    // Método para sacar dinheiro
    public void sacar(float quantia) {
        if (this.valor >= quantia) {
            this.valor -= quantia;
            System.out.println("Saque de " + quantia + " realizado. Saldo atual: " + this.valor);
        } else {
            System.out.println("Saldo insuficiente para o saque.");
        }
    }
}

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
}

class Celular {
    String marca;
    int gigabytes;
    int ram;
    String placaDeVideo;
    String processador;

    // Construtor: define todas as características do celular
    public Celular(String marca, int gigabytes, int ram, String placaDeVideo, String processador) {
        this.marca = marca;
        this.gigabytes = gigabytes;
        this.ram = ram;
        this.placaDeVideo = placaDeVideo;
        this.processador = processador;
    }
}

class Computador {
    int ram;
    String processador;
    String placaDeVideo;
    String monitor;
    String gabinete;

    // Construtor: define todas as peças do computador
    public Computador(int ram, String processador, String placaDeVideo, String monitor, String gabinete) {
        this.ram = ram;
        this.processador = processador;
        this.placaDeVideo = placaDeVideo;
        this.monitor = monitor;
        this.gabinete = gabinete;
    }
}

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
}

class Retangulo {
    float base;
    float altura;

    // Construtor: define a base e a altura
    public Retangulo(float base, float altura) {
        this.base = base;
        this.altura = altura;
    }

    // Método para calcular e retornar a área
    public float calcularArea() {
        float area = this.base * this.altura;
        System.out.println("A área do retângulo é: " + area);
        return area;
    }
}
