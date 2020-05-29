package contrato_classes;

/**
 *
 * @author Lucas Donato
 */
public class Scanner extends Dispositivo {

    private String resolucaoDigitalizacao;

    public Scanner(String marca, int numSerie, int tensao, String resolucaoDigitalizacao) {
        super(marca, numSerie, tensao);
        this.resolucaoDigitalizacao = resolucaoDigitalizacao;
    }

    @Override
    public void exibirDadosDispositivo() {

    }
}
