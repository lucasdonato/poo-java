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
    private static int tempo_total;

    public Servico(String nome, float valor, int tempo) {
        this.nome = nome;
        this.valor = valor;
        this.tempo = tempo;
    }

    public static void imprimirServicos(ArrayList<Servico> serv) {
        tempo_total = 0;
        valor_total = 0;

        valor_total = calcularValorServico(serv);
        tempo_total = calcularTempoServico(serv);

        System.out.println("**** SERVIÇOS PRESTADOS ****");
        serv.forEach(s -> {
            System.out.println("Descrição: " + s.nome +  "\nValor: $" + s.valor);
            formataHora(s.tempo);
            System.out.println("-----------------------------------------");
        });

        //os totais são impressos somente depois que o foreach termina a execução
        System.out.print("Total serviços: $" + valor_total + "\n");
        formataHora(tempo_total); //formata e imprime a hora

    }

    public static float calcularValorServico(ArrayList<Servico> servico) {
        servico.forEach(s -> {
            valor_total += s.valor;
        });
        return valor_total;
    }

    public static int calcularTempoServico(ArrayList<Servico> servico) {
        servico.forEach(s -> {
            tempo_total += s.tempo;
        });
        return tempo_total;
    }

    public static void formataHora(int t) {
        int hours = t / 60;
        int minutes = t % 60;
        System.out.printf("Tempo: %d:%02d", hours, minutes);
        System.out.println("");
    }
}
