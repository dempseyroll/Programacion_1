package practica_0;
/* Escribir el metodo recursivo static String estaPrimera(String s1, String s2) que toma dos String s1 y s2 y devuelve 
 * el String que esta primero en el diccionario. Por ejemplo: 
estaPrimera(’’piedra’’, ’’cantor’’) debe devolver ’’cantor’’. 
estaPrimera(’’hielo’’, ’’holanda’’) debe devolver ’’hielo’’. 
estaPrimera(’’candelabro’’, ’’canario’’) debe devolver ’’canario’’.
 */
import java.util.Scanner;

public class Ejercicio_37 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Escriba la primer palabra: ");
		String palabraUno = scan.next().toLowerCase();
		Scanner scan2 = new Scanner(System.in);
		System.out.println("Escriba la segunda palabra: ");
		String palabraDos = scan2.next().toLowerCase();
		System.out.println(estaPrimera(palabraUno, palabraDos));
		scan.close();
		scan2.close();
	}

	static String estaPrimera(String s1, String s2) {
		if (s1.length() == 0 || s2.length() == 0 ) {
			return "";
		}
		String nuevaUno = resto(s1);
		String nuevaDos = resto(s2);

		if (s1.charAt(0) < s2.charAt(0)){
			return s1;
		}
		else if (s2.charAt(0) < s1.charAt(0)) {
			return s2;
		}
		return s1.charAt(0) + estaPrimera(nuevaUno, nuevaDos);
	}
	
	static String resto(String s) { 
		String nuevo = "";
		for (int i = 1; i < s.length(); i++) { //arranca en la posici�n 1 dejando afuera la posici�n 0
			nuevo = nuevo + s.charAt(i);
		}
		return nuevo;
		}
}
