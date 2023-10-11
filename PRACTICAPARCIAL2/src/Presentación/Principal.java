package Presentación;
import Logica.Multiplicacion;
import Logica.operacionMatematica;
import Logica.Resta;
import Logica.Suma;

public class Principal {
	
	public Principal() {

		// TODO Auto-generated constructor stub
		double num1= 2.5;
		double num2= 4;
		operacionMatematica o;
		o= new Suma(num1,num2);
		System.out.println(o.calcular());
		o= new Resta(num1,num2);
		System.out.println(o.calcular());
		o= new Multiplicacion(num1,num2);
		System.out.println(o.calcular());
				
	}

	public static void main(String[] args) {
		new Principal();
	}
}
