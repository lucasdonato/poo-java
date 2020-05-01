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
            Professor professor, Turma turma, Sala sala) {

        this.data = data;
        this.horarioInicio = horarioInicio;
        this.horarioTermino = horarioTermino;
        this.funcionario = funcionario;
        this.professor = professor;
        this.turma = turma;
        this.sala = sala;
    }

    public boolean validarReserva() {
        return turma.getQtdeAlunosMatriculados() <= sala.getCapacidade();
    }

    public void exibeReserva() {
        System.out.println("***** DADOS DA RESERVA *****");
        System.out.println("Data reserva: " + data.formatarData());
        System.out.println("Horário inicio: " + horarioInicio.formatarHora());
        System.out.println("Horário termino: " + horarioTermino.formatarHora());
        System.out.println("\n***** FUNCIONÁRIO RESPONSÁVEL ***** " + funcionario.exibeFuncionario());
        System.out.println("\n***** PROFESSOR RESPONSÁVEL ***** " + professor.exibeProfessor());
        System.out.println("\n***** TURMA *****");
        System.out.println(turma.exibeTurma());
        System.out.println("\n***** SALA ***** ");
        System.out.println(sala.exibeSala());

        if (validarReserva()) {
            System.out.println("SALA LIBERADA!!!");
        } else {
            System.out.println("\n*** SEM CAPACIDADE SUFICIENTE - NÃO FOI POSSÍVEL RESERVAR A SALA *** ");
        }
    }
}
