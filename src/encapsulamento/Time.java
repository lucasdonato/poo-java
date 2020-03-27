package encapsulamento;
/**
 *
 * @author Lucas Donato - 31826336
 */
public class Time {
    private int hora;
    private int min;
    private int seg;
    boolean dataValida = true;
    
    //inicio construtores
    public Time(){
        /*o padrão sem setar já será 0 por causa do
        tipo da variável, porém eu quero setar a flag
        para na hora da impressão mostrar 0:0:0*/
        dataValida = false;
    }     
    public Time(int hora){
        setHora(hora);
    }
    public Time(int hora, int min){
        setHora(hora);
        setMin(min);
    }
    public Time(int hora, int min, int seg){
        setHora(hora);
        setMin(min);
        setSeg(seg);
    }
    //fim construtores
    
   public void setTime(int hora,int min,int seg){
       setHora(hora);
       setMin(min);
       setSeg(seg);
   }  
   
    /*o final foi utilizado por que 
    os set e get dentro dos construtores apresenteram
    o seguinte warning: chamada de metódo substituível no construtor,
    como por enquanto não temos intenção de usar herança, coloquei final*/
    public int getHora() {
        return hora;
    }
    public final void setHora(int hora) {
        if(hora >= 0 && hora <=23){
            this.hora = hora;
        }else{
            dataValida = false;
        }    
    }
    public int getMin() {
        return min;
    }
    public final void setMin(int min) {        
        if(min >= 0 && min <=59){
            this.min = min;
        }else{
            dataValida = false;
        }   
    }
    public int getSeg() {
        return seg;
    }    
    public final void setSeg(int seg) {
        if(seg >= 0 && seg <=59){
            this.seg = seg;
        }else{
            dataValida = false;
        } 
    }
    public String exibeHora(){
        if(dataValida){
            return this.hora + ":" + this.min + ":" + this.seg;
        }else{
            return "0:0:0";
        }
    }
}
