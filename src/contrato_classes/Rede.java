package contrato_classes;

import java.util.ArrayList;

/**
 *
 * @author Lucas Donato
 */
public class Rede {

    ArrayList<Associacao> associacoes;

    public Rede(Associacao associacao) {
        this.associacoes = new ArrayList<>();
        adicionarAssociacao(associacao); //chamo o metódo de adicionar da própria classe
    }

    public final void adicionarAssociacao(Associacao assoc) {
        this.associacoes.add(assoc);
    }

    public void listarAssociacoes() {
        System.out.println("***** LISTA DAS ASSOCIAÇÕES *****");
        System.out.println("=================================");
        for (Associacao ass : associacoes) {
            ass.computador.exibirDadosDispositivo();
            System.out.println("=== LISTAGEM DISPOSITIVOS ===");
            for(Dispositivo d : ass.dispositivos){
                d.exibirDadosDispositivo();
            }
        }
    }
}
