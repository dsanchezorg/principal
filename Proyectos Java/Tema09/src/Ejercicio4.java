import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		// TODO Apéndice de método generado automáticamente
		
		Scanner teclado=new Scanner(System.in);
		int a, i, j=0, k=0, l=0, m=0;
		for(i=0;i<10;i++){
			System.out.println("Introduce numero " + (i+1));
			a=teclado.nextInt();
			if(a<0)
				j++;
			else if(a>0)
				k++;
			if(a%15==0)
				l++;
			if(a%2==0)
				m++;
		}
		System.out.println("El numero de numeros negativos es " + j + ", el numero de numeros positivos es " + k + ", el numero de multiplos de 15 es " + l + " y el numero de multiplos de dos es " + m);
	}

}
