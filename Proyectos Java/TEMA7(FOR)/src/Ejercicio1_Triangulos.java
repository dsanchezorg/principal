import java.util.Scanner;
public class Ejercicio1_Triangulos {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner teclado=new Scanner(System.in);
		int n=0, base=0, altura=0, superficie=0, f=0;
		
		System.out.println("¿Cuantos Triangulos vas a calcular?");
		n=teclado.nextInt();
		
		for(f=1;f<=n;f++){
			System.out.println("Introduce la base");
			base=teclado.nextInt();
			System.out.println("Introduce la altura");
			altura=teclado.nextInt();
			
			superficie=(base*altura)/2;
			
			System.out.println("La superficia del "+n+"º Triangulo es "+superficie);
			System.out.println("---------------------------------------------------------");
			
			if(f<n){
			System.out.println("Introduzca los datos del siguiente triangulo");
			System.out.println("---------------------------------------------------------");
			}
		}
		
	}
}
