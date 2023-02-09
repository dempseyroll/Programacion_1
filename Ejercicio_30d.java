package practica_0;
/* Escribir las versiones recursivas de los siguientes métodos de la Sección 3: 
 d) factorial: static int factorialRec(int n)

 {
		Scanner scan = new Scanner(System.in);
		System.out.println("Escriba un numero positivo: ");
		int entero = scan.nextInt();
		System.out.println("El factorial de " + entero + " es " + factorial(entero));
	}
	static double factorial(int n) {
		double resultado = n;
		int min = 1;
		while (n > min) {
			resultado = resultado * (n-1);
			n -= 1;
		}
		return resultado;
	}
*/

import java.util.Scanner;

public class Ejercicio_30d {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Escriba un numero positivo: ");
		int entero = scan.nextInt();
		System.out.println("El factorial de " + entero + " es " + factorialRec(entero));
		scan.close();
	}
	
	static int factorialRec(int n) {
		if (n == 1) {
			return n;
		}
		else {
			return n * factorialRec(n-1);
		}
	}
}
