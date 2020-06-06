package contrato_classes;

import java.util.ArrayList;

/**
 *
 * @author Lucas Donato
 */
public class Associacao {

    protected Computador computador;
    protected ArrayList<Dispositivo> dispositivos;

    public Associacao(Computador computador) {
        dispositivos = new ArrayList<>();
        this.computador = computador;
    }

    public void adicionarDispositivo(Dispositivo d) {
        dispositivos.add(d);
    }
    
    public void exibirAssociacao() {
        System.out.println("***** LISTA DAS ASSOCIAÇÕES *****");
        System.out.println("=================================");

        computador.exibirDadosDispositivo();
        System.out.println("=== LISTAGEM DISPOSITIVOS ===");
        dispositivos.stream().forEach((d) -> {
            d.exibirDadosDispositivo();
        });

    }
}
