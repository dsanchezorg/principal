
import java.util.Scanner;

public class Ejercicio2_SueldOperario {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int pHora=0;
		float nHora=0;
		float Sueldo=0;
		@SuppressWarnings("resource")
		Scanner teclado=new Scanner(System.in);
		System.out.println("Introduce numero de horas");
		nHora=teclado.nextInt();
		System.out.println("Introduce precio de la hora");
		pHora=teclado.nextInt(); 
		Sueldo=nHora*pHora;
		System.out.println("Usted va a cobrar "+Sueldo);
	}


}
