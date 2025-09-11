class Celular {
    String marca;
    int gigabytes;
    int ram;
    String processador;

    // Construtor: define todas as características do celular
    public Celular(String marca, int gigabytes, int ram, String processador) {
        this.marca = marca;
        this.gigabytes = gigabytes;
        this.ram = ram;
        this.processador = processador;
    }

    public String toString(){
        return "Marca: " + this.marca + "\nGigabytes: " + this.gigabytes + "\nRam: " + this.ram + "\Processador: " + this.processador;
    }

       public static void main(String[] args) {
          Celular p = new Celular("Samsung", 64,"Natan", 4, 2);
          System.out.println("Marca: " + p.marca);
          System.out.println("Gigabytes: " + p.valor);
          System.out.println("Ram: " + p.proprietario);
          System.out.println("Processador: " + p.processador);
    }
}
