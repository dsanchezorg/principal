import java.util.Random;

@SuppressWarnings("unused")
public class Ej1_Acumulados {
	
	static int [] valores;

	public static void cargaValores(){
		valores=new int[8];
		int numeroValores=0;
		
		for(int i=0; i<valores.length; i++){
			numeroValores=(int)(Math.random()*100)+1;
			valores[i]=numeroValores;
			System.out.print(valores[i]+" ");
		}
		
		
	}
	
	public static void valoresAcumulados(){
		int acumulado=0;
		
		for(int i=0; i<valores.length; i++){
			acumulado=acumulado+valores[i];
		}
		System.out.print("\n");
		System.out.println("El valor acumulado del array es: "+acumulado+" ");
	}
	
	public static void valoresAcumuladosMayoresDe36(){
		int acumulado=0;
		
		for(int i=0; i<valores.length; i++){
			
				if(valores[i]>=36){
					acumulado=acumulado+valores[i];
				}
			}
		System.out.println("El valor acumulado del array de numeros mayores que 36 es : "+acumulado);
	}
	
	public static void valoresAcumuladosMayoresDe50(){
		int acumulador=0;
		
		for(int i=0; i<valores.length; i++){
				if(valores[i]>=50){
					acumulador++;
				}
			}
		System.out.println("Hay "+acumulador+" mayor/es de 50");
	}
	
	
	
	public static void main(String[] args) {
		
		
		cargaValores();
		valoresAcumulados();
		valoresAcumuladosMayoresDe36();
		valoresAcumuladosMayoresDe50();

	}

}
