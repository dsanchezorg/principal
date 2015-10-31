import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		// TODO Apéndice de método generado automáticamente
		
		Scanner teclado=new Scanner(System.in);
		int a;
		float b;
		do{
			System.out.println("Introduce numero de cuenta:");
			a=teclado.nextInt();
			System.out.println("Introduce saldo:");
			b=teclado.nextFloat();
			if(a>0)
				if(b>0)
					System.out.println("La cuenta "+a+" es acreedora.");
				else if(b<0)
					System.out.println("La cuenta "+a+" es deudora.");
				else
					System.out.println("La cuenta "+a+" es nula.");
		}while(a>0);

	}

}
