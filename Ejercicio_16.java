package practica_0;
// a) Escribir un programa que pida por pantalla un texto y a continuación lo imprima de atrás para
// adelante. Para obtener las letras de una cadena de caracteres pueden utilizar el método charAt
// de String. Por ejemplo, cadena.charAt(0) devuelve el primer caracter del String cadena.
// b) Mover el código que imprime la cadena al revés a un método
// static void imprimirReversa(String cadena)
// c) Escribir un método static String reversa(String cadena) que dado un String, devuelve otro
// String con los caracteres invertidos. Por ejemplo, reversa(‘‘hola’’) debería devolver el String
// "aloh".
// d) Modificar el método imprimirReversa para que utilice el método definido en el punto anterior.

import java.util.Scanner;

public class Ejercicio_16 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Escriba un texto: ");
		String cadena  = scan.nextLine();
		System.out.print(imprimirReversa(cadena));
	}
	static String imprimirReversa(String chain) {
		String cadenaInvertida = "";
		for (int i = chain.length() -1; i >= 0; i--) {
			cadenaInvertida = cadenaInvertida + chain.charAt(i);
		}
		return cadenaInvertida;
	}
}
