package practica_0;
/* Escribir una funcion que tome una cadena como parametro y la imprima por consola intercalando un * 
 * entre cada letra. Por ejemplo, si la funcion toma la cadena ”hola” como parametro, debera imprimir ”h*o*l*a”. 
 * Se puede dar por hecha la funcion static String resto(String s) que devuelve una cadena igual a s pero sin 
 * su primer caracter.
 */
import java.util.Scanner;

public class Ejercicio_34 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Escriba una palabra: ");
		String palabra = scan.next().toLowerCase();
		System.out.println(intercalaAsterisco(palabra)); 
		scan.close();
	}
	
	 static String intercalaAsterisco(String word) {
		 if (word == "") {
			 return word;
		 }
		 String nueva = resto(word);
		 if (nueva.length() % 2 != 0) {
			 return word.charAt(0) + "*"  + intercalaAsterisco(nueva);
			 
		 }
		 else if (word.length() == 1) {
			 return word.charAt(0) + intercalaAsterisco(nueva) ; 
		 }
		 else {
			 return word.charAt(0) + "*"  + intercalaAsterisco(nueva) ; 
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
