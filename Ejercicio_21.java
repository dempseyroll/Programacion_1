package practica_0;

import java.util.Scanner;

/*
Escribir un método static boolean esSinRepetidos(String s) que dada una cadena, devuelve true si no hay letras 
repetidas en la cadena. En caso contrario, devuelve false. No utilizar el método del ejercicio 22.
 */

public class Ejercicio_21 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Escriba una palabra: ");
		String palabra  = scan.nextLine();
		System.out.println(esSinRepetidos(palabra));
		scan.close();
	}

	static boolean esSinRepetidos(String s) {
		for(int i=0; i < s.length(); i++) {
			for(int j=i+1; j < s.length(); j++) {
				if (s.charAt(i) == s.charAt(j)) {
					return false;
				}
			}
		}
		return true;
	}
}
