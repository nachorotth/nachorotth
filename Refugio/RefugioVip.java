public class RefugioVip extends Refugio{
    //Atributos de clase
    private final static int capacidadSillones=10;
    //Atributos de instancia
    private int sillones;
    //Constructor
    public RefugioVip(int a, int b, int c, int s){
        super(a,b,c);
        sillones=s;
    }    
    //Comandos
    public boolean ocuparSillon(){
        boolean aux0=false;
        if (sillones<capacidadSillones) {
            aux0=true;
            sillones++;
        }
        return aux0;
    }
    public boolean desocuparSillon(){
        boolean aux1=false;
        if (sillones>0){
            aux1=true;
            sillones++;
        }
        return aux1;
    }
    public int disponibilidad(){
        return (super.disponibilidad()+sillones);
    }
    public RefugioVip clone(){
        RefugioVip aux2;
        aux2= new RefugioVip(this.obtenerAlimentos(),this.obtenerBebidas(),this.obtenerCamas(),sillones);
        return aux2;
    }
}