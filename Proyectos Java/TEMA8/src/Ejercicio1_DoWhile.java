import java.util.Scanner;
public class Ejercicio1_DoWhile {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner teclado=new Scanner(System.in);
		
		int numero=0, suma=0;
		
		do{
			System.out.println("Ingrese un numero");
			numero=teclado.nextInt();
				if(numero != 9999){
					suma+=numero;
				}
		}while(numero != 9999);
		
		System.out.println("El numero acumulado es: "+suma);
		if(suma<0){
			System.out.println("El numero es menor que 0");
		}else if (suma == 0){
			System.out.println("El numero es igual a 0");
		}else{
			System.out.println("El numero es mayor que 0");
		}
	}

}
