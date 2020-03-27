package relacionamentoclasses;
/**
 *
 * @author Lucas Donato RA - 31826336
 * Vitor Jorge
 */
public class Funcionario {

    private int numRegistro;
    private int qtd_dependentes;
    private double salario_bruto;
    private String nome;
    private String logradouro;
    private int num;
    private String cpf;
    private String email;
    private String complemento;
    private int faltas;
    private double salario_liquido;
    private final double INSS = 0.11;
    private String departamento;
    private String cargo;
    
    /*METODOS DO FUNCIONÁRIO*/
    public void cadastrarFunc(String nome, int numRegistro, String cpf, String email,
            String logradouro, int num, String complemento, double salario_bruto,
            int qtd_dependentes, String departamento, String cargo) {
        this.nome = nome;
        this.numRegistro = numRegistro;
        this.cpf = cpf;
        this.email = email;
        this.logradouro = logradouro;
        this.num = num;
        this.complemento = complemento;
        this.salario_bruto = salario_bruto;
        this.qtd_dependentes = qtd_dependentes;
        this.departamento = departamento;
        this.cargo = cargo;        
    }

    public void exibeFunc() {
        System.out.println(
                "=== Dados do funcionário cadastrado === \n"
                + "Nome: " + this.nome + "\n"
                + "Núm Registro: " + this.numRegistro + "\n"
                + "CPF: " + this.cpf + "\n"
                + "Email: " + this.email + "\n"
                + "Logradouro: " + this.logradouro + "\n"
                + "Complemento: " + this.complemento + "\n"
                + "Salário bruto: " + this.salario_bruto + "\n"
                + "Qtde. Dependentes: " + this.qtd_dependentes + "\n"
                + "Cargo: " + this.cargo + "\n"
                + "Departamento: " + this.departamento + "\n"
        );
    }

    public double calculaIRPF(double salarioBruto) {
        if (salarioBruto > 0 && salarioBruto < 1903.98) {
            return 0;
        } else if (salarioBruto >= 1903.99 && salarioBruto < 2826.65) {
            return 7.5 / 100;
        } else if (salarioBruto >= 2826.66 && salarioBruto < 3751.05) {
            return 15.0 / 100;
        } else if (salarioBruto >= 3751.06 && salarioBruto < 4664.68) {
            return 22.5 / 100;
        } else if (salarioBruto > 4664.68) {
            return 27.5 / 100;
        } else {
            //salário negativo
            return 0.0;
        }
    }

    public void calcularSB(double salarioBruto, int num_faltas) {
        validarFaltas(num_faltas);
        this.salario_bruto = salarioBruto - ((salarioBruto / 30) * faltas);
    }

    public void calcularSL(double salarioBruto, int num_faltas) {
        /*reaproveitando o metodo de calcular salário bruto
         isso garante que independente da orgem que os metodos forem chamados,
         o salário liquido será calculado corretamente*/
        calcularSB(salarioBruto, num_faltas);
        salario_liquido = this.salario_bruto - (salarioBruto * INSS + salarioBruto * calculaIRPF(salarioBruto));
    }

    //valida o número de faltas
    public void validarFaltas(int numFaltas) {
        if (numFaltas < 0 || numFaltas > 30) {
            setFaltas(0); //ou atribuir direto
        } else {
            setFaltas(numFaltas); //ou atribuir direto
        }
    }

    /**
     * @return the numRegistro
     */
    public int getNumRegistro() {
        return numRegistro;
    }

    /**
     * @param numRegistro the numRegistro to set
     */
    public void setNumRegistro(int numRegistro) {
        this.numRegistro = numRegistro;
    }

    /**
     * @return the num
     */
    public int getNum() {
        return num;
    }

    /**
     * @param num the num to set
     */
    public void setNum(int num) {
        this.num = num;
    }

    /**
     * @return the qtd_dependentes
     */
    public int getQtd_dependentes() {
        return qtd_dependentes;
    }

    /**
     * @param qtd_dependentes the qtd_dependentes to set
     */
    public void setQtd_dependentes(int qtd_dependentes) {
        this.qtd_dependentes = qtd_dependentes;
    }

    /**
     * @return the salario_bruto
     */
    public double getSalario_bruto() {
        return salario_bruto;
    }

    /**
     * @param salario_bruto the salario_bruto to set
     */
    public void setSalario_bruto(double salario_bruto) {
        this.salario_bruto = salario_bruto;
    }

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the logradouro
     */
    public String getLogradouro() {
        return logradouro;
    }

    /**
     * @param logradouro the logradouro to set
     */
    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    /**
     * @return the cpf
     */
    public String getCpf() {
        return cpf;
    }

    /**
     * @param cpf the cpf to set
     */
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return the complemento
     */
    public String getComplemento() {
        return complemento;
    }

    /**
     * @param complemento the complemento to set
     */
    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    /**
     * @return the faltas
     */
    public int getFaltas() {
        return faltas;
    }

    /**
     * @param faltas the faltas to set
     */
    public void setFaltas(int faltas) {
        this.faltas = faltas;
    }

    /**
     * @return the salario_liquido
     */
    public double getSalario_liquido() {
        return salario_liquido;
    }

    /**
     * @param salario_liquido the salario_liquido to set
     */
    public void setSalario_liquido(double salario_liquido) {
        this.salario_liquido = salario_liquido;
    }

    /**
     * @return the departamento
     */
    public String getDepartamento() {
        return departamento;
    }

    /**
     * @param departamento the departamento to set
     */
    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    /**
     * @return the cargo
     */
    public String getCargo() {
        return cargo;
    }

    /**
     * @param cargo the cargo to set
     */
    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
}
