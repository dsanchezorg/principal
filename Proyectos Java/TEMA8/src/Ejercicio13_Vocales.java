import java.util.Scanner;
public class Ejercicio13_Vocales {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner teclado=new Scanner(System.in);
		
		String cadena="", cadenaR="";
		int largo=0;
		char guardado=0;
		
		
		System.out.println("Introduce una palabra y sacaré sus vocales");
		cadena=teclado.nextLine();
		largo=cadena.length();
		
		for(int contador=0; contador<largo; contador++){
			guardado=cadena.charAt(contador);
					if(guardado=='a' || guardado=='e' || guardado=='i' || guardado=='o' || guardado=='u'){
						cadenaR=cadenaR+guardado;
					}
		}System.out.println(cadenaR);
	}

}
