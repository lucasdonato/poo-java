package heranca;

/**
 *
 * @author Lucas Donato - RA 31826336
 */
public class Hora {

    private int hora;
    private int min;
    private int seg;

    public Hora(int hora, int min, int seg) {
        this.hora = hora;
        this.min = min;
        this.seg = seg;
    }

    public String formatarHora() {
        String msg = hora + ":" + min + ":" + seg;
        return msg;
    }

    public void calcularDuracao() {

    }
}
