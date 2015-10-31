import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		// TODO Apéndice de método generado automáticamente
		
		Scanner teclado=new Scanner(System.in);
		int i, a, j=0, b, h;
		float s;
		System.out.println("Nuemero de triangulos:");
		a=teclado.nextInt();
		for(i=0;i<a;i++){
			System.out.println("Introduce Base:");
			b=teclado.nextInt();
			System.out.println("Introduce altura:");
			h=teclado.nextInt();
			s=b*h/2;
			System.out.println("La base es " + b + ", la altura es " + h + " y la superficie es " + s);
			if(s>12)
				j++;
		}
		if(j>0)
			System.out.println("El numero de triangulos cuya superficie es mayor que 12 es " + j);
		
	}

}
