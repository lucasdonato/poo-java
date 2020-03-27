/*
    ALUNOS: LUCAS DONATO / VITOR JORGE
*/

package pratica01;

public class Aula01 {
    public static void main(String[] args) {
        
        Conta c = new Conta();
        c.nomeCliente = "Lucas Donato";
        c.saldo = 100;
        c.numeroConta = 1;
        c.limite = 100;
        
        Conta c2 = new Conta();
        c2.nomeCliente = "Vitor Jorge";
        c2.saldo = 100;
        c2.numeroConta = 2;
        c2.limite = 100;
        
        /*****CASO 1*****/
        System.out.println("------ CASO 1 -------");
        System.out.println("Saldo inicial: $" + c.saldo);        
        System.out.println("Saldo final: $" + c.sacar(50));
        
        /*****CASO 2*****/
        System.out.println("\n------ CASO 2 -------");
        c.depositar(50);
        System.out.println("Saldo inicial: $" + c.saldo);        
        System.out.println("Saldo final: $" +c.sacar(150));
        
        /*****CASO 3*****/
        System.out.println("\n------ CASO 3 -------");
        c.depositar(150);
        System.out.println("Saldo inicial: $" + c.saldo);
        System.out.println("Saldo final: $" + c.sacar(250));
        
        /************TRATAMENTO TRANSFERÊNCIA*************/
        
        final float SALDO_INICIAL = 100;
        
        /*****CASO 1*****/
        c.saldo = 100;
        c2.saldo = 100;      
        c.transferir(c, c2, 50);
        c.imprimirTransferencia(SALDO_INICIAL, c, c2,50);
        
        /*****CASO 2*****/
        c.saldo = 100;
        c2.saldo = 100;      
        c.transferir(c, c2, 100);       
        c.imprimirTransferencia(SALDO_INICIAL, c, c2,100);
        
        /*****CASO 3*****/
        c.saldo = 100;
        c2.saldo = 100;      
        c.transferir(c, c2, 250);
        c.imprimirTransferencia(SALDO_INICIAL, c, c2,250);  
        
    } 
}
