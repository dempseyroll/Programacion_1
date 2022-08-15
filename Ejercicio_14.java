package practica_0;
// Escribir un m´etodo static int cantCifras(int n) que devuelve la cantidad de cifras de n.
// Probarlo adecuadamente llam´andola desde el main.

import java.util.Scanner;

public class Ejercicio_14 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Escriba un numero: ");
		int numero = scan.nextInt();
		System.out.println("La cantidad de cifras de " + numero + " es " + cantCifras(numero));
	}
	static int cantCifras(int n) {
		int cifras;
		for (cifras = 0; n != 0 ; cifras++){
			n = n/10;
		}
		return cifras;
	}
}
