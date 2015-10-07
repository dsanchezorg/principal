import java.util.Scanner;
public class Ejercicio1_CambioLetras {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner tec=new Scanner(System.in);
		char C;
		System.out.println("Escribe una frases y cambiaré");
		String moto=tec.nextLine();
		System.out.println("Introduce una vocal para cambiarla");
		C=tec.next().charAt(0);
		
		System.out.print("Su palabra es "+moto.replace('a', C).replace('e', C).replace('i', C).replace('o', C).replace('u', C).replace('A', C).replace('E', C).replace('I', C).replace('O', C).replace('U', C));
		
		
	}
}
