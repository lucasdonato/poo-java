/*
    ALUNOS: LUCAS DONATO / VITOR JORGE
*/

package pratica01;

public class Conta {
    
    int numeroConta;
    String nomeCliente;
    float saldo;
    float limite;
 
    public float sacar(float valor){
        if(valor > (this.limite + this.saldo) ){
           System.out.println("Atenção, limite insuficiente!");
           return this.saldo;
        }else{
          this.saldo -= valor; 
          return this.saldo;
        }  
    }    
    public float depositar(float valor){
        this.saldo += valor;
        return this.saldo;
    }    
    public void transferir(Conta contaOri, Conta contaDest, float valor){
        if(valor <= contaOri.saldo){
            contaDest.saldo += valor;
            contaOri.saldo -= valor;
        } //se não, não faz nada
    }  
    public void imprimirTransferencia(float saldoIni, Conta c, Conta c2, float valTransf){
        System.out.println("\n***** TRANSFERÊNCIA REALIZADA *****" +
                "\nConta origem:" + c.numeroConta + 
                "\nConta destino:" + c2.numeroConta + 
                "\nValor transferência $" + valTransf + 
                "\nSaldo anterior da conta " + c.numeroConta +  " $" + saldoIni +
                "\nSaldo após a transferência $" + c.saldo + 
                "\nSaldo anterior da conta " + c2.numeroConta +  " $" + saldoIni +
                "\nSaldo após a transferência $" + c2.saldo);
    }
}
