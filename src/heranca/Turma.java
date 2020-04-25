package heranca;
/**
 *
 * @author Lucas Donato - RA 31826336
 */
public class Turma {
    private Curso curso;
    private String turno;
    private String periodo;
    private int qtdAlunosMatric;
    
    public Turma(Curso curso, String turno, String periodo, int qtdAlunosMatric){
        this.curso = curso;
        this.turno = turno;
        this.periodo = periodo;
        this.qtdAlunosMatric = qtdAlunosMatric;
    }
}
