
public class Ejercicio10 {

	public static void main(String[] args) {
		// TODO Apéndice de método generado automáticamente
		
		int a, i, j, b;
		System.out.println("Numeros perfectos:");
		for(i=2;i<=1000;i++){
			b=0;
			for(j=1;j<i;j++){
				if(i%j==0 & i!=j)
					b=b+j;
			}
			if(i==b)
				System.out.print(i + "\t");
		}
		
	}

}
