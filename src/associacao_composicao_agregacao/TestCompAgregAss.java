package associacao_composicao_agregacao;

import java.util.ArrayList;

/**
 *
 * @author Lucas Donato - RA 31826336
 */
public class TestCompAgregAss {

    public static void main(String args[]) {

        //cadastra os funcionários
        Funcionario f1 = new Funcionario(100, "Lucas Donato", "197.842.070-60", "lucaspolimig96@gmail.com");
        Funcionario f2 = new Funcionario(200, "João da silva", "644.059.240-82", "joaodasilva@gmail.com");

        //cadastra os veiculos
        Veiculo v1 = new Veiculo("KQQ-9412", "Fiat Palio", 2019, "Preto");
        Veiculo v2 = new Veiculo("MIP-5925", "FOX", 2015, "Branco");
        Veiculo v3 = new Veiculo("JCF-1526", "Gol", 2004, "Vermelho");
        Veiculo v4 = new Veiculo("MWV-9931", "HB20s", 2020, "Prata sand");

        //cadastra os serviços
        Servico s1 = new Servico("Lavagem Completa + Cera", 75, 60);
        Servico s2 = new Servico("Lavagem Completa", 50, 30);
        Servico s3 = new Servico("Lavagem tapete", 25, 30);

        //cria os endereços
        Endereco e1 = new Endereco("Rua João Caetano", 516, "APTO 201", "Nova Suíça", "Belo Horizonte", "Minas Gerais", "30420-270");
        Endereco e2 = new Endereco("Avenida Raja gabaglia", 4343, null, "Santa Lúcia", "Nova Lima", "Minas Gerais", "30350-577");

        //cria segunda lista de veiculos com 2 veiculos
        ArrayList<Veiculo> veiculos1 = new ArrayList();
        veiculos1.add(v1);
        veiculos1.add(v2);
        //cria segunda lista de veiculos com 3 veiculos
        ArrayList<Veiculo> veiculos2 = new ArrayList();
        veiculos2.add(v1);
        veiculos2.add(v2);
        veiculos2.add(v4);

        //cria os clientes vinculando endereço e veiculo
        Cliente c1 = new Cliente("Joaquin do céu", "(10) 91451-7901", "174.810.680-54", e2, veiculos1);
        Cliente c2 = new Cliente("Maíra de jesus", "(58) 99959-4317", "340.961.800-76", e1, veiculos2);

        //cria primeira lista de serviços
        ArrayList<Servico> servico1 = new ArrayList();
        servico1.add(s3);
        //cria segunda lista de serviços
        ArrayList<Servico> servico2 = new ArrayList();
        servico2.add(s1);
        servico2.add(s2);
        servico2.add(s3);

        //cria e imprime primeiro agendamento
        Agendamento a1 = new Agendamento(f2, "01/01/2020", "8:30", c2, servico1);
        a1.imprimirAgendamento();

        //cria e imprime o segundo agendamento
        Agendamento a2 = new Agendamento(f1, "31/12/2019", "15:00", c1, servico2);
        a2.imprimirAgendamento();
    }
}
