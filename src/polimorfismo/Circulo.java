package polimorfismo;

/**
 *
 * @author Lucas Donato
 */
public class Circulo extends FormaGeometrica {

    private double raio;

    public Circulo(int x, int y, Cor corPreench, Cor corBorda, double raio) {
        super(x, y, corPreench, corBorda);
        this.raio = raio;

    }

    public double calcularArea() {
        return 0;
    }

    public double calcularPerimetro() {
        return 0;
    }
}
