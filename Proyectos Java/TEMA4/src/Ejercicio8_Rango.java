import java.util.Scanner;
public class Ejercicio8_Rango {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner teclado=new Scanner(System.in);
		
		int numero=0;
		
		System.out.print("Ingrese un numero que este fuera del rango [5-40]");
		numero=teclado.nextInt();
		
		if (numero<=40 && numero>=5){
			System.out.print("Error, ha ingresado un numero del rango [5-40]");
		}else {
			System.out.print("Su numero es "+numero);
		}
	}

}
