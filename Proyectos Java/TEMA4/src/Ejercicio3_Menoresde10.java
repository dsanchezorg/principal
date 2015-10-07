import java.util.Scanner;
public class Ejercicio3_Menoresde10 {
	public static void main(String[] args) {
		int n1=0, n2=0, n3=0;
		@SuppressWarnings("resource")
		Scanner teclado=new Scanner(System.in);
		
		System.out.print("introdce un primer numero");
		n1=teclado.nextInt();
		System.out.print("Introduce el segundo numero");
		n2=teclado.nextInt();
		System.out.print("Introduce el tercer numero");
		n3=teclado.nextInt();
		
		if (n1<10 && n2<10 && n3<10){
			System.out.print("Todos los valores son menores de 10");
		}else {
			System.out.print("Alguno de los valores es mayor de 10");
		}
	}
}
