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
        //---------------------------------------------salas
        Turma turma = new Turma(curso, "Tarde", "5º", 55);
        Sala sala = new Sala(516, 60, 8, 10, true, true); //aqui eu utilizo o construtor completo da classe sala
        SalaAprendizAtivo salaAprendiz = new SalaAprendizAtivo(999999, 10, 15, true, true, 6, 14, 2);
        Laboratorio lab = new Laboratorio(88887, 100, 200, false, true, 22, 2, 140, 16, 1000, "Linux");

        /*Para realizar os testes, basta descomentar as linhas e escolher as quantidades desejadas.*/
        //laboratório
        Reserva res_1 = new Reserva(dataReserva, horaInicio, horaTermino, func, prof, turma, lab);
        res_1.exibeReserva();
        //sala aprendizagem
        //Reserva res_2 = new Reserva(dataReserva, horaInicio, horaTermino, func, prof, turma, salaAprendiz);
        //res_2.exibeReserva();
        //sala
        //Reserva res_3 = new Reserva(dataReserva, horaInicio, horaTermino, func, prof, turma, sala);
        //res_3.exibeReserva();

    }
}
