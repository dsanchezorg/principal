import java.util.Scanner;
public class Ejercicio7_Piramide{
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner teclado=new Scanner(System.in);
		char espacio=' ', asterisco='*';
		int x=0, interruptor=0;
		boolean decision=false;
		
		while(decision != true){
		System.out.println("Introduce la altura de la piramide");
		x=teclado.nextInt();
		for(int i=1; i<=x; i++){
			for(int espacios=x-i; espacios>0; espacios--)
				System.out.print(espacio);
			for(int asteriscos=1; asteriscos<2*i; asteriscos++)
				System.out.print(asterisco);
			System.out.println("");
		} System.out.println("Escriba 1 para repetir o 2 para finalizar");
		  interruptor=teclado.nextInt();
		  if(interruptor==1){
			  decision=false;
		  }else{
			  decision=true;
		  }

	  }	  
	}
	
}







/*
 public class Ejercicio7_Piramide {

	public static void main(String[] args) {
		        char espacio='-', asterisco='*';
		        int x=5;

		        for(int i=1; i<=x; i++){
		            for(int espacios=x-i; espacios>0; espacios--)
		                System.out.print(espacio);
		            for(int lineas=1; lineas<2*i; lineas++)
		                System.out.print(asterisco);
		            System.out.println("");
		        }
		    }
		
	}*/

