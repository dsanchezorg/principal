import java.util.Scanner;
public class Ejercicio6_SueldOperario {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner teclado=new Scanner(System.in);
		
		double antiguedad=0, sueldo=0, aumento=0;
		
		System.out.print("Ingrese la antigüedad:");
		antiguedad=teclado.nextDouble();
		System.out.print("Ingrese el sueldo");
		sueldo=teclado.nextDouble();
		
		if (sueldo<300 && antiguedad>10){
			aumento=sueldo*1.20;
			
		}else if (sueldo<300 && antiguedad<10){
			aumento=sueldo*1.05;
		
		}else if (sueldo>=300){
			aumento=sueldo;
		}
		System.out.print("Su sueldo actual es de "+aumento+"€");
	}

}
