package practica_0;
//Escribir un m´etodo static double factorial(int n) que toma un entero positivo n y calcula
//n! (el factorial de n) que se define como el producto de todos los naturales desde 1 hasta n. Por
//ejemplo 5! = 5 × 4 × 3 × 2 × 1 = 120. Ojo: por definici´on, el factorial de 0, es 1 (0! = 1).


import java.util.Scanner;
//import java.lang.Math;

public class Ejercicio_13 {
	public static void main(String[] args) {
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
}
