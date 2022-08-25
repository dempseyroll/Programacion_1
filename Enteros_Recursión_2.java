package practica_0;
// 2. void imprimirHasta(int n)
// Imprime por pantalla los números entre 1 y n (en orden ascendente).

import java.util.Scanner;

public class Enteros_Recursión_2 {
	public static void main(String[] args) {
		imprimirHasta(25);
	}
	static void imprimirHasta(int n) {
		if (n == 1) {
			System.out.println(n);
		}
		else {
			int resta = n - 1;
			imprimirHasta(resta);
			System.out.println(n);
		}
	}
}
