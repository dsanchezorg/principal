import java.util.Scanner;
public class Ejercicio4_Menu {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner teclado=new Scanner(System.in);
		
		int suma=0, multi=0, n1, n2, interruptor=0;
		
		
		do{
			System.out.println("Pulse '1' para Sumar dos numeros");
			System.out.println("Pulse '2' para Multiplicar dos numeros");
			System.out.println("Pulse '0' para Salir");
			
			interruptor=teclado.nextInt();
			
			switch (interruptor){
			case 1: 
				System.out.println("Introduzca el primer numero");
				n1=teclado.nextInt();
				System.out.println("Introduzca el Segundo numero");
				n2=teclado.nextInt();
				
				suma=n1+n2;
				
				System.out.println("La suma es "+suma); break;
				
			case 2: 
				System.out.println("Introduzca el primer numero");
				n1=teclado.nextInt();
				System.out.println("Introduzca el Segundo numero");
				n2=teclado.nextInt();
				
				multi=n1*n2;
				
				System.out.println("La multiplicacion es "+multi); break;
				
			case 0: break;
			}
			
			
			
		}while(interruptor != 0);

	}

}
