public class Territorio{
    //Atributos de instancia
    private Refugio [][] t;
    private int cf,cc,cont1;
    //Constructor
    public Territorio(int nf, int nc){
        t= new Refugio[nf][nc];
        cf=nf;
        cc=nc;
        cont1=0;
    }
    //Comandos
    public void establecerRefugio(Refugio r, int f, int c){
        t[f][c]=r;    
    }
    //Consultas
    public int cantFilas(){
        return t.length;
    }
    public int cantColumnas(){
        return t[0].length;
    }
    public int cantRefugios(){
        for (int i=0; i<cantFilas(); i++){
            for (int j=0; j<=cantColumnas(); j++){
                if (t[i][j]!=null) cont1++;
            }
        }
        return cont1;
    }
    public int filaMasPoblada(){
        int cont=0, filaMasGrande=0, viejoCont=0;
        for (int i=0; i<cantFilas(); i++){
            viejoCont=cont;
            cont=0;
            for (int j=0; j<=cantColumnas(); j++){
                if (t[i][j]!=null) cont++;
            }
            if (!(viejoCont>cont)) filaMasGrande=i;
        }
        return filaMasGrande;
    }
    public int cantConDisponibilidadMayor(int m){
        int cont=0;
        for (int i=0; i<cantColumnas(); i++){
            for (int j=0; j<=cantFilas(); j++){
                if (t[j][i].disponibilidad()>m){
                    cont++;
                    break;
                }
            }
        }
        return cont;
    }
    public Territorio clone(){
        Territorio aux1;
        aux1= new Territorio(cantFilas(), cantColumnas());
        for (int i=0; i<cantFilas(); i++){
            for (int j=0; j<=cantColumnas(); j++){
                aux1.establecerRefugio(t[i][j].clone(),i,j);
            }
        }
        return aux1;
    }
    
    
}