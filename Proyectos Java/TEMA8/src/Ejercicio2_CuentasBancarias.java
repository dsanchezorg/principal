import java.util.Scanner;
public class Ejercicio2_CuentasBancarias {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner teclado=new Scanner(System.in);
		
		int ncuenta=0, saldo=0, saldoacumulado=0;
		
		System.out.println("Introduce numero de cuenta");
		ncuenta=teclado.nextInt();
		while(ncuenta > 0){
		
			System.out.println("Introduce Saldo de la cuenta "+ncuenta);
			saldo=teclado.nextInt();
			System.out.println("La cuenta "+ncuenta+" tiene "+saldo+"€");
				if(saldo>0){
					saldoacumulado+=saldo;
					System.out.println("Es acreedor");
				}else if(saldo==0){
					System.out.println("Es nulo");
				}else{
					System.out.println("Es deudor");
				}
				System.out.println("Introduce numero de cuenta");
				ncuenta=teclado.nextInt();
		}System.out.println("La suma total del saldo de los acreedores es "+saldoacumulado);
	}

}
