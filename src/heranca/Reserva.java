package heranca;
/**
 *
 * @author Lucas Donato - RA 31826336
 */
public class Reserva {
    private Data data;
    private Hora horarioInicio;
    private Hora horarioTermino;
    private Funcionario funcionario;
    private Professor professor;
    private Turma turma;
    private Sala sala;
    
    public Reserva(Data data, Hora horarioInicio, Hora horarioTermino, Funcionario funcionario,
                    Professor professor, Turma turma, Sala sala){
        
        this.data = data;
        this.horarioInicio = horarioInicio;
        this.horarioTermino = horarioTermino;
        this.funcionario = funcionario;
        this.professor = professor;
        this.turma = turma;
        this.sala = sala;
    }
    
    public int validarReserva(){
        return 0;
    }
}
