import java.util.Scanner;
public class Ej7_ComaFlotante {

	static float [] valores;

	public static void cargaValores(){
		valores=new float[25];
		System.out.println("Estos son los 25 valores aleatorios");
		
		for(int i=0; i<valores.length; i++){
			valores[i]=(float)((Math.random()*5.7)+1.20);
			System.out.print(valores[i]+" ");
			
			
		}
		System.out.print("\n");
}
	
	public static void valoresMayoresMenores(){
		int acumuladorMayores=0, acumuladorMenores=0;
		float mayor=valores[0], menor=valores[0];
		
		for(int i=0; i<valores.length; i++){
				if(valores[i]<menor){
					menor=valores[i];					
				}
				if(valores[i]>mayor){
					mayor=valores[i];
				}
			}
		System.out.println("El numero mayor es "+mayor);
		System.out.println("El numero menor es "+menor);
	}
	
	public static void valoresMedia(){
		final int divisorMedia=25;
		float suma=0, media=0;
		
		for (int i=0; i<valores.length; i++){
			suma=suma+valores[i];
		}
		media=suma/divisorMedia;
		System.out.println("La media es "+media);
	}
	
	public static void buscaNumero(){
		int i=0;
		boolean flag=false;
		float numero=0;
		@SuppressWarnings("resource")
		Scanner teclado=new Scanner(System.in);
		
		numero=teclado.nextFloat();
		
		while(i<valores.length && !flag){
			if(valores[i]==numero){
				System.out.println("Su numero ha sido encontrado en la posicion "+i);
				flag=true;
			}
		i++;		
			
		}
		if(!flag){
			System.out.println("Su numero no ha sido encontrado");
		}
	}

	
	
	public static void main(String[] args) {
		cargaValores();
		buscaNumero();
		valoresMayoresMenores();
		valoresMedia();
	}
}

