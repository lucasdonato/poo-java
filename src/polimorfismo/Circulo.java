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
    public String calcularArea() {
        return "Total área do CÍRCULO: " + PI * Math.pow(raio, 2);
    }

    @Override
    public String calcularPerimetro() {
        return "Total perimetro CÍRCULO: " + 2 * PI * raio;
    }
}
