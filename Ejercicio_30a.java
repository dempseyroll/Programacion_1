package practica_0;
import java.util.Scanner;
/* Escribir las versiones recursivas de los siguientes métodos de la Sección 3: 
 a) sumatoria: static int sumatoriaRec(int n) 
 c) potencia: static int potenciaRec(double x, int n) 
 d) factorial: static int factorialRec(int n)
 */

/* public class Ejercicio_10 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Indique un numero limite para la sumatoria: ");
		int numero = scan.nextInt();
		//sumatoria(numero);
		System.out.println("La sumatoria de los numeros del 1 al " + numero + " es " + sumatoria(numero));
	}
	 static int sumatoria(int n) {
		int i = 1;
		int suma = 0;
		for (i=1; i <= n; i++) {
			suma += i;
		}
		return suma;
	}
} */

public class Ejercicio_30a {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Indique un numero limite para la sumatoria: ");
		int numero = scan.nextInt();
		System.out.println("La sumatoria de los numeros del 1 al " + numero + " es " + sumatoriaRec(numero));
		scan.close();
	}
	
	static int sumatoriaRec(int n) {
		if (n == 0) {
			return n;
		}
		
		return n + sumatoriaRec(n - 1);
	}
}
