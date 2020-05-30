package contrato_classes;

/**
 *
 * @author Lucas Donato
 */
public class Computador implements InterfaceExibirDadosDispositivo {

    private String apelido;
    private String ip;
    private String mac;
    private String so;
    private int capMemRam;
    private int capHD;

    public Computador(String apelido, String ip, String mac, String so, int capMemRam, int capHD) {
        this.apelido = apelido;
        this.ip = ip;
        this.mac = mac;
        this.so = so;
        this.capMemRam = capMemRam;
        this.capHD = capHD;
    }

    @Override
    public void exibirDadosDispositivo() {
        System.out.println("DADOS COMPUTADOR");
        System.out.println("Apelido: " + this.apelido
                + "\nIP: " + this.ip
                + "\nMAC: " + this.mac
                + "\nSO: " + this.so
                + "\nCapacidade memória RAM: " + this.capMemRam
                + "\nCapacidade HD: " + this.capHD);
    }
}
