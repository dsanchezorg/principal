import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		// TODO Ap�ndice de m�todo generado autom�ticamente
		
		Scanner teclado=new Scanner(System.in);
		int a, b=0;
		do{
			System.out.println("Introduce un numero:");
			a=teclado.nextInt();
			if(a!=9999)
				b=b+a;
		}while(a!=9999);
		System.out.print("La acumulaci�n es de " + b);
		if(b>0)
			System.out.print(" y es positivo.");
		else if(b<0)
			System.out.print(" y es negativo.");
		else
			System.out.print(" y es cero.");

	}

}
