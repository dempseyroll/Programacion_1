package practica_0;
/* Escribir una funcion que tome una cadena como parametro y devuelva otra sin caracteres repetidos contiguos. 
 * Por ejemplo, si la funcion toma la cadena ”pollos” como parametro, debera devolver ”polos”. 
 * Si la funcion toma ”gggeeeeeuddddduu”, debera devolver ”geudu”. 
 * Se debera usar la funcion static String resto(String s) que devuelve una cadena igual a s pero sin su primer caracter.
 */

import java.util.Scanner;

public class Ejercicio_35 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Escriba una palabra: ");
		String palabra = scan.next().toLowerCase();
		System.out.println(sinRepetidos(palabra)); 
		scan.close();
	}
	static String sinRepetidos (String word) {
		if (word == "") {
			return word;
		}
		String nueva = resto(word);
		if (word.length() == 1) {
			return word.charAt(0) + sinRepetidos(nueva);
		}
		else if (word.charAt(0) != nueva.charAt(0)) {
			return word.charAt(0) + sinRepetidos(nueva);
		}
		else {
			return sinRepetidos(nueva);
		}
	}
	
	static String resto(String s) { 
		String nuevo = "";
		for (int i = 1; i < s.length(); i++) { //arranca en la posici�n 1 dejando afuera la posici�n 0
			nuevo = nuevo + s.charAt(i);
		}
		return nuevo;
		}
}
