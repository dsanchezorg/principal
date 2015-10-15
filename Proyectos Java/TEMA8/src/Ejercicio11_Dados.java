
public class Ejercicio11_Dados {

	public static void main(String[] args) {
		
		
		System.out.println("Vamos a estar tirando dados hasta que los dos sean iguales");
		
		int d1,d2;
		do{
			d1= (int)(Math.random()*6+1);
			d2= (int)(Math.random()*6+1);
			
			System.out.println("El numero del primer dado es "+d1);
			System.out.println("El numero del segundo dado es "+d2);
			
		}while(d1!=d2);
		
		System.out.println("El resultado de los datos es igual en los dos");
	}

}
