package associacao_composicao_agregacao;

import java.util.ArrayList;

/**
 *
 * @author Lucas Donato - RA 31826336
 */
public class Servico {

    private String nome;
    private float valor;
    private int tempo;
    private static float valor_total;
    private static float tempo_total;

    public Servico(String nome, float valor, int tempo) {
        this.nome = nome;
        this.valor = valor;
        this.tempo = tempo;
    }

    public static void imprimirServicos(ArrayList<Servico> serv) {
        //calcula o valor total e o tempo antes da impressão
        valor_total = calcularValorServico(serv);
        tempo_total = calcularTempoServico(serv);
        
        System.out.println("**** SERVIÇOS PRESTADOS ****");        
        serv.forEach(s -> {
            System.out.println(
                    "Descrição: " + s.nome + "\n"
                    + "Valor: $" + s.valor + "\n"
                    + "Tempo: " + s.tempo + "\n" + 
                    "-----------------------------------------"
            );
        });        
        System.out.print(
                "Total serviços: $" + valor_total + "\n"
                + "Tempo total: " + tempo_total + "\n"
        );
        System.out.println("-----------------------------------------");
        
        tempo_total = 0;
        valor_total = 0;
    }

    public static float calcularValorServico(ArrayList<Servico> servico) {
        servico.forEach(s -> {
            valor_total += s.valor;
        });
        return valor_total;
    }

    public static float calcularTempoServico(ArrayList<Servico> servico) {
        servico.forEach(s -> {
            tempo_total += s.tempo;
        });
        if (tempo_total >= 60) {
            return tempo_total / 60;
        } else {
            return tempo_total;
        }

        //pensar na concatenação
    }
}
