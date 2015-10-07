import java.util.Scanner;
public class Ejercicio8_ResultadosFutbol {
		public static void main(String[] args) {
			@SuppressWarnings("resource")
			Scanner teclado=new Scanner(System.in);
			int glocal=0, gvisitante=0, resultado=0;
			
			System.out.print("Introduce los goles locales");
			glocal=teclado.nextInt();
			System.out.print("Introduce los goles visitantes");
			gvisitante=teclado.nextInt();
			
			resultado=glocal-gvisitante;
			
			if(resultado<0){
				System.out.print("2");
			}else if(resultado>0){
				System.out.print("1");
			}else{
				System.out.print("x");
			}
			
	}
}
