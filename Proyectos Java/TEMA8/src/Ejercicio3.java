import java.util.Scanner;
public class Ejercicio3 {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner teclado=new Scanner(System.in);
		int numero=0, numerocontador=0, aux=0, impar=0, acumulaimpar=0, mayor=0, media=0;
		boolean flag=false;
		System.out.println("Introduce un numero");
		numero=teclado.nextInt();
		
		while(numero > 0){
			numerocontador++;
			aux=numero%2;
				if(aux != 0){
					impar+=numero;
					acumulaimpar++;
				}else{
					if(!flag){
						mayor=numero;
						flag=true;
					}
					else if(numero > mayor){
						mayor=numero;
					}
					
					}
				System.out.println("Introduce un numero");
				numero=teclado.nextInt();
				
				}System.out.println("Se han introducido "+numerocontador+" numeros");
				 if(acumulaimpar==0)
				 {
					 System.out.println(" no hay impares");
				 }
				 else
				media=impar/acumulaimpar;
				
				System.out.println("La media de los impares es "+media);
				System.out.println("El mayor de los pares es "+mayor);
			
			
		}

	}


