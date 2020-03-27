package encapsulamento;
/**
 *
 * @author Lucas Donato - 31826336
 */
public class TimeTest {
    public static void main(String[] args) {
        
        /*realiza as chamadas dos 4 construtores
        pedidos no exercício*/
        Time t1 = new Time();
        System.out.println(t1.exibeHora());  //poderia criar dentro do construtor      
        Time t2 = new Time(23);
        System.out.println(t2.exibeHora());        
        Time t3 = new Time(23,59);
        System.out.println(t3.exibeHora());        
        Time t4 = new Time(23,59,59);
        System.out.println(t4.exibeHora()); 
        
        /*utilizando o setTime sem o construtor*/
        t4.setTime(59,59,59);
        System.out.println(t4.exibeHora()); 
        
    }
}
