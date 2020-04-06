package associacao_composicao_agregacao;

import java.util.ArrayList;

/**
 *
 * @author Lucas Donato - RA 31826336
 */
public class Agendamento {

    private Funcionario funcionario;
    private String data;
    private String horario;
    private Cliente cliente;
    private ArrayList<Servico> servico;
    private Veiculo veiculo;

    public Agendamento(Funcionario funcionario, String data, String horario, Cliente cliente, ArrayList<Servico> servicos, Veiculo veiculo) {
        this.funcionario = funcionario;
        this.data = data;
        this.horario = horario;
        this.cliente = cliente;
        this.servico = servicos;
        this.veiculo = veiculo;
    }

    public void imprimirAgendamento() {
        System.out.println("**** DADOS AGENDAMENTO ****");
        funcionario.imprimirFuncionario();
        System.out.println(
                "Data: " + this.data + "\n"
                + "Horário: " + this.horario + "\n"
        );
        Cliente.imprimirCliente(cliente);
        Servico.imprimirServicos(servico,this.veiculo);

    }
}
