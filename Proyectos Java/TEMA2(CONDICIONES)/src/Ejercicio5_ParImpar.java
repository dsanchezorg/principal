import java.util.Scanner;
public class Ejercicio5_ParImpar {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner teclado=new Scanner(System.in);
		int n1=0, modulo=0;
		
		System.out.println("Introduzca un numero");
		n1=teclado.nextInt();
		
		modulo=n1%2;
		
		if(modulo==0){
			System.out.println("Su numero es par");
		}else {System.out.println("Su numero es impar");
			}
	}

}
