package src;
//2. Hacer una función que devuelva true si el String está compuesto solamente por letras 'e', y false en caso contrario.

import java.util.Scanner;

public class Ejercicio_Dos {
	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		System.out.println("Ingrese una palabra: ");
		String string = scan.nextLine();
		System.out.println(soloE(string));
	}
	static boolean soloE(String palabra) {
		for (int i = 0; i < palabra.length(); i++) {
			if (palabra.charAt(i) != 'e') {
				return false;
			}	
		}
		return true ;
	}

}
