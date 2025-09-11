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

    public String toString(){
        return "Ram: " + this.ram + "\nProcessador: " + this.processador + "\nPlaca de Vídeo: " + this.placaDeVideo + "\nMonitor: " + this.monitor + "\nGabinete: " + this.gabinete;
    }

    public static void main(String[] args) {
        Computador p = new Computador(8, "Intel core 7", "Nvidia 2090", "LG 24MS500", "Tgt Legion");
        System.out.println("Ram: " + p.ram);
        System.out.println("Processador: " + p.processador);
        System.out.println("Placa de Vídeo: " + p.placaDeVideo);
        System.out.println("Monitor: " + p.monitor);
        System.out.println("Gabinete: " + p.gabinete);
    }
  
}
