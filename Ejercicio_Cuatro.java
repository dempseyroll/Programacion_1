package src;
// 4. Hacer una función que tome un String y devuelva true si es duódromo, y false en caso contrario. Un String es duódromo si está compuesto solamente por letras duplicadas contiguas.
// Por ejemplo "llaammaa" es duódroma, "ssaabb" es duódroma.

import java.util.Scanner;

public class Ejercicio_Cuatro {
	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		System.out.println("Ingrese una palabra: ");
		String word = scan.nextLine();
		System.out.println(esDuodroma(word));
	}
	static boolean esDuodroma(String s1) {
		if (s1.length() % 2 != 0)
			return false;
		for (int i = 0; i < s1.length(); i = i + 2) {
			if (s1.charAt(i) != s1.charAt(i+1)) {
				return false;
			}	
		}
		return true;
	}
}
