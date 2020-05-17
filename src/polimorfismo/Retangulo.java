package polimorfismo;

/**
 *
 * @author Lucas Donato
 */
public class Retangulo extends FormaGeometrica {

    private double base;
    private double altura;

    public Retangulo(int x, int y, Cor corPreench, Cor corBorda, double base, double altura) {
        super(x, y, corPreench, corBorda);
        this.base = base;
        this.altura = altura;
    }

    public double calcularArea() {
        return 0;
    }

    public double calcularPerimetro() {
        return 0;
    }
}
