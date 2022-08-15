package practica_0;
//Escribir un m´etodo static int sumatoria(int n) que devuelve la sumatoria de los n´umeros desde 1 hasta n.

import java.util.Scanner;
public class Ejercicio_10 {
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
}
