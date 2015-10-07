
public class Ejercicio3_Aleatorios {

	public static void main(String[] args) {

				int alt1, alt2, alt3;
				alt1=(int)(Math.random()*50)+1;
				alt2=(int)(Math.random()*50)+1;
				alt3=(int)(Math.random()*50)+1;
				
				System.out.println("El primer numero es "+alt1);
				System.out.println("El segundo numero es "+alt2);
				System.out.println("El tercer numero es "+alt3);
				System.out.println(" ");
				
				if(alt1%3==0){
					System.out.println("el primer numero es multiplo de 3");
				}else {
					System.out.println("el primer numero no es multiplo de 3");
				}
				if(alt2%3==0){
					System.out.println("el segundo numero es multiplo de 3");
				}else {
					System.out.println("el segundo numero no es multiplo de 3");
				}
				if(alt3%3==0){
					System.out.println("el tercer numero es multiplo de 3");
				}else {
					System.out.println("el tercer numero no es multiplo de 3");
				}
				
	}

}
