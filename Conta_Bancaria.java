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

    public String toString(){
        return "Banco: " + this.banco + "\nPropietário: " + this.proprietario + "\nValor: " + this.valor;
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

     public static void main(String[] args) {
            ContaBancaria p = new ContaBancaria("Bradesco", ,"Natan" );
            System.out.println("Banco: " + p.banco);
            System.out.println("Valor: " + p.valor);
            System.out.println("Propietário: " + p.proprietario);
    }
}
