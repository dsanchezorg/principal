import java.util.Scanner;

public class Ejercicio4_FACTURA {
	public static void main(String[] args){
		@SuppressWarnings("resource")
		Scanner teclado=new Scanner(System.in);
		
		float cantidad=0, precio=0, iva=0, total=0 ,descuento=0, totalfinal=0, predescuento=0;
		System.out.println("Indica la cantidad");
	    cantidad=teclado.nextFloat();
	    System.out.println("Indica el precio");
	    precio=teclado.nextFloat();
	    
	    total=cantidad*precio;
	    iva=(total*21)/100;
	    totalfinal=total+iva;
	    descuento=(totalfinal*15)/100;
	    
	    if(totalfinal>=600){
	    	predescuento=totalfinal-descuento;
	    	System.out.println("Su precio final con el 15% de descuento es " +predescuento);
	    	}else {
	    	System.out.println("Usted no tiene descuento");
	    }
	    
	    
	    
	}
}
