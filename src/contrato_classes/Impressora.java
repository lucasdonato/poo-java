package contrato_classes;

/**
 *
 * @author Lucas Donato
 */
public class Impressora extends Dispositivo {

    private String resolucaoImpressao;
    private String tipoCartucho;
    private String tipoImpressao;

    public Impressora(String marca, int numSerie, int tensao, String resolucaoImpressao, String tipoCartucho, String tipoImpressao) {
        super(marca, numSerie, tensao);
        this.resolucaoImpressao = resolucaoImpressao;
        this.tipoCartucho = tipoCartucho;
        this.tipoImpressao = tipoImpressao;
    }

    @Override
    public void exibirDadosDispositivo() {

    }

}
