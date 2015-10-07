import java.util.Scanner;
public class Ejercicio3_LongitudFrases {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner teclado=new Scanner(System.in);
		
		int longitud=0;
		String frase, lesslong;
		System.out.println("Introduce una frase");
		System.out.println("Escribe * para terminar de introducir frases");
		frase=teclado.nextLine();
		lesslong=frase;
		longitud=frase.length();
		while(frase.charAt(0) !='*'){
			System.out.println("Introduce otra frase");
			frase=teclado.nextLine();
			if(frase.length() <lesslong.length() && frase.charAt(0)!='*'){
				lesslong=frase;
				longitud=frase.length();
			}
		}
		System.out.println("La frase mas corta es:\n" + lesslong + "\nSu longitud es:\n" +longitud);

	}

}
