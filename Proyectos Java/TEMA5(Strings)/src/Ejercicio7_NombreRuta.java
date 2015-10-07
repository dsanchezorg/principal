import java.util.Scanner;
public class Ejercicio7_NombreRuta {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner teclado=new Scanner(System.in);
		
		System.out.println("Ingrese la ruta absoluta de un archivo: ");
		System.out.println("Del tipo /.../.../.../nombredelarchivo.bin");
		String ruta=teclado.nextLine();
		
		int pos=ruta.lastIndexOf("/");
		String nombrearchivo=ruta.substring(pos+1);
		
		System.out.println("El nombre del archivo es "+nombrearchivo);
		
		String nombreruta=ruta.substring(0, pos+1);
		
		System.out.println("La ruta del archivo es:");
		System.out.println(nombreruta);
		
		
		
	}

}
