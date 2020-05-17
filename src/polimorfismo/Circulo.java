package polimorfismo;

/**
 *
 * @author Lucas Donato
 */
public class Circulo extends FormaGeometrica {

    private double raio;
    final double PI = 3.1416;

    public Circulo(int x, int y, Cor corPreench, Cor corBorda, double raio) {
        super(x, y, corPreench, corBorda);
        this.raio = raio;

    }

    @Override
    public double calcularArea() {
        return PI * Math.pow(raio, 2);
    }

    @Override
    public double calcularPerimetro() {
        return 2 * PI * raio;
    }
}
