package heranca;

/**
 *
 * @author Lucas Donato - RA 31826336
 */
public class Funcionario {

    private int matricula;
    private String nome;
    private String telefone;
    private String email;

    public Funcionario(int matricula, String nome, String telefone, String email) {
        this.matricula = matricula;
        this.nome = nome;
        this.telefone = telefone;
        this.email = email;
    }

    public String exibeFuncionario() {
        String msg = "\nMatrícula: " + getMatricula() + "\nNome: " + getNome()
                + "\nTelefone: " + getTelefone() + "\nEmail: " + getEmail();
        return msg;
    }

    /**
     * @return the matricula
     */
    public int getMatricula() {
        return matricula;
    }

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @return the telefone
     */
    public String getTelefone() {
        return telefone;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }
}
