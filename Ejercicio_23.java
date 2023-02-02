package practica_0;
/*
Para el desarrollo de un sistema generador de juegos de palabras cruzadas, se necesita programar la siguiente función.
Dadas 3 cadenas, a, b y c, se quiere saber si puede colocarse b de manera vertical de modo que a y c se coloquen de 
manera horizontal atravezando a b. Se necesita también que a esté más arriba que c y tengan al menos un renglón de 
diferencia. Por ejemplo, a = ”JUGO”, b = ”BUENO”, c = ”ANANA” pueden colocarse como muestra la Figura 1, por lo tanto 
el método debe devolver Verdadero. En cambio, a = ”JUGO”, b = ”FEO”, c =”ANANA” no pueden colocarse, y por ende debería 
devolver Falso. El encabezado del método debe ser static boolean puedenColocarse(String a, String b, String c).
 */
import java.util.Scanner;

public class Ejercicio_23 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Escriba la primer palabra: ");
		String wordOne  = scan.nextLine();
		Scanner scanTwo = new Scanner(System.in);
		System.out.println("Escriba la segunda palabra: ");
		String wordTwo  = scan.nextLine();
		Scanner scanThree = new Scanner(System.in);
		System.out.println("Escriba la tercer palabra: ");
		String wordThree  = scan.nextLine();
		System.out.println(puedenColocarse(wordOne, wordTwo, wordThree));
		scan.close();
		scanTwo.close();
		scanThree.close();
	}
	
	static String puedenColocarse(String a, String b, String c) {
		// CÓDIGO DE LA FUNCION
		String esquema = "";
		esquema = esquema + "\n";
		for(int i=0; i < a.length(); i++) {
			esquema += a.charAt(i);
		}
		return(esquema);
	}
}
