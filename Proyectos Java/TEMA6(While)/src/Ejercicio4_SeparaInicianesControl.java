	import java.util.Scanner;
public class Ejercicio4_SeparaInicianesControl {

	public static void main(String[] args) {
			@SuppressWarnings("resource")
			Scanner tec=new Scanner(System.in);
			
			int espacio, espacio2, espacio3;
			boolean interruptor=true;
			
			System.out.println("Escribe el nombre con sus apellidos");
			String nombre=tec.nextLine().toUpperCase();
			espacio = nombre.indexOf(" ");
			espacio2 = nombre.indexOf(" ",espacio+1);
			espacio3 = nombre.indexOf(" ",espacio2+1);
			if(nombre.length()>=1 && interruptor==true){
			char ini1 =nombre.substring(0, espacio).charAt(0);
			char ini2=nombre.substring(espacio+1, espacio2-1).charAt(0);
			char ini3=nombre.substring(espacio2+1, nombre.length()-1).charAt(0);
			char ini4=nombre.substring(espacio3+1, nombre.length()-1).charAt(0);
			interruptor=false;
			System.out.println(ini1+"."+ini2+"."+ini3+"."+ini4);
			}else{
				System.out.println("Ha introducido una frase vacia");
			}

		}

	}

	


