package heranca;
/**
 *
 * @author Lucas Donato - RA 31826336
 */
public class Professor extends Funcionario{
    private String nivelCargo;
    private Curso curso;
    
    public Professor(int matricula, String nome, String telefone, String email,String nivelCargo, Curso curso){
        super(matricula,nome,telefone,email);
        this.nivelCargo = nivelCargo;
        this.curso = curso;       
             
    }
}
