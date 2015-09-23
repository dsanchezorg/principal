import java.util.Scanner;
public class Ejercicio8_Numeros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		Scanner teclado=new Scanner(System.in);
		float A=0, B=0, C=0, D=0, suma=0, producto=0;
		System.out.println("introduce el valor de A");
		A=teclado.nextFloat();
		System.out.println("introduce el valor de B");
		B=teclado.nextFloat();
		System.out.println("introduce el valor de C");
		C=teclado.nextFloat();
		System.out.println("introduce el valor de D");
		D=teclado.nextFloat();
		suma=A+B;
		producto=C*D;
		System.out.println("La suma de A+B es:" +suma);
		System.out.println("La multiplicacion de C*D es:" +producto);
	}

}
