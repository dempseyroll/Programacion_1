package practica_0;
// 3- Escribir una función recursiva llamada public static String reverso(String s) 
// que tomé un String y devuelva el String que resulta de invertir todos sus caracteres.
import java.util.Scanner;

public class Strings_Recursion_3 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Ingrese una cadena");
		String cadena = scan.nextLine();
		System.out.println("La palabra invertida de " + cadena + " es " + reverso(cadena));
	}
	public static String reverso(String s) {
		// devuelva un string que resulte de invertir todos sus caracteres. Quizá tmb usando la funcion resto().
		if (s == "") {
			return "";
		}
		else {
			String cad = resto(s);
			return reverso(cad) + s.charAt(0);
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
