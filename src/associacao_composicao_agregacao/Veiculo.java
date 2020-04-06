package associacao_composicao_agregacao;

import java.util.ArrayList;

/**
 *
 * @author Lucas Donato - RA 31826336
 */
public class Veiculo {

    private String placa;
    private String modelo;
    private int anoFabricacao;
    private String cor;

    public Veiculo(String placa, String modelo, int anoFabricacao, String cor) {
        this.placa = placa;
        this.modelo = modelo;
        this.anoFabricacao = anoFabricacao;
        this.cor = cor;
    }

    public static void imprimirVeiculos(ArrayList<Veiculo> veic) {
        System.out.println("**** VEÍCULOS DO CLIENTE ****");
        veic.forEach(v -> {
            System.out.println(
                    "Placa: " + v.placa + "\n"
                    + "Modelo: " + v.modelo + "\n"
                    + "Ano fabricação: " + v.anoFabricacao + "\n"
                    + "Ano fabricação: " + v.cor + "\n"
                    + "-----------------------------------------"
            );
        });
    }
}
