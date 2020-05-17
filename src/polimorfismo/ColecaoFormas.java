package polimorfismo;

import java.util.ArrayList;

/**
 *
 * @author Lucas Donato
 */
public class ColecaoFormas {

    ArrayList<FormaGeometrica> formas = new ArrayList<FormaGeometrica>();

    public void adicionarFormas(FormaGeometrica formas) {
        this.formas.add(formas);
    }

    public void calcularAreaTotal() {
        this.formas.forEach(f -> {
            
        });
    }
}
