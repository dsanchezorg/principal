import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		// TODO Ap�ndice de m�todo generado autom�ticamente
		
		Scanner teclado=new Scanner(System.in);
		int a=0, b=0, p=0, pc=0, np=0, npc=0;
		while(a>=0){
			System.out.println("Introduce un numero:");
			a=teclado.nextInt();
			if(a>=0){
				if(a%2==0){
					p=p+a;
					pc++;
				}
				else{
					np=np+a;
					npc++;
				}
				b++;
			}
		}
		System.out.println("Se han introducido "+b+" numeros, la media de los pares es "+(p/pc)+" y la media de los numero impares es "+(np/npc));

	}

}
