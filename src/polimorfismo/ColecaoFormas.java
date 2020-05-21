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
        System.out.println("\n*** ÁREA TOTAL ***");
        this.formas.forEach(f -> {
            System.out.println(f.calcularArea());
        });
    }
    
    public void calcularPerimetroTotal(){
        System.out.println("\n*** PERIMETRO TOTAL ***");
        this.formas.forEach(f -> {
            System.out.println(f.calcularPerimetro());
        });
    }
}
