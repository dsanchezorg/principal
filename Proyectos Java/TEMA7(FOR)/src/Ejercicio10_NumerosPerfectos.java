
public class Ejercicio10_NumerosPerfectos {

	public static void main(String[] args) {
		int i=0, n=0, suma=0;
		

	for(n=1; n<=1000; n++){	
		suma=0;
		for(i=1; i<n; i++){
			if(n%i==0){
				suma=suma+i;
				}
		}if (suma==n){
			System.out.println("El numero "+n+" es perfecto");
		}
		}
	}

}
