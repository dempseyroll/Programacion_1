package practica_0;

import java.util.Scanner;

/*
Decimos que una cadena de caracteres es un doblete capicúa si la cadena es la concatenación de dos cadenas capicúas. 
Por ejemplo: ”neuquenoro” es doblete capicúa ya que es la concatenación de ”neuquen” y ”oro”. ”banana” es doblete 
capicúa ya que es la concatenación de ”b” y ”anana”, ambas capicúa. Lo mismo sucede con ”eter” ya que es la 
concatenación de ”ete” y ”r”, ambas capicúa. ”sanas” es doblete capicúa ya que es la concatenación de ”sanas” y ””. 
”nunca” no es doblete capicúa ya que no hay manera de formarla concatenando dos capicúas. 
Escribir un método static boolean esDoblete(String s) que devuelve true cuando la cadena es doblete capicúa y 
false en caso contrario.
Tests:
neuquenoro
banana
eter
sanas
nunca

ME FALLA SOLO CON "banana"
 */

public class Ejercicio_24 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Escriba una palabra: ");
		String palabra  = scan.nextLine();
		System.out.println(esDoblete(palabra));
		scan.close();
	}
	static boolean esDoblete(String s) {
		String capiUno = "";
		String capiDos = "";
		for (int i = 0 ; i < s.length(); i++) {
			capiUno += s.charAt(i);
			if (capiUno.length() > 2) {
				String candidataCapiUno = "";
				for (int j = capiUno.length() -1; j >= 0; j--) {
					//System.out.println(candidataCapiUno);
					candidataCapiUno += capiUno.charAt(j);
				}
				if (capiUno.equals(candidataCapiUno)) {
					String candidataCapiDos = "";
					for (int k = i + 1; k < s.length(); k++) {
						capiDos += s.charAt(k);
					}
					for (int m = capiDos.length() - 1; m >= 0; m--) {
						candidataCapiDos += capiDos.charAt(m);
					}
					if (capiDos.equals(candidataCapiDos)) {
						return true; //True
					}
					//return candidataCapiUno; True
				}
				else {
					continue;
				}
					}
		}
		return false; //el False
	}
}

/* BKUP
	static String esDoblete(String s) {
		String capiUno = "";
		String capiDos = "";
		for (int i = 0 ; i < s.length(); i++) {
			capiUno += s.charAt(i);
			if (capiUno.length() > 2) {
				String candidataCapiUno = "";
				for (int j = capiUno.length() -1; j >= 0; j--) {
					System.out.println(candidataCapiUno);
					candidataCapiUno += capiUno.charAt(j);
				}
				if (capiUno.equals(candidataCapiUno)) {
					String candidataCapiDos = "";
					for (int k = i + 1; k < s.length(); k++) {
						capiDos += s.charAt(k);
					}
					for (int m = capiDos.length() - 1; m >= 0; m--) {
						candidataCapiDos += capiDos.charAt(m);
					}
					if (capiDos.equals(candidataCapiDos)) {
						return candidataCapiUno + candidataCapiDos; //True
					}
					//return candidataCapiUno; True
				}
				else {
					continue;
				}
					}
		}
		return "Fallo"; //el False
	}
	*/
