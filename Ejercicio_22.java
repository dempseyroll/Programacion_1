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
		for (int i = 0; i < s.length(); i++) {
		  char currentChar = s.charAt(i);
		  boolean found = false;
		  for (int j = 0; j < nueva.length(); j++) {
		    if (nueva.charAt(j) == currentChar) {
		      found = true;
		      break;
		    }
		  }
		  if (!found) {
		    nueva += currentChar;
		    }
		}
		return nueva;
	}
}
