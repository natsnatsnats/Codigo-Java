class Lampada {
    private int voltagem;

    // Este é o construtor, que cria o objeto Lampada
    public Lampada(int voltagem) {
        this.voltagem = voltagem;
    }

    public static void main(String[] args) {
        Lampada lampada = new Lampada(110);
    }
}
