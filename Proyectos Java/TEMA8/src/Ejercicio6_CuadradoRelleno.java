import java.util.Scanner;
public class Ejercicio6_CuadradoRelleno {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner teclado=new Scanner(System.in);
		int tamanio=0;
		
		System.out.println("Introduce un numero para detenerminar el cuadrado");
		tamanio=teclado.nextInt();
		
		for(int i=0; i<tamanio; i++){
			for(int t=0; t<tamanio; t++){
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}
