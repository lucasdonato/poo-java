package heranca;

/**
 *
 * @author Lucas Donato - RA 31826336
 */
public class Data {

    private int dia;
    private int mes;
    private int ano;

    public Data(int dia, int mes, int ano) {
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }

    public String formatarData() {
        String msg = dia + "/" + mes + "/" + ano;
        return msg;
    }

    public void calcularPeriodo() {

    }
}
