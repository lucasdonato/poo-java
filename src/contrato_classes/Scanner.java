package contrato_classes;

/**
 *
 * @author Lucas Donato
 */
public class Scanner extends Dispositivo {

    private final String resolucaoDigitalizacao;

    public Scanner(String marca, int numSerie, int tensao, String resolucaoDigitalizacao) {
        super(marca, numSerie, tensao);
        this.resolucaoDigitalizacao = resolucaoDigitalizacao;
    }

    @Override
    public void exibirDadosDispositivo() {
        System.out.println("== DADOS SCANNER ==");
        System.out.println("Número Série: " + getNumSerie()
                + "\nMarca: " + getMarca()
                + "\nDIG: " + this.resolucaoDigitalizacao);
    }
}
