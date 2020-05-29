package contrato_classes;

/**
 *
 * @author Lucas Donato
 */
public class Copiadora extends Dispositivo {

    private String tipoCopias;

    public Copiadora(String marca, int numSerie, int tensao, String tipoCopias) {
        super(marca, numSerie, tensao);
        this.tipoCopias = tipoCopias;
    }

    @Override
    public void exibirDadosDispositivo() {

    }
}
