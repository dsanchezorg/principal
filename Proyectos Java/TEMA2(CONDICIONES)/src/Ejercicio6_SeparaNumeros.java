import java.util.Scanner;
public class Ejercicio6_SeparaNumeros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nTotal= 0; 
		@SuppressWarnings("resource")
		Scanner teclado=new Scanner(System.in);
		System.out.print("Introduce un numero de Tres cifras y lo separare");
		nTotal=teclado.nextInt();
		if(nTotal>999){
				System.out.println("Error el numero es mayor de 3 cifras");
			}else if(nTotal<100){
				System.out.println("Error el numero es menor de 3 cifras");
			}else{
	
				int n1=0, n2=0, n3=0;
				
				n1=nTotal%10;
				nTotal=nTotal/10;
				
				n2=nTotal%10;
				nTotal=nTotal/10;
				
				n3=nTotal%10;
				
				System.out.println("Las unidades es el numero "+n1);
				System.out.println("Las decenas es el numero "+n2);
				System.out.println("Las centenas es el numero "+n3); 
				}
		}
			

}
