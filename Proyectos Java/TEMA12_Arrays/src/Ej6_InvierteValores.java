import java.util.Scanner;
public class Ej6_InvierteValores {

	public static int[] vector=new int[30];
	static int inicial=0;
	
			public static void cargaValores(){
				@SuppressWarnings("resource")
				Scanner teclado=new Scanner(System.in);
				System.out.println("Introduce el primer valor del vector");
				inicial=teclado.nextInt();
				
				for(int i=0; i<30; i++){
					vector[i]=inicial;
					inicial++;
				}
				for(int j=vector.length-1; j>=0; j--){
					System.out.println(vector[j]);
				}
			}
	
	public static void main(String[] args) {
		cargaValores();

	}

}
