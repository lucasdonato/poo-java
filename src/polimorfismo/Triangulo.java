package polimorfismo;

/**
 *
 * @author Lucas Donato
 */
public class Triangulo extends FormaGeometrica {

    private double base;
    private double altura;

    public Triangulo(int x, int y, Cor corPreench, Cor corBorda, double base, double altura) {
        super(x, y, corPreench, corBorda);
        this.base = base;
        this.altura = altura;
    }

    @Override
    public String calcularArea() {
        return "Total área do TRIANGULO: " + (this.base * this.altura) / 2;
    }

    @Override
    public String calcularPerimetro() {
        return "Total perimetro do TRIANGULO: " + base * 3;
    }
}
