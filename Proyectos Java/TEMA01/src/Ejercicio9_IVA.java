import java.util.Scanner;
public class Ejercicio9_IVA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		Scanner teclado=new Scanner(System.in);
		int cantidad=0;
		float precio=0, iva=0, tPrecio=0;
		
		System.out.println("Indica el precio del articulo");
		precio=teclado.nextFloat();
		System.out.println("Indica la cantidad de articulos que lleva");
		cantidad=teclado.nextInt();
		tPrecio=precio*cantidad;
		System.out.println("El precio total es " +tPrecio);
		iva=(precio*cantidad*21)/100;
		System.out.println("El iva total es " +iva);
		
	}

}
