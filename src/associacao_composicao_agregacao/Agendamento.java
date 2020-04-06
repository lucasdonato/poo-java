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

    public Agendamento(Funcionario funcionario, String data, String horario, Cliente cliente, ArrayList<Servico> servicos) {
        this.funcionario = funcionario;
        this.data = data;
        this.horario = horario;
        this.cliente = cliente;
        this.servico = servicos;
    }

    public void imprimirAgendamento() {
        System.out.println("**** DADOS AGENDAMENTO ****");
        funcionario.imprimirFuncionario();
        System.out.println(
                "Data: " + this.data + "\n"
                + "Horário: " + this.horario + "\n"
        );
        Cliente.imprimirCliente(cliente);
        Servico.imprimirServicos(servico);

    }
}
