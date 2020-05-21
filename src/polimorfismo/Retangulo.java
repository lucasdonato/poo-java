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
    public String calcularArea() {
        return "Total área do RETANGULO: " + (this.base * this.altura);
    }

    @Override
    public String calcularPerimetro() {
        return "Total perimetro do RETANGULO: " + (2 * this.base) + 2 * altura;
    }
}
