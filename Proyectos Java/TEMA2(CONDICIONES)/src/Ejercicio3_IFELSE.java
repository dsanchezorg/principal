import java.util.Scanner;

public class Ejercicio3_IFELSE {
	public static void main(String[] args){
		
		@SuppressWarnings("resource")
		Scanner teclado=new Scanner(System.in);
		int n1=0;
		System.out.println("Introduce un numero del 1 al 99 y lo comprobare");
		n1=teclado.nextInt();
		
		if(n1>=1 || n1<=99){
			System.out.println("El numero introducido es "+n1);
		}else{
			System.out.println("Error");
		}
	}
}
