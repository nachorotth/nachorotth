public class Refugio{
    //Atributos de clase 
    private static final int capacidadAlacena=20;
    private static final int capacidadCamas=10;
    //Atributos de instancia
    protected int alimentos;
    protected int bebidas;
    protected int camas;
    //Constructor
    public Refugio(int a, int b, int c){
        if (a+b >= capacidadAlacena) {
            alimentos=10;
            bebidas=10;
        }
        else {
        alimentos=a;
        bebidas=b;    
        }
        if (c>capacidadCamas) camas=10;
        else camas=c;
    }
    //Comandos
    public void consumirAlimento(){
        alimentos--;
    }
    public void consumirBebida(){
        bebidas--;
    }
    public boolean desocuparCama(){
        boolean aux0=false;
        if (camas>0) {
            aux0=true;
            camas--;
        }
        return aux0;
    }
    public boolean ocuparCama(){
        boolean aux1=false;
        if (camas<capacidadCamas) {
            aux1=true;
            camas++;
        }
        return aux1; 
    }
    public boolean reponerAlimento(int n){
        boolean aux2=false;
        if (n>=0 && alimentos+n+bebidas<=capacidadAlacena){
            alimentos=alimentos+n;
            aux2=true;
        }
        return aux2;
    }
    public boolean reponerBebidas(int n){
        boolean aux3=false;
        if (n>=0 && alimentos+n+bebidas<=capacidadAlacena){
            bebidas=bebidas+n;
            aux3= true;
        }
        return aux3;    
    }
    //Consultas
    public int obtenerAlimentos(){
        return alimentos;
    }
    public int obtenerBebidas(){
        return bebidas;
    }
    public int obtenerCamas(){
        return camas;
    }
    public int obtenerCapacidadAlacena(){
        return capacidadAlacena;
    }
    public int disponibilidad(){
        return capacidadCamas-camas;
    }
    public int diasSupervivencia(){
        int aux4=0;
        if (bebidas<alimentos) aux4=bebidas;
        else aux4=alimentos;
        return aux4;
    }
    public boolean mayorAlimentos(Refugio r){
        boolean aux5=false;
        Refugio e= (Refugio) r;
        if (e!=null && alimentos>e.obtenerAlimentos()) aux5=true;
        return aux5;
    }
    public boolean equals(Refugio r){
        boolean es=false;
        if (r!=null) es= (bebidas==r.obtenerBebidas()) && (alimentos==r.obtenerAlimentos()) && (camas==r.obtenerCamas());
        return es;
    }
    public Refugio clone(){
        return new Refugio(alimentos,bebidas,camas);
    }
    public String toString(){
        return (alimentos+" "+bebidas+" "+camas);
    }
}