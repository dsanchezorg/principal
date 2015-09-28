import java.text.DecimalFormat;
import java.util.Scanner;

public class Ejercicio10_CambioMonedas {

	public static void main(String[] args) {

				Scanner teclado=new Scanner(System.in);
				DecimalFormat df=new DecimalFormat("0.00");
				
				double euro=0, peso=10.53, dolar=0.8949, yen=134.45;
				char C;
				System.out.print("Introduce la cantidad en euros");
				euro=teclado.nextDouble();
				System.out.print("Introduce p para cambiar a pesos d a dolar y y a yenes");
				C=teclado.next().charAt(0);
			
				
				switch (C){
				case 'p':
					System.out.println("Su cambio a pesos es "+df.format((euro*peso)));
					break;
				case 'd':
					System.out.println("Su cambio a dolares es "+df.format((euro*dolar)));
					break;
				case 'y':
					System.out.println("Su cambio a yenes es" +df.format((euro*yen)));
					break;	
				case 'P':
						System.out.println("Su cambio a pesos es "+df.format((euro*peso)));
						break;
				case 'D':
						System.out.println("Su cambio a dolares es "+df.format((euro*dolar)));
						break;
				case 'Y':
						System.out.println("Su cambio a yenes es" +df.format((euro*yen)));
						break;
				
			}

		}

	}


