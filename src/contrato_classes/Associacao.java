package contrato_classes;

import java.util.ArrayList;

/**
 *
 * @author Lucas Donato
 */
public class Associacao {

    private Computador computador;
    ArrayList<Dispositivo> dispositivos;

    public Associacao(Computador computador) {
        dispositivos = new ArrayList<>();
        this.computador = computador;
    }

    public void adicionarDispositivo(Dispositivo d) {
        dispositivos.add(d);
    }
}
