import java.util.Scanner;
public class Ejercicio2 {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner teclado=new Scanner(System.in);
		int n1=0, n2=0, n3=0, resultado=0;
		
		System.out.print("introdce un primer numero");
		n1=teclado.nextInt();
		System.out.print("Introduce el segundo numero");
		n2=teclado.nextInt();
		System.out.print("Introduce el tercer numero");
		n3=teclado.nextInt();
		
		if (n1==n2 && n1==n3){
			resultado=(n1+n2)*n3;
			System.out.print("El resultado es "+resultado);
			}else {
				System.out.print("Error");
			}
		

	}

}
