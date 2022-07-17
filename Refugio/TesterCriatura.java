public class TesterCriatura{
	public static void main(String[] a){
		Refugio r1,r2,r3;
		Criatura c1,c2,c3,c4,c5,c6,c7,c8,c9,c10,c11,c12,c13,c14,c15;
		r1= new Refugio(10,10,10);
		r2= new Refugio(10,10,10);
		r3= new Refugio(10,10,10);
		c1= new Criatura(r1);
		c2= new Criatura(r1);
		c3= new Criatura(r1);
		c4= new Criatura(r1);
		c5= new Criatura(r1);
		c6= new Criatura(r2);
		c7= new Criatura(r2);
		c8= new Criatura(r2);
		c9= new Criatura(r2);
		c10= new Criatura(r2);
		c11= new Criatura(r3);
		c12= new Criatura(r3);
		c13= new Criatura(r3);
		c14= new Criatura(r3);
		c15= new Criatura(r3);
		c1.comer()		;
		c2.comer()		;
		c3.comer()		;
		c4.comer()		;
		c5.comer()		;
		c6.comer()		;
		c7.comer()		;
		c8.comer()		;
		c9.comer()		;
		c10.comer()		;
		c11.comer()		;
		c12.comer()		;
		c13.comer()		;
		c14.comer()		;
		c15.comer()		;
		System.out.println(r1.obtenerAlimentos());
		System.out.println(r2.obtenerAlimentos());
		System.out.println(r3.obtenerAlimentos());
		System.out.println(c1.obtenerEnergia());		
	}
}