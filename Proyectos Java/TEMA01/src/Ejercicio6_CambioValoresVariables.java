import java.util.Scanner;
public class Ejercicio6_CambioValoresVariables {
	
	public static void main(String[] args) {
	int A=0, B=0, C=0, D=0, bSave=0;
		System.out.println("Introduce los valores a elegir de A,B,C y D en el orden nombrado");
		@SuppressWarnings("resource")
		Scanner teclado=new Scanner(System.in);
		A=teclado.nextInt();
		B=teclado.nextInt();
		C=teclado.nextInt();
		D=teclado.nextInt();
		
		bSave=B;
		B=C;
		C=A;
		A=D;
		D=bSave;
		
		System.out.println("Los valores actuales son de A: " +A+ " de B: " +B+ " de C: " +C+ " y de D: " +D);
	}

}

