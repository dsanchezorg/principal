import java.util.Scanner;
public class Ejercicio1_1Al10 {

	public static void main(String[] args) {
		Scanner tec=new Scanner(System.in);
		int aleatorio=0, numero=0, contador=1;
		
		aleatorio=(int)(Math.random()*10)+1;
		System.out.print("Se ha generado un numero del 1 al 10, intente adivinarlo");
		numero=tec.nextInt();
		
		while(!(numero==aleatorio)){
			System.out.print("Su numero no coincide");
			System.out.print(" Introduzca otro numero");
			numero=tec.nextInt();
			contador++;
		}System.out.print("Usted ha acertado el numero ");
		 System.out.print("Ha tenido "+contador+" intento/s");
		tec.close();

	}

}
