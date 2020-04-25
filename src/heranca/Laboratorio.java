package heranca;
/**
 *
 * @author Lucas Donato - RA 31826336
 */
public class Laboratorio extends Sala{
    private int qtdComputadores;
    private int qtdAlunosPorComp;
    private float velocidadeCPU;
    private int tamMemRam;
    private int capacidadeHD;
    private String sistemaOperacional;
    
    public Laboratorio(int numero, int capacidade, float largura, float profundidade, 
                       boolean dataShow, boolean caixasSom, 
                       int qtdComputadores, int qtdAlunosPorComp, float velocidadeCPU,
                       int tamMemRam, int capacidadeHD, String sistemaOperacional){
        
        super(numero,capacidade,largura,profundidade,dataShow,caixasSom);
        this.qtdComputadores = qtdComputadores;
        this.qtdAlunosPorComp = qtdAlunosPorComp;
        this.velocidadeCPU = velocidadeCPU;
        this.tamMemRam = tamMemRam;
        this.capacidadeHD = capacidadeHD;
        this.sistemaOperacional = sistemaOperacional;
    }
    
    @Override
    public int calcularCapacidade(){
        return 1;
    }
}
