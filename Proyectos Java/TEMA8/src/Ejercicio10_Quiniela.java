
public class Ejercicio10_Quiniela {
	public static void main(String[] args) {
		
		for(int i=1; i<=15; i++){
			double aleatorio=(int) (Math.random()*100+1);
			if(aleatorio <= 50){
				System.out.println("1");
			}
			else if (aleatorio >=50 && aleatorio <=80){
				System.out.println("X");
			}
			else{
					System.out.println("2");
			}
		}  
	}
}
