import java.util.Scanner;

public class Ejercicio2_CUENTANUMERO {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner teclado=new Scanner(System.in);
		
		int n1=0;
		
		System.out.println("Introduce un numero de 1,2 o 3 cifras");
		n1=teclado.nextInt();
		
		if(n1<=0){
			System.out.println("Error, el numero es menor que 1");
		}else if (n1>=1000){
			System.out.println("Error, el numero es mayor que 999");
		}else {
			if(n1<10){
				System.out.println("El numero es de 1 cifra");
			}else if(n1<100){
				System.out.println("El numero es de 2 cifras");
			}else{
				System.out.println("El numero es de 3 cifras");
			}
		}
		

	}

}
