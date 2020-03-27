package relacionamentoclasses;

/**
 *
 * @author Lucas Donato RA - 31826336
 * Vitor Jorge
 */
public class Cargo {

    private String nome;
    private String titulacaoMinima;

    public void cadastrarCargo(String nome, String titulacaoMinima) {
        this.nome = nome;
        this.titulacaoMinima = titulacaoMinima;
    }

    public void exibeCargo() {
        System.out.println(
                "=== Dados do cargo cadastrado === \n"
                + "Nome: " + this.nome + "\n"
                + "Titulação Minima: " + this.titulacaoMinima + "\n"
        ); 
    }

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the titulacaoMinima
     */
    public String getTitulacaoMinima() {
        return titulacaoMinima;
    }

    /**
     * @param titulacaoMinima the titulacaoMinima to set
     */
    public void setTitulacaoMinima(String titulacaoMinima) {
        this.titulacaoMinima = titulacaoMinima;
    }
}
