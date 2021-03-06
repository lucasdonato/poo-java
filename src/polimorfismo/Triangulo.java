package polimorfismo;

/**
 *
 * @author Lucas Donato
 */
public class Triangulo extends FormaGeometrica {

    private final double base;
    private final double altura;

    public Triangulo(int x, int y, Cor corPreench, Cor corBorda, double base, double altura) {
        super(x, y, corPreench, corBorda);
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double calcularArea() {
        return (this.base * this.altura) / 2;
    }

    @Override
    public double calcularPerimetro() {
        return base * 3;
    }
}
