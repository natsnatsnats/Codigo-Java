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

    public static void main(String[] args) {
        Retangulo ret = new Retangulo(10.5f, 5.2f);
        System.out.println("Base do retângulo: " + ret.base);
        System.out.println("Altura do retângulo: " + ret.altura);
        ret.calcularArea();
    }
  
}
