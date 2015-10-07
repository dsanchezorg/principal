import java.util.Scanner;
public class Ejercicio7_Ingresos {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner teclado=new Scanner(System.in);
		
		double saldoinicial=0, cantidad=0;
		char tecla;
		
		System.out.print("De cuanto es su saldo inicial?");
		saldoinicial=teclado.nextDouble();
		System.out.print("Cuanto quiere ingresar o retirar?");
		cantidad=teclado.nextDouble();
		
		
		
		System.out.print("marque 'i' si quiere hacer un ingreso o 'r' ri quiere sacar dinero");
		tecla=(char) teclado.next().charAt(0);

		
		switch (tecla){
		case 'I':
			System.out.println("Su saldo ha sido incrementado a "+(saldoinicial+cantidad)+"€");
			break;
		case 'i':
			System.out.println("Su saldo ha sido incrementado a "+(saldoinicial+cantidad)+"€");
			break;
		case 'R':
			System.out.println("Su saldo ha sido decrementada a "+(saldoinicial-cantidad)+"€");
			break;
		case 'r':
			System.out.println("Su saldo ha sido incrementado a "+(saldoinicial-cantidad)+"€");
			break;
		default:
			System.out.println("Error");
		}
	}

}
