import java.util.Scanner;
public class Ej5_VerificaNombres {
	public static String[] nombres={"pepe","ana","luis","juan","jose","sara","marina","bea","dani","javi"};

			public static void buscaNombre(String b){
				int i=0;
				boolean flag=false;
				
				while(i<nombres.length && !flag){
					if(b.compareTo(nombres[i])==0){
						System.out.println("Su nombre ha sido encontrado en la posicion "+i);
						flag=true;
					}
				i++;		
					
				}
				if(!flag){
					System.out.println("Su nombre no ha sido encontrado");
				}
			}

	public static void main(String[] args) {
		String nuestraFrase="";
		
		@SuppressWarnings("resource")
		Scanner teclado=new Scanner(System.in);
		System.out.println("Introduzca el nombre a buscar");
		nuestraFrase=teclado.nextLine();
		
		buscaNombre(nuestraFrase);

	}

}
