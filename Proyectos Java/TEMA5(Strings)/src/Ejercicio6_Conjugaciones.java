import java.util.Scanner;
public class Ejercicio6_Conjugaciones {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner teclado=new Scanner(System.in);
		
		System.out.println("introduzca un verbo en infinitivo y le diré su conjugación");
		String verbo=teclado.nextLine();
		
		if(verbo.endsWith("ar")){
			System.out.println("el verbo pertenece a la primera conjugacion");
		}else if(verbo.endsWith("er")){
			System.out.println("el verbo pertenece a la segunda conjugacion");
		}else if(verbo.endsWith("ir")){
			System.out.println("el verbo pertenece a la tercera conjugacion");
		}else{
			System.out.println("Error, eso no es un verbo");
			System.out.println("Al menos en castellano");
		}
		
	}

}
