import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		// TODO Apéndice de método generado automáticamente
		
		Scanner teclado=new Scanner(System.in);
		int a;
		do{
			System.out.println("Menu\n--------------------------------\n1.-Suma de dos numeros\n2.-Producto de dos numeros\n0.-Salir");
			a=teclado.nextInt();
			switch(a){
			case 1:
				System.out.println("Suma");/*suma*/break;
			case 2:
				System.out.println("Producto");/*producto*/break;
			case 0:
				System.out.println("Adios");
				break;
			default:
				System.out.println("Error, introduce un valor del menu.");
			}
		}while(a!=0);

	}

}
