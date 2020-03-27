package relacionamentoclasses;

/**
 *
 * @author Lucas Donato RA - 31826336
 * Vitor Jorge
 */
public class Departamento {

    private String nome;
    private int ramal;
    private String email;
    private String nomeDiretor;
    private String identificacaoDiretor;

    public void cadastrarDepartamento(String nome, int ramal, String email, String nomeDiretor, String identificacaoDiretor) {
        this.nome = nome;
        this.ramal = ramal;
        this.email = email;
        this.nomeDiretor = nomeDiretor;
        this.identificacaoDiretor = identificacaoDiretor;
    }

    public void exibeDepartamento() {
        System.out.println(
                "=== Dados do departamento cadastrado === \n"
                + "Nome: " + this.nome + "\n"
                + "Ramal: " + this.ramal + "\n"
                + "Email: " + this.email + "\n"
                + "Nome diretor: " + this.nomeDiretor + "\n"
                + "Identificação diretor: " + this.identificacaoDiretor + "\n"
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
     * @return the ramal
     */
    public int getRamal() {
        return ramal;
    }

    /**
     * @param ramal the ramal to set
     */
    public void setRamal(int ramal) {
        this.ramal = ramal;
    }

    /**
     * @return the nomeDiretor
     */
    public String getNomeDiretor() {
        return nomeDiretor;
    }

    /**
     * @param nomeDiretor the nomeDiretor to set
     */
    public void setNomeDiretor(String nomeDiretor) {
        this.nomeDiretor = nomeDiretor;
    }

    /**
     * @return the identificacaoDiretor
     */
    public String getIdentificacaoDiretor() {
        return identificacaoDiretor;
    }

    /**
     * @param identificacaoDiretor the identificacaoDiretor to set
     */
    public void setIdentificacaoDiretor(String identificacaoDiretor) {
        this.identificacaoDiretor = identificacaoDiretor;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }
}
