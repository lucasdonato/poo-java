package associacao_composicao_agregacao;

/**
 *
 * @author Lucas Donato - RA 31826336
 */
public class Funcionario {

    private int id;
    private String nome;
    private String cpf;
    private String email;

    public Funcionario(int id, String nome, String cpf, String email) {
        this.id = id;
        this.nome = nome;
        this.cpf = cpf;
        this.email = email;
    }

    public void imprimirFuncionario() {
        System.out.println("FUNCIONÁRIO RESPONSÁVEL");
        System.out.println(
                "ID: " + this.id + "\n"
                + "Nome: " + this.nome + "\n"
                + "CPF: " + this.cpf + "\n"
                + "EMAIL: " + this.email + "\n"
        );
    }
}
