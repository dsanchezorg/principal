import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		// TODO Apéndice de método generado automáticamente
		
		Scanner teclado=new Scanner(System.in);
		int i , a, b=0;
		for(i=0;i<10;i++){
			System.out.println("Introduce numero " + (i+1) + ":");
			a=teclado.nextInt();
			if(i>=5)
				b=b+a;
		}
		System.out.println("La suma es: " + b);
	}

}
