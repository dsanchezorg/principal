import java.util.Scanner;
public class Ejercicio12_MuestraCarac {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner teclado=new Scanner(System.in);
		
		String cadena="", cadenaR="";
		int largo=0;
		
		System.out.println("Introduce una palabra por teclado");
		cadena=teclado.nextLine();
		
		largo=cadena.length();
		
		for(int contador=1; contador<=largo; contador++){
			
			cadenaR=cadena.substring(0, contador);
			System.out.println(cadenaR);
		}
		
		
	}
}
