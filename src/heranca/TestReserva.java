package heranca;
/**
 *
 * @author Lucas Donato - RA 31826336
 */
public class TestReserva {
    public static void main(String[] args){
        
        System.out.println("***** RESERVA DE SALAS *****");
        
        Curso curso_1 = new Curso(00001, "POO");
        Turma tuma_1 = new Turma(curso_1, "Noite","4º", 50);
        Professor professor_1 = new Professor(0001, "Lucas Donato", "(31)992695256", "lucaspolimig96@gmail.com", "Professor sênior", curso_1);
        SalaAprendizAtivo salaAprendiz_1 = new SalaAprendizAtivo(0001, 60, 200, 300, true, true, 10, 3, 2);
        Laboratorio lab_1 = new Laboratorio(0002, 200, 500, 600, false, true, 10, 3, 500, 600, 10000, "Windows 10");
        Sala sala_1 = new Sala(0003, 200, 1000, 2000, true, true);
        
        //fazer reserva com as datas
    }    
}
