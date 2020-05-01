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

    /*Aqui será utilizada a técnica de sobrecarga dos construtores 
     no primeiro é passado a capacidade, no segundo a capacidade não é informada
     por que ela tem comportamentos diferentes para as classes SalaAprendizAtivo e Labotario*/
    public Sala(int numero, int capacidade, float largura, float profundidade, boolean dataShow, boolean caixasSom) {
        this.numero = numero;
        this.capacidade = capacidade;
        this.largura = largura;
        this.profundidade = profundidade;
        this.dataShow = dataShow;
        this.caixasSom = caixasSom;
    }

    public Sala(int numero, float largura, float profundidade, boolean dataShow, boolean caixasSom) {
        this.numero = numero;
        this.largura = largura;
        this.profundidade = profundidade;
        this.dataShow = dataShow;
        this.caixasSom = caixasSom;

        this.capacidade = 0;
    }

    public String exibeSala() {
        String msg = "Cod.Sala: " + getNumero() + "\nLargura: " + largura + "m "
                + "Profundidade: " + profundidade + "m " + capacidade + "Alunos";
        if (dataShow) {
            msg += "\nData show está disponível";
        }
        if (caixasSom) {
            msg += "\nCaixas som está disponível";
        }
        return msg;
    }

    public int calcularCapacidade() {
        return capacidade;
    }

    /**
     * @return the capacidade
     */
    public int getCapacidade() {
        return capacidade;
    }

    /**
     * @param capacidade the capacidade to set
     */
    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }

    /**
     * @return the largura
     */
    public float getLargura() {
        return largura;
    }

    /**
     * @return the profundidade
     */
    public float getProfundidade() {
        return profundidade;
    }

    /**
     * @return the dataShow
     */
    public boolean isDataShow() {
        return dataShow;
    }

    /**
     * @return the caixasSom
     */
    public boolean isCaixasSom() {
        return caixasSom;
    }

    /**
     * @return the numero
     */
    public int getNumero() {
        return numero;
    }

}
