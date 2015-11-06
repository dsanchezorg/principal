import java.util.Scanner;
public class Asteriscos {
	
		public static void asterix(int a){
			int i=0;
			
			for (i=0; i<a; i++){
				System.out.print("*");
			}
		}
	
	
	public static void main(String[] args) {
		int pintaAsteriscos=0;
		@SuppressWarnings("resource")
		Scanner teclado=new Scanner(System.in);
		
		System.out.println("Introduce un número y lo pintaré en asteriscos");
		pintaAsteriscos=teclado.nextInt();
		
		asterix(pintaAsteriscos);

	}

}
