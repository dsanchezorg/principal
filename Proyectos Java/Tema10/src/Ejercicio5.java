import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		// TODO Apéndice de método generado automáticamente
		
		Scanner teclado=new Scanner(System.in);
		int a, r, h, l;
		float b;
		do{
			System.out.println("Menu\n--------------------------------\n1.-Area del circulo\n2.-Area del rectangulo\n3.-Area del triangulo\n0.-Salir");
			a=teclado.nextInt();
			switch(a){
			case 3:
				System.out.println("Introduce altura:");
				h=teclado.nextInt();
				System.out.println("Introduce largo:");
				l=teclado.nextInt();
				b=h*l;
				System.out.println("El area es "+b);
				break;
			case 2:
				System.out.println("Introduce altura:");
				h=teclado.nextInt();
				System.out.println("Introduce base:");
				l=teclado.nextInt();
				b=(h*l)/2;
				System.out.println("El area es "+b);
				break;
			case 1:
				System.out.println("Introduce el radio");
				r=teclado.nextInt();
				b=(float)(r*r*(3.1415));
				break;
			case 0:
				System.out.println("Adios");
				break;
			default:
				System.out.println("Error, introduce un valor del menu.");
			}
		}while(a!=0);

	}

}
