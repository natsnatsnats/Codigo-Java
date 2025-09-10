public class Main {
    public static void main(String[] args) {
        Pessoa p = new Pessoa("Juliana", 1.70f, 65.5f);
        
        System.out.println("Nome: " + p.getNome());
        System.out.println("Altura: " + p.getAltura());
        System.out.println("Peso: " + p.getPeso());
    }
}

class Pessoa {
    // Os atributos devem ser privados para encapsulamento.
    private String nome;
    private float altura;
    private int diaDeNascimento;
    private int mesDeNascimento;
    private int anoDeNascimento;
    private float peso;

    // Construtor da classe Pessoa.
    public Pessoa(String n, float a, float p) {
        this.nome = n;
        this.altura = a;
        this.peso = p;
    }
//Acho que ta certo, espero que esteja
}
