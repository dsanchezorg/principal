import java.util.Scanner;
public class Ejercicio3_TablasMultiplicar {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner teclado=new Scanner(System.in);
		int n=0, tabla=0, resultado=0, comprobador=0;
		String respuesta="Si";
		while(respuesta.equalsIgnoreCase("Si")){
		System.out.println("¿Que tabla de sea repasar?");
		n=teclado.nextInt();
		teclado.nextLine();
		while(n<1 || n>10){
			System.out.println("Error");
			System.out.println("¿Que tabla de sea repasar?");
			n=teclado.nextInt();
		} 
			System.out.println("Ve respondiendo a las operaciones");
			for(tabla=1; tabla<=10; tabla++){
				System.out.println(n+" por "+tabla+ " es: ");
				resultado=teclado.nextInt();
				comprobador=tabla*n;
				if(!(n*tabla==resultado)){
				System.out.println("Error al multiplicar");
				System.out.println("La multiplicación de "+tabla+" por "+n+" es "+comprobador);
				}else {
					System.out.println("Bien!!");
				}
				
			}
			teclado.nextLine();
			System.out.println("¿Quieres repasar otra tabla?");
			System.out.println("Introduce Si para repetir o No para acabar");
			respuesta=teclado.nextLine();
		}
	;
	}
}

