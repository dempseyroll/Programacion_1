//Escribir un m´etodo static void ponerNota(double x, double y) que toma dos n´umeros 
// decimales y los promedia. En caso que el promedio sea mayor o igual a 7, deber´a imprimir
//‘‘Promocionado’’, si es mayor o igual a 4 pero menor que 7, imprime ‘‘Aprobado’’ y si es menor
//que 4 imprime ‘‘Debe recuperar’’. Probarla llam´andola desde el main con distintos n´umeros.
//Luego, pedirle ambos n´umeros al usuario (usando nextFloat() del Scanner) para pas´arselos a
//ponerNota.
import java.util.Scanner;

public class ejercicio_8 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Scanner scan2 = new Scanner(System.in);
		System.out.println("Escriba un numero :");
		double decimal_1  = scan.nextFloat();
		System.out.println("Ahora otro numero :");
		double decimal_2  = scan2.nextFloat();
		ponerNota(decimal_1,decimal_2);

	}
	static void ponerNota(double x, double y) {
		double promedio = (x+y) / 2;
		if (promedio >= 7) { 
			System.out.println(promedio  + ": Promocionado");
		}
		else if (promedio >= 4 && promedio < 7) {
			System.out.println(promedio + ": Aprobado");			
		}
		else {
			System.out.println(promedio + ": Debe recuperar");			
		}
		
	}

}
