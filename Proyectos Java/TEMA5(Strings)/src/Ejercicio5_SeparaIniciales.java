import java.util.Scanner;
public class Ejercicio5_SeparaIniciales {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner tec=new Scanner(System.in);
		
		int espacio, espacio2;
		
		System.out.println("Escribe el nombre con sus apellidos");
		String nombre=tec.nextLine().toUpperCase();
		espacio = nombre.indexOf(" ");
		espacio2 = nombre.indexOf(" ",espacio+1);
		char ini1 =nombre.substring(0, espacio).charAt(0);
		char ini2=nombre.substring(espacio+1, espacio2-1).charAt(0);
		char ini3=nombre.substring(espacio2+1, nombre.length()-1).charAt(0);
		
		System.out.print(ini1+"."+ini2+"."+ini3);
	}

}
