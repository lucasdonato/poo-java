package heranca;

/**
 *
 * @author Lucas Donato - RA 31826336
 */
public class TestReserva {

    public static void main(String[] args) {

        //----------------------------------dados da reserva
        Data dataReserva = new Data(01, 05, 20);
        Hora horaInicio = new Hora(15, 30, 58);
        Hora horaTermino = new Hora(21, 00, 00);
        //--------------------------------------------------
        Funcionario func = new Funcionario(00001, "(Funcionário) Lucas Donato", "(31)99269-5256", "lucaspolimig96@gmail.com");
        Curso curso = new Curso(666, "POO JAVA");
        Professor prof = new Professor(0000123456, "(Professor)Lucas Donato", "(31)9999-4444", "emailprof@teste.com", "Coordenador", curso);
        Turma turma = new Turma(curso, "Tarde", "5º", 60);
        Sala sala = new Sala(516, 60, 8, 10, true, true); //aqui eu utilizo o construtor completo da classe sala
        SalaAprendizAtivo salaAprendiz = new SalaAprendizAtivo(999999, 10, 15, true, true, 15, 2, 6);

        //-------------------------------------faz a reserva
        Reserva res = new Reserva(dataReserva, horaInicio, horaTermino, func, prof, turma, salaAprendiz);
        res.exibeReserva();

    }
}
