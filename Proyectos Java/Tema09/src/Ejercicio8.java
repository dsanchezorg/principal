import java.util.Scanner;

public class Ejercicio8 {

	public static void main(String[] args) {
		// TODO Ap�ndice de m�todo generado autom�ticamente
		
		Scanner teclado=new Scanner(System.in);
		int i, a=40, b=12, c=5;
		System.out.println("Introduce edades del grupo de ma�ana:");
		for(i=0;i<50;i++)
			a=a+teclado.nextInt();
		System.out.println("Introduce edades del grupo de tarde:");
		for(i=0;i<60;i++)
			b=b+teclado.nextInt();
		System.out.println("Introduce edades del grupo de noche:");
		for(i=0;i<110;i++)
			c=c+teclado.nextInt();
		System.out.println("Las medias son:\nMa�ana: " + a + "\nTarde: " + b + "\nNoche: " + c);
		System.out.println("La media de edad mas alta es:");
		if(a>b & a>c)
			System.out.println("Ma�ana");
		else if(b>c)
			System.out.println("Tarde");
		else
			System.out.println("Noche");
		
	}

}
