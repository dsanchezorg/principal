import java.util.Scanner;
public class Ejercicio7_CuadradoHueco {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner teclado=new Scanner(System.in);
		int tamanio=0;
		
		System.out.println("Introduce un numero para detenerminar el cuadrado");
		tamanio=teclado.nextInt();
		
		for(int fline=1; fline<=tamanio; fline++){
			System.out.print("* ");
		}
		System.out.println();
		for (int astline=1; astline<=tamanio-2; astline++){
			System.out.print("* ");
			for (int espline=1; espline<=tamanio-2; espline++){
				System.out.print("  ");
		}System.out.print("* ");
		
		System.out.println();
		}
		for(int fline=1; fline<=tamanio; fline++){
			System.out.print("* ");
		}
	}
}
