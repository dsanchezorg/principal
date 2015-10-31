import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {
		// TODO Apéndice de método generado automáticamente
		
		Scanner teclado=new Scanner(System.in);
		int i,j,a;
		System.out.println("Introduce un numero entre 5 y 20:");
		a=teclado.nextInt();
		if(a<=5&a>=20)
			System.out.println("Error");
		for(i=0;i<a;i++){
			if(i==0|i==a-1)
				for(j=0;j<a;j++)
					System.out.print("* ");
			else
				for(j=0;j<a;j++)
					if(j==0|j==a-1)
						System.out.print("* ");
					else
						System.out.print("  ");
			System.out.println("");
		}

	}

}
