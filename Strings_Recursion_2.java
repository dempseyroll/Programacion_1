package practica_0;
// 2- Escribir una función  public static int longitud(String s) 
//Devuelve la longitud de la cadena s. No vale usar length().
import java.util.Scanner;


public class Strings_Recursion_2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Ingrese una cadena");
		String cadena = scan.nextLine();
		System.out.println("La longitud de la cadena " + cadena + " es " + longitud(cadena));
	}
	public static int longitud(String s) {
		// debe devolver long. de cadena s sin usar length.
		if (s == "") {
			return 0;
		}
		else {
			String cad = resto(s);
			return longitud(cad) + 1;
		}
	}
	public static String resto(String s) { 
		String nuevo = "";
		for (int i = 1; i < s.length(); i++) { //arranca en la posicion 1 dejando afuera la posicion 0
			nuevo = nuevo + s.charAt(i);
		}
		return nuevo;
	}

}
