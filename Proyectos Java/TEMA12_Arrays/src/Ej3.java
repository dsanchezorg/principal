
public class Ej3 {
		
		static int [] valores;

		public static void cargaValores(){
			valores=new int[2000000];
			System.out.println("Estos son los 15 valores aleatorios");
			
			for(int i=0; i<valores.length; i++){
				valores[i]=(int)(Math.random()*500)+1;
				
			}
			System.out.println("\n");
			
		}
		
		public static void valoresMayoresMenores(){
			int acumuladorMayores=0, acumuladorMenores=0, mayor=valores[0], menor=valores[0];
			
			for(int i=0; i<valores.length; i++){
					if(valores[i]<menor){
						menor=valores[i];					
					}
					if(valores[i]>mayor){
						mayor=valores[i];
					}
				}
			
			for(int i=0; i<valores.length; i++){
				if(valores[i]==menor){
					acumuladorMayores++;					
				}
				if(valores[i]==mayor){
					acumuladorMenores++;
				}
			}
			
			System.out.println("El numero mayor es "+mayor+" y se repite "+acumuladorMayores+" vez/veces");
			System.out.println("El numero menor es "+menor+" y se repite "+acumuladorMenores+" vez/veces");
		}
		
		
		
		public static void main(String[] args) {
			
			
			cargaValores();
			valoresMayoresMenores();

		}

	}

