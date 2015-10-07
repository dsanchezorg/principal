import java.util.Scanner;
public class Ejercicio5_Cuadrante {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner teclado=new Scanner(System.in);
		int x=0, y=0;
		
		System.out.print("Introduce el numero de X");
		x=teclado.nextInt();
		System.out.print("Introduce el numero de Y");
		y=teclado.nextInt();
		
		if (y>0 && x>0){
			System.out.print("Ese punto pertecene al primer cuadrante");
		}else if (y>0 && x<0){
			System.out.print("Ese punto pertenece al segundo cuadrante");
		}else if (y<0 && x>0){
			System.out.print("Este punto pertenece al cuarto cuadrante");
		}else if (y<0 && x<0){
			System.out.print("Este punto pertenece al tercer cuadrante");
		}else{
			System.out.print("Error");
		}
		
	}	
}

