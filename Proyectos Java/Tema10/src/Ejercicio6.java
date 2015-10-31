import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
		// TODO Apéndice de método generado automáticamente
		
		Scanner teclado=new Scanner(System.in);
		int i, j, a;
		System.out.println("Introduce largo del cuadrado:");
		a=teclado.nextInt();
		for(i=0;i<a;i++){
			for(j=0;j<a;j++)
				System.out.print("* ");
			System.out.print("\n");
		}

	}

}
