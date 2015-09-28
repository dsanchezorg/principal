import java.util.Scanner;
public class Ejercicio1 {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner teclado=new Scanner(System.in);
		int n1=0;
		
		System.out.println("Introduce un numero: ");
		n1=teclado.nextInt();
		
		if(n1<0){
			System.out.println("El numero introducido es negativo");
		}else if(n1==0){
			System.out.println("El numero es nulo");
		}else{
			System.out.println("El numero introducido es positivo");
		}
	}

}
