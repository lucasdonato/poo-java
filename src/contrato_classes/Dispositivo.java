package contrato_classes;

/**
 *
 * @author Lucas Donato
 */
public abstract class Dispositivo {

    private String marca;
    private int numSerie;
    private int tensao;

    public Dispositivo(String marca, int numSerie, int tensao) {
        this.marca = marca;
        this.numSerie = numSerie;
        this.tensao = tensao;
    }

    public abstract void exibirDadosDispositivo();

    /**
     * @return the marca
     */
    public String getMarca() {
        return marca;
    }

    /**
     * @return the numSerie
     */
    public int getNumSerie() {
        return numSerie;
    }

}
