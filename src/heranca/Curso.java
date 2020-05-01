package heranca;

/**
 *
 * @author Lucas Donato - RA 31826336
 */
public class Curso {

    private int codigo;
    private String nomeCurso;

    public Curso(int codigo, String nomeCurso) {
        this.codigo = codigo;
        this.nomeCurso = nomeCurso;
    }

    /**
     * @return the codigo
     */
    public int getCodigo() {
        return codigo;
    }

    /**
     * @return the nomeCurso
     */
    public String getNomeCurso() {
        return nomeCurso;
    }
}
