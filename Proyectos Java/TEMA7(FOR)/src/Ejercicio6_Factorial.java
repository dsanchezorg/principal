import java.util.Scanner;
public class Ejercicio6_Factorial {

	
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner teclado=new Scanner(System.in);
		
		int n=0, contador=0, guardado=0; 
		
		System.out.println("Introduce un número");
		n=teclado.nextInt();
		guardado=n;
		for(contador=n-1;contador>1;contador--){
			n=n*contador;
		}System.out.println("El factorial del numero "+guardado+" es "+n);
	}	
}
