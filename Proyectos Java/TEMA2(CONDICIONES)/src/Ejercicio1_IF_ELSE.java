import java.util.Scanner;
public class Ejercicio1_IF_ELSE {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float sum=0, rest=0, mul=0;
		float n1=0, n2=0, div=0;
		@SuppressWarnings("resource")
		Scanner teclado=new Scanner(System.in);
			System.out.println("introduce el primer numero: ");
		n1=teclado.nextFloat();
			System.out.println("introduce el segundo numero: ");
		n2=teclado.nextFloat();
		
		if (n1>n2){
			sum=n1+n2;
			rest=n1-n2;
			System.out.println("El n1 es mayor que el n2");
			System.out.println("Sumaremos y restaremos estas cifras");
			System.out.println("El Resultado de la Suma es " +sum);
			System.out.println("El Resultado de la Resta es " +rest);
			}else if (n1==n2){
				System.out.println("Error, Los numeros son iguales");
			}else {
				mul=n1*n2;
				div=n1/n2;
				System.out.println("El n1 es menor que el n2");
				System.out.println("Multiplicaremos y dividiremos estas cifras");
				System.out.println("El Resultado de la multiplicacion es " +mul);
				System.out.println("El Resultado de la division es " +div);
			}
				
			}
	}


