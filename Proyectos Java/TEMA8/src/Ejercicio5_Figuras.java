import java.util.Scanner;

public class Ejercicio5_Figuras {

	public static void main(String[] args) {
				@SuppressWarnings("resource")
				Scanner teclado=new Scanner(System.in);
				
				int radio=0, areaCirculo=0, baseR=0, alturaR=0, areaR=0, baseT=0, alturaT=0, areaT=0, interruptor=0;
				double pi=3.1416;
				
				do{
					System.out.println("Pulse '1' para calcular el Área de un círculo");
					System.out.println("Pulse '2' para calcular el Área de un rectángulo");
					System.out.println("Pulse '3' para calcular el Área de un triángulo");
					System.out.println("Pulse '0' para Salir");
					
					interruptor=teclado.nextInt();
					
					switch (interruptor){
					
					case 1: 
						System.out.println("Introduce el radio del circulo");
						radio=teclado.nextInt();
						radio=radio*radio;
						areaCirculo=(int) (pi*radio);
						System.out.println("El area del circulo es "+areaCirculo);
						break;
						
					case 2:
						System.out.println("Introduce la base del rectangulo");
						baseR=teclado.nextInt();
						System.out.println("Introduce la altura del rectangulo");
						alturaR=teclado.nextInt();
						areaR=baseR*alturaR;
						System.out.println("El area del rectangulo es "+areaR);
						break;
						
					case 3:
						System.out.println("Introduce la base del triangulo");
						baseT=teclado.nextInt();
						System.out.println("Introduce la altura del triangulo");
						alturaT=teclado.nextInt();
						areaT=(baseT*alturaT)/2;
						System.out.println("El area del triangulo es "+areaT);
						break;
						
						
						
					case 0: break;
					}
					
					
					
				}while(interruptor != 0);

			}

		

	

}
