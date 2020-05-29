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

    }
}
