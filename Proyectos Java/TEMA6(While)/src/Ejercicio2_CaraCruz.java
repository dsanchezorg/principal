
public class Ejercicio2_CaraCruz {

	public static void main(String[] args) {
	boolean moneda=false;
	int tirada=0, cara=0, caratotal=0, cruz=0;

	while (!moneda){
		tirada=(int)(Math.random()*2);
		System.out.print(tirada+" ,");
		if(!(tirada==1)){
		  cara++;
		  caratotal++;
		  if(cara==3){
			  moneda=true;
			  
			  System.out.println("Ha sacado 3 caras seguidas");
		  }
			  
		}else{
		  cruz++;
		  cara=0;
		}
	}
		System.out.println("Ha tardado "+(cara+cruz)+" tiradas en en sacar tres caras seguidas");
		System.out.println("Ha sacado "+caratotal+ " caras y "+cruz+" cruces");
	
	}

}
