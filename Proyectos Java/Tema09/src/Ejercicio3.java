import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		// TODO Apéndice de método generado automáticamente
		
		Scanner teclado=new Scanner(System.in);
		int i, b=0, n, c, j;
		char a='S';
		while(a=='S'){
			System.out.println("¿Con que tabla quieres practicar?");
			n=teclado.nextInt();
			j=0;
			for(i=0;i<10;i++){
				System.out.println(n + "*" + (i+1) + "=");
				c=teclado.nextInt();
				if(c!=n*(i+1)){
					System.out.println("Error, la respuesta es " + (n*(i+1)));
					j++;
				}
			}
			if(j<=3)
				System.out.println("Apto");
			else
				System.out.println("No apto");
			System.out.println("¿Quiere volver a repetir? S/N");
			a=teclado.next().toUpperCase().charAt(0);
		}
		System.out.println("Adios");
	}

}
