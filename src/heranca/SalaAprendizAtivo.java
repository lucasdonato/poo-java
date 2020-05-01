package heranca;

/**
 *
 * @author Lucas Donato - RA 31826336
 */
public class SalaAprendizAtivo extends Sala {

    private int qtdMesasCompart;
    private int qtdCadeirasPorMesa;
    private int qtdPontosLuz;

    /*chamado o construtor da sala que não passa a
     capacidade como parametro*/
    public SalaAprendizAtivo(int numero, float largura, float profundidade,
            boolean dataShow, boolean caixasSom, int qtdMesasCompart,
            int qtdCadeirasPorMesa, int qtdPontosLuz) {
        super(numero, largura, profundidade, dataShow, caixasSom);
        this.qtdMesasCompart = qtdMesasCompart;
        this.qtdCadeirasPorMesa = qtdCadeirasPorMesa;
        this.qtdPontosLuz = qtdPontosLuz;

        int capacidade = calcularCapacidade();
        setCapacidade(capacidade);
    }

    @Override
    public int calcularCapacidade() {
        return qtdMesasCompart * qtdCadeirasPorMesa;
    }

    @Override
    public String exibeSala() {
        String msg = "Cod.Sala: " + getNumero() + "\nLargura: " + getLargura() + "m " + "Profuncidade: " + getProfundidade() + "m"
                + "\nQtde Total mesas compartilhadas: " + qtdMesasCompart
                + "\nCadeiras por mesa: " + qtdCadeirasPorMesa
                + "\nQtde Pontos de luz: " + qtdPontosLuz
                + "\nCapacidade : " + getCapacidade() + " alunos";
        if (isDataShow()) {
            msg += "\nData show está disponível";
        }
        if (isCaixasSom()) {
            msg += "\nCaixas som está disponível";
        }

        return msg;
    }
}
