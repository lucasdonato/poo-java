package polimorfismo;

/**
 *
 * @author Lucas Donato
 */
public class Quadrado extends FormaGeometrica {

    private final double lado;

    public Quadrado(int x, int y, Cor corPreench, Cor corBorda, double lado) {
        super(x, y, corPreench, corBorda);
        this.lado = lado;
    }

    @Override
    public double calcularArea() {
        return (this.lado * this.lado);
    }

    @Override
    public double calcularPerimetro() {
        return 4 * this.lado;
    }
}
