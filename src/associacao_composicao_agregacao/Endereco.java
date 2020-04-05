package associacao_composicao_agregacao;

/**
 *
 * @author Lucas Donato - RA 31826336
 */
public class Endereco {

    private String logradouro;
    private int numero;
    private String complemento;
    private String bairro;
    private String cidade;
    private String estado;
    private String cep;

    public Endereco(String logradouro, int numero, String complemento, String bairro, String cidade, String estado, String cep) {
        this.logradouro = logradouro;
        this.numero = numero;
        this.complemento = complemento;
        this.bairro = bairro;
        this.cidade = cidade;
        this.estado = estado;
        this.cep = cep;
    }

    public static void imprimirEndereco(Endereco end) {
        System.out.println("**** DADOS ENDEREÇO ****");
        System.out.println(
                "Logradouro: " + end.logradouro + "\n"
                + "Número: " + end.numero + "\n"
                + "Complemento: " + end.complemento + "\n"
                + "Bairro: " + end.bairro + "\n"
                + "Cidade: " + end.cidade + "\n"
                + "Estado: " + end.estado + "\n"
                + "CEP: " + end.cep + "\n"
        );
    }
}
