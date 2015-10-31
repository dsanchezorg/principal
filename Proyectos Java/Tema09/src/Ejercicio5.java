import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		// TODO Apéndice de método generado automáticamente
		
		Scanner teclado=new Scanner(System.in);
		int n, i, b=0;
		String a, c="";
		n=(int)(Math.random()*10)+1;
		for(i=0;i<n;i++){
			System.out.println("Introduce cadena " + (i+1));
			a=teclado.next();
			if(a.length()>b){
				c=a;
				b=a.length();
			}
		}
		System.out.println("La cadena mas larga es: " + c);
		
	}

}
