package contrato_classes;

/**
 *
 * @author Lucas Donato
 */
public class Impressora extends Dispositivo {

    private final String resolucaoImpressao;
    private final String tipoCartucho;
    private final String tipoImpressao;

    public Impressora(String marca, int numSerie, int tensao, String resolucaoImpressao, String tipoCartucho, String tipoImpressao) {
        super(marca, numSerie, tensao);
        this.resolucaoImpressao = resolucaoImpressao;
        this.tipoCartucho = tipoCartucho;
        this.tipoImpressao = tipoImpressao;
    }

    @Override
    public void exibirDadosDispositivo() {
        System.out.println("== DADOS IMPRESSORA ==");
        System.out.println("Número Série: " + getNumSerie()
                + "\nMarca: " + getMarca()
                + "\nResolução: " + this.resolucaoImpressao 
                + "\nTipo Cartucho: " + this.tipoCartucho);
    }
}
