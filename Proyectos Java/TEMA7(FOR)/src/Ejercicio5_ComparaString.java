import java.util.Scanner;
public class Ejercicio5_ComparaString {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner teclado=new Scanner(System.in);
		
		String compara1="", compara2="";
		int nCadenas=0, i=0, largo=0, aux=0;
		
		nCadenas=(int)(Math.random()*10);
		System.out.println("Compararemos "+nCadenas+" frases");
		System.out.println("introduce frase: ");
		
		for(i=1;i<nCadenas;i++){
			aux=i+1;
			System.out.println("Introduce la "+aux+"º frase");
			compara1=teclado.nextLine();
			largo = compara1.compareTo(compara2);
			System.out.println(+largo);
				 
			if(largo<=0){
				 compara1=compara2;
			   }System.out.println("La frase mas larga es: "+compara1);
			 
		}
		
	}

}
