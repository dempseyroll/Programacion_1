package src;
//3. Hacer una función que se llame public static boolean sonIguales(String s1, String s2) y devuelva true si ambos String son iguales. No usar el método .equals().

import java.util.Scanner;

public class Ejercicio_Tres {
	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		Scanner scan2 = new Scanner (System.in);
		System.out.println("Ingrese una palabra: ");
		String string1 = scan.nextLine();
		System.out.println("Ingrese otra palabra: ");
		String string2 = scan.nextLine();
		System.out.println(sonIguales(string1, string2));
	}
	static boolean sonIguales(String s1, String s2) {
		for (int i = 0; i < s1.length(); i++) {
			if (s1.charAt(i) != s2.charAt(i)) {
				return false;
			}	
		}
		return true;
	}
}
