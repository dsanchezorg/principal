import java.util.Scanner;

public class Ejercicio4_SUELDOS {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner teclado=new Scanner(System.in);
		double hora=20, nhora=0, salarion=0;
		
		System.out.println("La hora se paga a 20€");
		System.out.println("Introduce el numero de horas trabajadas");
		nhora=teclado.nextDouble();
		
		salarion=hora*nhora;
		System.out.println("Su sueldo base es de "+salarion);
		
		if(nhora<=35){
			System.out.println("Su salario es de "+salarion);
		}else if(nhora<=37.5){
			salarion=nhora*hora+(nhora-35)*hora*1.25;
			System.out.println("Su salario es de "+salarion);
		}else{
			if(nhora<=39.5){
				salarion=nhora*hora+(nhora-37.5)*hora+50;
				System.out.println("Su salario es de "+salarion);
			
			}else{
				salarion=nhora*hora+(nhora-39.5)*hora+72;
				System.out.println("Su salario es de "+salarion);
			}
		}
		
		
		
	}
}
