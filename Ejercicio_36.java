package practica_0;
/* Escribir el metodo recursivo static int prodCifras(int n), que devuelve el producto de las cifras distintas a 0 de 
 * un numero entero positivo. Por ejemplo: 
 * prodCifras(2034) debe devolver 24. 
 * prodCifras(52) debe devolver 10. 
 * prodCifras(9) debe devolver 9. 
 * prodCifras(11020) debe devolver 2.
*/
import java.util.Scanner;

public class Ejercicio_36 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Escriba un numero: ");
		int numero = scan.nextInt();
		System.out.println(prodCifras(numero)); 
		scan.close();
	}
	static int prodCifras(int n) {
		if (n < 10) {
			return n;
		}
		else if (n%10 != 0) {
			return n % 10 * prodCifras(n / 10);
		}
		 
		return prodCifras (n / 10);
	}
}
