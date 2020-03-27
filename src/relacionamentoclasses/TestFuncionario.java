package relacionamentoclasses;

import java.text.DecimalFormat;

/**
 *
 * @author Lucas Donato RA - 31826336
 * Vitor Jorge
 */
public class TestFuncionario {

    public static void main(String[] args) {
        /*poderia criar N objetos
        departamentos, funcionario, cargo*/
        DecimalFormat df = new DecimalFormat("0.00");
        Funcionario func = new Funcionario();
        Departamento dpto = new Departamento();
        Cargo carg = new Cargo();

        System.out.println("***** SISTEMA DE RECURSOS HUMANOS *****");
        /*
         os getters e setters estão disponíveis em todas as classes;
         então caso queria recuperar/alterar qualquer propriedade das classes
         basta chamar diretamente setX() ou getY();
         */
        /*REALIZA OS CADASTROS*/
        carg.cadastrarCargo("Analista de Testes SR", "Analista teste pleno III");
        dpto.cadastrarDepartamento("Desenvolvimento", 1555, "depto@teste.com", "Donato", "992695256");
        func.cadastrarFunc("Lucas Donato", 0001, "482.003.940-77", "lucaspolimig96@gmail.com", "Rua X", 5000, null, 5000.00, 1, dpto.getNome(),carg.getNome());
        //passar objetos no cadastrar func
        
        /*EXIBE DADOS DO FUNCIONÁRIO, CARGO E DEPARTAMENTO*/
        func.exibeFunc();
        carg.exibeCargo();
        dpto.exibeDepartamento();
        
        /**
         * *********REALIZA OS TESTES DE SALÁRIO BRUTO**********
         */
        System.out.println("TESTES SALÁRIO BRUTO");
        func.calcularSB(1000, 0);
        System.out.println("$" + df.format(func.getSalario_bruto()));
        func.calcularSB(1000, 3);
        System.out.println("$" + df.format(func.getSalario_bruto()));
        func.calcularSB(1000, 31);
        System.out.println("$" + df.format(func.getSalario_bruto()));

        /**
         * *********REALIZAR OS TESTES DE SALÁRIO LIQUIDO**********
         */
        System.out.println("TESTES SALÁRIO LIQUIDO");
        func.calcularSL(1000, 0);
        System.out.println("$" + df.format(func.getSalario_liquido()));
        func.calcularSL(4000, 2);
        System.out.println("$" + df.format(func.getSalario_liquido()));
        func.calcularSL(2500, 0);
        System.out.println("$" + df.format(func.getSalario_liquido()));
        
    }
}
