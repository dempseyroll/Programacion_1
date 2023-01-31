package practica_0;

import java.util.Scanner;

/* 
 Escribir un método static String sinRepetidos(String s) que dada una cadena, devuelve una nueva cadena donde cada 
 uno de los caracteres que aparecían en s, aparecen sólo una vez. Se debe mantener la posición relativa de los 
 caracteres: para aquellos que se encuentren repetidos puede conservarse cualquiera de sus apariciones. 
 Por ejemplo, para la palabra ‘‘casos’’ puede devolver ‘‘caso’’ o ‘‘caos’’, conservando la primera o la 
 segunda letra s respectivamente.
 */

public class Ejercicio_22 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Escriba una palabra: ");
		String palabra  = scan.nextLine();
		System.out.println(sinRepetidos(palabra));
		scan.close();
	}
	static String sinRepetidos(String s) {
		String nueva = "";
		for (int i=1; i < s.length(); i++) {
			char c = s.charAt(0);
			if (s.charAt(i) == s.charAt(i-1)) {
				continue;
				}
			else {
				nueva = nueva + s.charAt(i);
				}
			nueva = c + nueva;
			}
		
		return nueva;
	}
}
