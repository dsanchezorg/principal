import java.util.Scanner;

public class Ejercicio5_INCREMENTO {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int N=0;
			@SuppressWarnings("resource")
			Scanner teclado=new Scanner(System.in);
			System.out.println("Introduce un valor para N");
			N=teclado.nextInt();
			N=N+77;
			System.out.println("El valor actual de N despues de incrementarlo en 77 es:" +N);
			N=N-3;
			System.out.println("El valor actual de N tras decrementarlo en 3 es:" +N);
			N=N*2;
			System.out.println("El valor actual de N tras haberlo multiplicado por 5 es:" +N);
				}
}
