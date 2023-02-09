package practica_0;
import java.util.Scanner;
/* Escribir las versiones recursivas de los siguientes métodos de la Sección 3: 
 c) potencia: static int potenciaRec(double x, int n):
 	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Scanner scan2 = new Scanner(System.in);
		System.out.println("Escriba la base: ");
		double base  = scan.nextFloat();
		System.out.println("Ahora el exponente: ");
		int exponente  = scan2.nextInt();
		System.out.println(base + " elevado a la " + exponente + " es " + potencia(base, exponente));
	}
	static double potencia(double x, int a) {
		double calculo = Math.pow(x, a);
		return calculo;
	
*/

public class Ejercicio_30c {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Scanner scan2 = new Scanner(System.in);
		System.out.println("Escriba la base: ");
		double base  = scan.nextFloat();
		System.out.println("Ahora el exponente: ");
		int exponente  = scan2.nextInt();
		System.out.println(base + " elevado a la " + exponente + " es " + potenciaRec(base, exponente));
		scan.close();
		scan2.close();
	}
	static double potenciaRec(double x, int n) {
		if (n == 0) {
			return 1;
		}
		else if (n == 1) {
			return x;
		}
		else {
			return x * potenciaRec(x, n - 1);
		}
	}
}
