import java.util.Scanner;
public class Ejercicio8_Alumnos {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner teclado = new Scanner(System.in);
		
		int x=0, edad=0, suma1=0, suma2=0, suma3=0, promedio1=0, promedio2=0, promedio3=0, promediototal=0;
		
		for(x=1;x<=50;x++){
			System.out.println("Ingresa la edad del "+x+"ª alumno");
			edad=teclado.nextInt();
			suma1=edad+suma1;
		}promedio1=suma1/50;
		for(x=1;x<=60;x++){
			System.out.println("Ingresa la edad del "+x+"ª alumno");
			suma2=edad+suma2;
		}promedio2=suma2/60;
		for(x=1;x<=110;x++){
			System.out.println("Ingresa la edad del "+x+"ª alumno");
			suma3=edad+suma3;
		}promedio3=suma3/110;
		promediototal=(promedio1+promedio2+promedio3)/3;
		
		if(promedio1>promedio2 || promedio1>promedio3){
			System.out.println("El promedio de la mañana es el mayor");
		}else if(promedio2>promedio1 || promedio2>promedio3){
			System.out.println("El promedio de la tarde es el mayor");
		}else{
			System.out.println("El promedio de la noche es el mayor");
			
		}System.out.println("El promedio total de las edades de todos los turnos es "+promediototal);
		System.out.println("El promedio de la mañana es "+promedio1);
		System.out.println("El promedio de la tarde es "+promedio2);
		System.out.println("El promedio de la noche es "+promedio3);
	}


}
