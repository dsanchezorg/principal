import java.util.Scanner;
public class Ejercicio6_Monedas {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner teclado=new Scanner(System.in);
		double cantidad=0;
		double cts50=0;
		double cts20=0;
		double cts10=0;
		double cts5=0;
		double cts2=0;
		double cts1=0;
		
		System.out.print("Introduce la cantidad");
		cantidad=teclado.nextDouble();
		
		cts50=cantidad/0.50;
		cantidad=cantidad%0.50;
		
		cts20=cantidad/0.20;
		cantidad=cantidad%0.20;
		
		cts10=cantidad/0.10;
		cantidad=cantidad%0.10;
		
		cts5=cantidad/0.05;
		cantidad=cantidad%0.05;
		
		cts2=cantidad/0.02;
		cantidad=cantidad%0.02;
		
		cts1=cantidad/0.01;
		cantidad=cantidad%0.01;
		
		System.out.println("Su desglose en monedas de centimo es:");
		System.out.println((int)cts50+" monedas de 50 centimos");
		System.out.println((int)cts20+" monedas de 20 centimos");
		System.out.println((int)cts10+" monedas de 10 centimos");
		System.out.println((int)cts5+" monedas de 5 centimos");
		System.out.println((int)cts2+" monedas de 2 centimos");
		System.out.println((int)cts1+" monedas de 1 centimo");

		
		}
}
