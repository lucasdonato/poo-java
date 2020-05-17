package polimorfismo;

/**
 *
 * @author Lucas Donato
 */
public class Quadrado extends FormaGeometrica {

    private double lado;

    public Quadrado(int x, int y, Cor corPreench, Cor corBorda,double lado) {
        super(x, y, corPreench, corBorda);
        this.lado = lado;
    }

    public double calcularArea() {
        return 0;
    }

    public double calcularPerimetro() {
        return 0;
    }
}
