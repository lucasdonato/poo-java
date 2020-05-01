package heranca;

/**
 *
 * @author Lucas Donato - RA 31826336
 */
public class Laboratorio extends Sala {

    private int qtdComputadores;
    private int qtdAlunosPorComp;
    private float velocidadeCPU;
    private int tamMemRam;
    private int capacidadeHD;
    private String sistemaOperacional;

    /*chamado o construtor da sala que não passa a
     capacidade como parametro*/
    public Laboratorio(int numero, float largura, float profundidade,
            boolean dataShow, boolean caixasSom,
            int qtdComputadores, int qtdAlunosPorComp, float velocidadeCPU,
            int tamMemRam, int capacidadeHD, String sistemaOperacional) {

        super(numero, largura, profundidade, dataShow, caixasSom);
        this.qtdComputadores = qtdComputadores;
        this.qtdAlunosPorComp = qtdAlunosPorComp;
        this.velocidadeCPU = velocidadeCPU;
        this.tamMemRam = tamMemRam;
        this.capacidadeHD = capacidadeHD;
        this.sistemaOperacional = sistemaOperacional;

        int capacidade = calcularCapacidade();
        setCapacidade(capacidade);
    }

    @Override
    public int calcularCapacidade() {
        return qtdComputadores * qtdAlunosPorComp;
    }

    @Override
    public String exibeSala() {
        String msg = "Cod.Sala: " + getNumero() + "\nLargura: " + getLargura() + "m " + "Profundidade: " + getProfundidade() + "m"
                + "\nQtde computadores: " + qtdComputadores
                + "\nQtd alunos por computador: " + qtdAlunosPorComp
                + "\nVelocidade CPU: " + velocidadeCPU
                + "\nTamanho memória RAM: " + tamMemRam
                + "\nCapacidade HD " + capacidadeHD + "G"
                + "\nTamanho memória RAM: " + tamMemRam
                + "\nSistema Operacional: " + sistemaOperacional
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
