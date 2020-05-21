package polimorfismo;

/**
 *
 * @author Lucas Donato
 */
public class Quadrado extends FormaGeometrica {

    private double lado;

    public Quadrado(int x, int y, Cor corPreench, Cor corBorda, double lado) {
        super(x, y, corPreench, corBorda);
        this.lado = lado;
    }

    @Override
    public String calcularArea() {
        return "Total área do QUADRADO: " + (this.lado * this.lado);
    }

    @Override
    public String calcularPerimetro() {
        return "Total perimetro do QUADRADO: " + 4 * this.lado;
    }
}
