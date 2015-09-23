import java.util.Scanner;

public class Ejercicio10_remodelado3 {

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int N=5;
		double A=4.56;
		char C;
		double Suma=0;
		double Resta=0;
		@SuppressWarnings("resource")
		Scanner teclado=new Scanner(System.in);
		System.out.println("Introduce un caracter");
		C=teclado.nextLine().charAt(0);
		Suma=N+A;
		Resta=A-N;
		
		System.out.println("La suma da:" +Suma);
		System.out.println("La resta da:" +Resta);
		System.out.println("La letra "+C+" es equivalente en ascii a:" +(int)C);
		
	}

}
	

