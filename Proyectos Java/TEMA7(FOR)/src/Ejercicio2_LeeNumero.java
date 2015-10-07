import java.util.Scanner;
public class Ejercicio2_LeeNumero {
	
	    public static void main(String[] ar) {
	        @SuppressWarnings("resource")
			Scanner teclado=new Scanner(System.in);
	        int suma,f,valor;
	        suma=0;
	        for(f=1;f<=10;f++) {
	            System.out.println("Ingrese el valor numero "+f);
	            valor=teclado.nextInt();
	            if(f>5)
	            suma=suma+valor;
	        }
	        System.out.print("La suma es:");
	        System.out.println(suma);
	    }
	}
