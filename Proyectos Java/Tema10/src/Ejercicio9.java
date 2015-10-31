import java.util.Scanner;

public class Ejercicio9 {

	public static void main(String[] args) {
		// TODO Apéndice de método generado automáticamente
		
		Scanner teclado=new Scanner(System.in);
		int i, j, h, k, l=0;
		System.out.println("Alto de la piramide:");
		h=teclado.nextInt();
		for(i=h;i>=1;i--){
			if(i==h){
				for(j=0;j<=h-i;j++)
					System.out.print("  ");
				for(k=1;k<=(i*2)-1;k++)
					System.out.print("* ");
			}
			else{
				for(j=0;j<=h-i;j++)
					System.out.print("  ");
				for(k=1;k<=(i*2)-1;k++)
					if(k==1|k==(i*2)-1)
						System.out.print("* ");
					else
						System.out.print("  ");
			}
			System.out.println();
		}

	}

}
