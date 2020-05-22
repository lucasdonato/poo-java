package polimorfismo;

/**
 *
 * @author Lucas Donato
 */
public class TestaFormas {

    public static void main(String[] args) {
        System.out.println("===== FORMAS GEOMÉTRICAS =====");

        //Cria as cores
        Cor branca = new Cor(255, 255, 255);
        Cor azul = new Cor(0, 0, 255);
        Cor vermelha = new Cor(255, 0, 0);
        Cor amarela = new Cor(255, 255, 0);

        //cria as formas geometricas
        Quadrado quadrado = new Quadrado(10, 20, branca, vermelha, 4);
        Retangulo retangulo = new Retangulo(20, 25, amarela, branca, 4, 2);
        Triangulo triangulo = new Triangulo(80, 100, azul, vermelha, 2, 2);
        Circulo circulo = new Circulo(700, 50, azul, branca, 3);

        //coleção das formas geometricas
        ColecaoFormas colecao = new ColecaoFormas();
        colecao.adicionarFormas(quadrado);
        colecao.adicionarFormas(retangulo);
        colecao.adicionarFormas(circulo);
        colecao.adicionarFormas(triangulo);

        //testes áreas
        System.out.println("\nÁrea quadrado: " + quadrado.calcularArea());
        System.out.println("Área retangulo: " + retangulo.calcularArea());
        System.out.println("Área circulo: " + circulo.calcularArea());
        System.out.println("Área triangulo: " + triangulo.calcularArea());
        
        //testes perimetro
        System.out.println("\nPerimetro quadrado: " + quadrado.calcularPerimetro());
        System.out.println("Perimetro retangulo: " + retangulo.calcularPerimetro());
        System.out.println("Perimetro circulo: " + circulo.calcularPerimetro());
        System.out.println("Perimetro triangulo: " + triangulo.calcularPerimetro());
        
        //testes area e perimetro total
        System.out.println("\nÁrea total: " + colecao.calcularAreaTotal());
        System.out.println("Perímetro total: " + colecao.calcularPerimetroTotal());
        
    }
}
