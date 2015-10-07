
public class Ejercicio4_DiaSemana {

	public static void main(String[] args) {
		int dia;
		dia=(int)(Math.random()*7)+1;
		System.out.println("El numero del dia es "+dia);
		
		switch (dia) {
		case 1: System.out.println("Lunes"); break;
		case 2: System.out.println("Martes"); break;
		case 3: System.out.println("Miercoles"); break;
		case 4: System.out.println("Jueves"); break;
		case 5: System.out.println("Viernes"); break;
		case 6: System.out.println("Sabado"); break;
		case 7: System.out.println("Domingo"); break;

		}
	}
}