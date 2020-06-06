package contrato_classes;

/**
 *
 * @author Lucas Donato
 */
public class Multifuncional extends Dispositivo {

    private final String resolucaoImpressao;
    private final String tipoImpressao;
    private final String tipoCopias;
    private final String tipoCartucho;
    private final String resolucaoDigitalizacao;

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
        System.out.println("== DADOS MULTIFUNCIONAL ==");
        System.out.println("Número Série: " + getNumSerie()
                + "\nMarca: " + getMarca()
                + "\nResolução: " + this.resolucaoImpressao
                + "\nTipo Cartucho: " + this.tipoCartucho
                + "\nDIG: " + this.resolucaoDigitalizacao
                + "\nTipo de cópidas: " + this.tipoCopias);
    }
}
