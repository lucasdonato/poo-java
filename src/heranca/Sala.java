package heranca;
/**
 *
 * @author Lucas Donato - RA 31826336
 */
public class Sala {
    private int numero;
    private int capacidade;
    private float largura;
    private float profundidade;
    private boolean dataShow;
    private boolean caixasSom;
    
    public Sala(int numero, int capacidade, float largura, float profundidade, boolean dataShow, boolean caixasSom){
        this.numero = numero;
        this.capacidade = capacidade;
        this.largura = largura;
        this.profundidade = profundidade;
        this.dataShow = dataShow;
        this.caixasSom = caixasSom;
    }
    
    public int calcularCapacidade(){
        return 1;
    }
}