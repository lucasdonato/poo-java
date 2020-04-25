package heranca;
/**
 *
 * @author Lucas Donato - RA 31826336
 */
public class SalaAprendizAtivo extends Sala{
    private int qtdMesasCompart ;
    private int qtdCadeirasPorMesa;
    private int qtdPontosLuz;
    
    public SalaAprendizAtivo(int numero, int capacidade, float largura, float profundidade,
                            boolean dataShow, boolean caixasSom, int qtdMesasCompart,
                            int qtdCadeirasPorMesa, int qtdPontosLuz  ){
        super(numero,capacidade,largura,profundidade,dataShow,caixasSom);
        this.qtdMesasCompart = qtdMesasCompart;
        this.qtdCadeirasPorMesa = qtdCadeirasPorMesa;
        this.qtdPontosLuz = qtdPontosLuz;
    }
     
    @Override
    public int calcularCapacidade(){
        return 1;
    }
}
