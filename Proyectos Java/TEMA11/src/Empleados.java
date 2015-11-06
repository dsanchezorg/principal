import java.util.Scanner;
import java.text.DecimalFormat;
public class Empleados {
	float anios=0;
	float calculo=0;
	static final float trienio=3;
	
	Scanner teclado=new Scanner(System.in);
	
	
	public float antiguedadEmpleado(){
		System.out.println("Introduzca la antigüedad del empleado en años:");
		anios=teclado.nextInt();
		return anios;
	}
	
	public float calculosEmpleado(){
		calculo=anios/trienio;
		return calculo;
	}
	
	public void resultadosEmpleado(){
		DecimalFormat formateador=new DecimalFormat("####.#");
		if(calculo<=1){
			System.out.println("Su empleado ha trabajado "+formateador.format(calculo)+" trienio");
		}else{
			System.out.println("Su empleado ha trabajado "+formateador.format(calculo)+" trienios");
			}
	}

	public static void main(String[] args) {
		Empleados empleado1=new Empleados();
		Empleados empleado2=new Empleados();
		Empleados empleado3=new Empleados();

		
		empleado1.antiguedadEmpleado();
		empleado1.calculosEmpleado();
		empleado1.resultadosEmpleado();
		
		empleado2.antiguedadEmpleado();
		empleado2.calculosEmpleado();
		empleado2.resultadosEmpleado();
		
		empleado3.antiguedadEmpleado();
		empleado3.calculosEmpleado();
		empleado3.resultadosEmpleado();
		
	}

}
