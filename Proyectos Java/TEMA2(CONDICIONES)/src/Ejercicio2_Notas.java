import java.util.Scanner;

public class Ejercicio2_Notas {
	public static void main(String[] args){
		
		float nota1=0, nota2=0, nota3=0, promedio;
		
		@SuppressWarnings("resource")
		Scanner teclado=new Scanner(System.in);
		System.out.println("Introduce tus tres notas para saber si estas aprobado");
		nota1=teclado.nextFloat();
		System.out.println("");
		nota2=teclado.nextFloat();
		System.out.println("");
		nota3=teclado.nextFloat();
		System.out.println("");
		
		promedio=(nota1+nota2+nota3)/3;
		
		if(promedio>=7){
			System.out.println("su promedio es de "+promedio+" usted esta aprobado");
		}else System.out.println("su promedio es de "+promedio+" usted esta suspenso");
		
	}
}
