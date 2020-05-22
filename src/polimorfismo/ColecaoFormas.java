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

    public double calcularAreaTotal() {
        double areaTotal = 0;

        for (FormaGeometrica f : formas) {
            areaTotal += f.calcularArea();
        }
        return areaTotal;
    }

    public double calcularPerimetroTotal() {
        double perimetroTotal = 0;

        for (FormaGeometrica f : formas) {
            perimetroTotal += f.calcularPerimetro();
        }
        return perimetroTotal;
    }
}
