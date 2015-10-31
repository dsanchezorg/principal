import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {
		// TODO Apéndice de método generado automáticamente
		
		Scanner teclado=new Scanner(System.in);
		int i, j, h, k, l=0;
		System.out.println("Alto de la piramide:");
		h=2*teclado.nextInt();
		for(i=1;i<=h;i++)
	    {
			if(i%2!=0){
	                     for(j=0;j<=(h/2)-l;j++)
	                    	 System.out.print(" ");
	                     for(k=1;k<=i;k++)
	                    	 if(k%2!=0)
	                    	 System.out.print("*");
	                    	 else
	                    	 System.out.print(" ");
	                     System.out.print("\n");
	                     l++;
			}
	    }
	}

}
