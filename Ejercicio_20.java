package practica_0;

import java.util.Scanner;

/* Escribir el método static boolean esCapicua(String s) que dada una cadena, devuelve true si la cadena 
 * es igual de atrás hacia adelante o de adelante hacia atrás. En caso contrario, devuelve false.
 */

public class Ejercicio_20 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Escriba una palabra: ");
		String palabra  = scan.nextLine().toLowerCase();
		System.out.println(esCapicua(palabra));
		scan.close();
	}

	static boolean esCapicua(String s) {
		String nueva = "";
		for (int i=s.length() - 1 ; i >= 0; i--) {
			nueva += s.charAt(i);
		}
		if (s.equals(nueva)) {
			return true;
		}
		else {
			return false;
		}
	}
}
