import java.util.Scanner;

public class Ejercicio7_PerimetroCuadrado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		Scanner teclado=new Scanner(System.in);
		double L=0, P=0; 
		System.out.println("Introduce el lado de un cuadrado y calcularé el perimnetro:");
		L=teclado.nextFloat();
		P=L*4;
		System.out.println("El perimetro del cuadrado es: " +P);
	 }

}
