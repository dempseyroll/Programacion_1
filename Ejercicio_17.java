package practica_0;
// Escribir un m´etodo static int cantidadApariciones(String s, char c)
// que dada una cadena y un caracter, cuenta la cantidad de veces que aparece c en s.

import java.util.Scanner;

public class Ejercicio_17 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Scanner scan2 = new Scanner(System.in);
		System.out.println("Escriba una palabra: ");
		String palabra  = scan.nextLine();
		System.out.println("Escriba una letra: ");
		char letra  = scan.next().charAt(0);
		System.out.println(cantidadApariciones(palabra, letra));
	}

	static int cantidadApariciones(String s, char c) {
		int cantApariciones = 0;
		for (int i = 0; i < s.length(); i++) {
			if ( c == s.charAt(i)) {
				cantApariciones+=1;
			}
		}
		return cantApariciones;
	}
}
