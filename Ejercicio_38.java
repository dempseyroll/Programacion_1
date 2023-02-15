package practica_0;
/* Escribir una funcion recursiva static String rotacion(String s) que devuelve el String que resulta de rotar n posiciones
 *  a la izquierda los caracteres de s. Por ejemplo: 
 *  rotacion(’’abcdefghi’’, 1) debe devolver ’’bcdefghia’’. 
 *  rotacion(’’abcdefghi’’, 3) debe devolver ’’defghiabc’’. 
 *  rotacion(’’abc’’, 3) debe devolver ’’abc’’. 
 *  rotacion(’’abc’’, 5) debe devolver ’’cab’’.
 */
import java.util.Scanner;

public class Ejercicio_38 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Escriba una palabra: ");
		String palabra = scan.next().toLowerCase();
		Scanner scan2 = new Scanner(System.in);
		System.out.println("Escriba un numero: ");
		int numero = scan.nextInt();
		System.out.println(rotacion(palabra, numero)); 
		scan.close();
		scan2.close();
	}

	static String rotacion(String s, int n) {
		if (s == "" || n == 0) {
			return s;
		}
		String nueva = resto(s);
		return rotacion(nueva + s.charAt(0), n -1);
	}
	
	static String resto(String s) { 
		String nuevo = "";
		for (int i = 1; i < s.length(); i++) { //arranca en la posici�n 1 dejando afuera la posici�n 0
			nuevo = nuevo + s.charAt(i);
		}
		return nuevo;
		}
}
