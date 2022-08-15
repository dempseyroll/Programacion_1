package practica_0;
//Escribir un m´etodo static int sumatoriaPares(int n) que devuelve la sumatoria de los n´umeros pares desde 2 hasta n.

import java.util.Scanner;

public class Ejercicio_11 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Indique un numero limite para la sumatoria: ");
		int numero = scan.nextInt();
		System.out.println("La sumatoria de los numeros pares del 2 al " + numero + " es " + sumatoriaPares(numero));
	}
	static int sumatoriaPares (int n) {
		int i = 2;
		int par = 2;
		int suma = 0;
		int cero = 0;
		int anterior = 0;
		while (i <= n) {
			if (i % par == cero) {
				suma+=i;
				anterior+=suma;
				 i+=1;
			}
			i+=1;
		}
		return suma;
	}
}
