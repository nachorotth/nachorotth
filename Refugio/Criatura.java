public class Criatura{
    //Atributos de clase 
    private final static int maxEnergia=100;
    private final static int minEnergia=0;
    private final static int consumoEnergia=10;
    //Atributos de instancia
    private int energia;
    private Refugio refugio;
    private boolean dormido;
    private int caminatas;
    //Constructor
    public Criatura(Refugio r){
        energia=this.maxEnergia;
        refugio=r;
        dormido=false;
        caminatas=0;
    }
    //Comandos
    public boolean comer(){
        boolean si=false;
        if ((refugio.obtenerAlimentos()>0)&&(energia!=maxEnergia)){
            energia++;
            refugio.consumirAlimento();
            si=true;
        }
        return si;
    }
    public boolean beber(){
        boolean si=false;
        if (refugio.obtenerBebidas()>0){
            energia++;
            refugio.consumirBebida();
            si=true;
        }
        return si;
    }
    public boolean dormir(){
        boolean aux=false;
        if ((!(this.estaDormido()))&&(refugio.disponibilidad()>0)){
            this.refugio.ocuparCama();
            this.dormido=true;
            aux=true;
        }
        return aux;
    }
    public boolean despertar(){
        boolean aux=false;
        if (this.estaDormido()){
            this.dormido=false;
            this.refugio.desocuparCama();
            aux=true;
        }
        return aux;
    }
    public boolean caminar(){
        boolean aux=false;
        if ((!(this.estaDormido()))&&(this.energia>this.consumoEnergia)){
            if (caminatas<=3){
                this.energia=this.energia-this.consumoEnergia;
                aux=true;
                }
            else if (this.refugio.obtenerCamas()>0) this.dormir();
                else this.energia=this.minEnergia;
        }
        return aux;
    }
    //Consultas
    public int obtenerEnergia(){
        return this.energia;
    }
    public int obtenerCaminatas(){
        return this.caminatas;
    }
    public int obtenerHumor(){
        int humor=0;
        if (this.energia>0){
            if (this.energia<=40) humor=1;
            else if (this.energia<=70) humor=2;
            else humor=3;
        }
        return humor;
    }
    public Refugio obtenerRefugio(){
        return this.refugio;
    }
    public boolean estaDormido(){
        return this.dormido;
    }
    public boolean estaVivo(){
        boolean vivo=false;
        if (this.energia>this.minEnergia) vivo=true;
        return vivo;
    }
    public boolean mayorEnergia(Criatura c){
        boolean esMayor=false;
        if (this.energia>c.obtenerEnergia()) esMayor=true;
        return esMayor;
    }
    public String toString(){
        return energia+" "+refugio+" "+dormido+" "+caminatas;
    }
}