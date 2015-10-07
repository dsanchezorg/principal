import java.util.Scanner;

public class Ejercicio4_FOR {
	public static void main(String[] args) {
	@SuppressWarnings("resource")
	Scanner teclado=new Scanner(System.in);
	
	int positivos=0, negativos=0, multiplos=0, pares=0, i=0, valor=0 ;
	

	  for(i=1;i<=10;i++) {
          System.out.print("Escribe el valor nº "+i);
          valor=teclado.nextInt();
          if (valor<0) {
              negativos++;
          } else {
          	if (valor>0) {
          		positivos++;
          	}
          }
          if (valor%15==0) {
          	multiplos++;
          }
          if (valor%2==0) {
          	pares=pares+valor;
          }
      }
      System.out.print("Cantidad de valores negativos:");
      System.out.println(negativos);
      System.out.print("Cantidad de valores positivos:");
      System.out.println(positivos);
      System.out.print("Cantidad de valores múltiplos de 15:");
      System.out.println(multiplos);
      System.out.print("Suma de los valores pares:");
      System.out.println(pares);   
	}
}
