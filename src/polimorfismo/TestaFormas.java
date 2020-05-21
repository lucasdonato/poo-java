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

        colecao.calcularAreaTotal();
        colecao.calcularPerimetroTotal();
    }
}
