import java.util.Scanner;
public class Operaciones {
	private int valor1=0, valor2=0;
	
	public void cargarValores(){
		@SuppressWarnings("resource")
		Scanner teclado=new Scanner(System.in);
		System.out.println("Intruduce el primer valor");
		valor1=teclado.nextInt();
		System.out.println("Intruduce el segundo valor");
		valor2=teclado.nextInt();
	}
	
	public void suma(){
		int resultadoSuma=0;
		resultadoSuma=valor1+valor2;
		System.out.println("la suma da: "+resultadoSuma);
	}
	
	public void resta(){
		int resultadoResta=0;
		resultadoResta=valor1-valor2;
		System.out.println("La resta da: "+resultadoResta);
	}
	
	public void multiplicacion(){
		int resultadoMultiplicaion=0;
		resultadoMultiplicaion=valor1*valor2;
		System.out.println("La multiplicacion da: "+resultadoMultiplicaion);
	}
	
	public void division(){
		int resultadoDivision=0;
		if (valor2==0){
			System.out.println("No se puede dividir entre 0, Error");
		}else{
		resultadoDivision=valor1/valor2;
			System.out.println("El resultado de la division es: "+resultadoDivision);
		}
		}
	
	
	public static void main(String[] args) {
		
			Operaciones cuenta=new Operaciones();
			cuenta.cargarValores();
			cuenta.suma();
			cuenta.resta();
			cuenta.multiplicacion();
			cuenta.division();
			
	}

}
