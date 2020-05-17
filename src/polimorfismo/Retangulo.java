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

    @Override
    public double calcularArea() {
        return (this.base * this.altura);
    }

    @Override
    public double calcularPerimetro() {
        return (2 * this.base) + 2 * altura;
    }
}
