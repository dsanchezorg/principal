import java.util.Scanner;
public class Ejercicio5_ReciboLuz {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner teclado=new Scanner(System.in);
		double fijo=0.60, first=0.30, second=0.20, third=0.15, fread=0, aread=0, total=0 ;
		System.out.print("Introduzca la lectura del mes anterior");
		fread=teclado.nextDouble();
		System.out.print("Introduzca la lectura actual");
		aread=teclado.nextDouble();
		
		total=aread-fread;
		
		if (total<=100){
			total=fijo*first*total;
			//System.out.print("Su factura es de "+total);
		}else if (total>100 && total<=250){
			total=second*(total-100)+first*100;
			//System.out.print("Su factura es de "+total);
		}else{
			total=third*(total-250)+second*150+third*100;
			//System.out.print("Su factura es de "+total);
		}
		
		System.out.print("Su factura es de "+total);
		
		
	}

}
