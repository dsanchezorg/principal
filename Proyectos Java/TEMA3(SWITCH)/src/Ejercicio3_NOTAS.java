import java.util.Scanner;
public class Ejercicio3_NOTAS {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner teclado=new Scanner(System.in);
		float npreguntas=0, ncorrectas=0;
		float porcentaje=0;
		
		System.out.println("Introduce el numero de preguntas");
		npreguntas=teclado.nextInt();
		System.out.println("Introduce el numero de preguntas correctas");
		ncorrectas=teclado.nextInt();
		
		porcentaje=(ncorrectas/npreguntas)*100;
		
		if(porcentaje<50){
			System.out.println("Suspenso");
		}else if (porcentaje<=75){
			System.out.println("Aprobado");
		}else {
			if(porcentaje<=90){
				System.out.println("Notable");
			}else if(porcentaje<=100){
				System.out.println("Sobresaliente");
			}
		}
		

	}

}
