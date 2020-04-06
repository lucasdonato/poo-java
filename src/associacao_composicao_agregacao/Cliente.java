package associacao_composicao_agregacao;

import java.util.ArrayList;

/**
 *
 * @author Lucas Donato - RA 31826336
 */
public class Cliente {

    private String nome;
    private String telefone;
    private String cpf;
    private Endereco endereco;
    private ArrayList<Veiculo> veiculos;

    public Cliente(String nome, String telefone, String cpf, Endereco endereco, ArrayList<Veiculo> veiculos) {
        this.nome = nome;
        this.telefone = telefone;
        this.cpf = cpf;
        this.endereco = endereco;
        this.veiculos = veiculos;
    }

    public static void imprimirCliente(Cliente c) {
        System.out.println("**** DADOS DO CLIENTE ****");
        System.out.println(
                "Nome: " + c.nome + "\n"
                + "Telefone: " + c.telefone + "\n"
                + "CPF: " + c.cpf + "\n"
        );
        Veiculo.imprimirVeiculos((ArrayList<Veiculo>) c.veiculos);
        Endereco.imprimirEndereco(c.endereco);

    }
}
