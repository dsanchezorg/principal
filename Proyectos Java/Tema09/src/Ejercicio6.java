import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
		// TODO Ap�ndice de m�todo generado autom�ticamente
		
		Scanner teclado=new Scanner(System.in);
		int a, b=1;
		System.out.println("Introduce el numero:");
		a=teclado.nextInt();
		for(a=a;a>0;a--){
			b=b*a;
		}
		System.out.println(b);
	}

}
