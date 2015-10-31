import java.util.Scanner;

public class Ejercicio9 {

	public static void main(String[] args) {
		// TODO Apéndice de método generado automáticamente
		
		Scanner teclado=new Scanner(System.in);
		int i,j,k;
		char a='S';
		while(a=='S'){
			for(i=0;i<24;i++)
				for(j=0;j<60;j++){
					for(k=0;k<60;k++){
						try {
						    Thread.sleep(1000);                 //1000 milliseconds is one second.
						} catch(InterruptedException ex) {
						    Thread.currentThread().interrupt();
						}
						System.out.println(k);
					}
					System.out.println(j+"min");
				}
			System.out.println("Repetir? S/N");
			a=teclado.next().toUpperCase().charAt(0);
		}
		
	}

}
