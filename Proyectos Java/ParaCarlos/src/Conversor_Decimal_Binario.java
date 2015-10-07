import java.util.Scanner;
public class Conversor_Decimal_Binario {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner teclado=new Scanner(System.in);
		
		long decimal = 0, auxiliar=0;
		System.out.println("introduce un numero decimal y lo pasaré a binario");
		decimal=teclado.nextLong();
		auxiliar=decimal;
		String binario="";
		
		while(auxiliar > 0){
			binario = auxiliar % 2 + binario;
			
			auxiliar= auxiliar/2;
			
		}
		System.out.println("El numero decimal "+decimal+" en binario es "+binario);
	}

}
