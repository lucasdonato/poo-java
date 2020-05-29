package contrato_classes;

/**
 *
 * @author Lucas Donato
 */
public class Multifuncional extends Dispositivo {

    private String resolucaoImpressao;
    private String tipoImpressao;
    private String tipoCopias;
    private String tipoCartucho;
    private String resolucaoDigitalizacao;

    public Multifuncional(String marca, int numSerie, int tensao, String resolucaoImpressao, String tipoImpressao, String tipoCopias,
            String tipoCartucho, String resolucaoDigitalizacao) {
        super(marca, numSerie, tensao);

        this.resolucaoDigitalizacao = resolucaoDigitalizacao;
        this.tipoCopias = tipoCopias;
        this.resolucaoImpressao = resolucaoImpressao;
        this.tipoCartucho = tipoCartucho;
        this.tipoImpressao = tipoImpressao;
    }

    @Override
    public void exibirDadosDispositivo() {

    }
}
