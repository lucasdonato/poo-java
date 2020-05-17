package polimorfismo;

/**
 *
 * @author Lucas Donato
 */
public class FormaGeometrica {

    private int x;
    private int y;
    private Cor corPreenc;
    private Cor corBorda;

    public FormaGeometrica(int x, int y, Cor corPreench, Cor corBorda) {
        this.x = x;
        this.y = y;
        this.corPreenc = corPreench;
        this.corBorda = corBorda;
    }

    public double calcularArea() {
        return 0;
    }

    public double calcularPerimetro() {
        return 0;
    }
}
