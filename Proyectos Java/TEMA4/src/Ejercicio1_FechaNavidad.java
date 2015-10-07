import java.util.Scanner;
public class Ejercicio1_FechaNavidad {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner teclado=new Scanner(System.in);
		
		int dia=0, mes=0;
		System.out.print("Introduce el dia");
		dia=teclado.nextInt();
		System.out.print("Introduce el numero de mes");
		mes=teclado.nextInt();
		System.out.print("Introduce el año");
		if(dia==25 && mes==12){
			System.out.print("Es navidad");
		}else{
			System.out.print("No es navidad");
		}
		

	}

}
