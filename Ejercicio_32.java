package practica_0;
/* La sucesión de Collatz se define de la siguiente manera. 
 * Se comienza del número n y se prosigue así: 
 * Si n es par, entonces el siguiente número es n/2 
 * Si n es impar, entonces el siguiente número es 3 ∗ n + 1 
 * Cuando n vale 1, no hay siguiente número. 
 * Escribir un método static void collatz(int n) que toma un natural n e imprime, en líneas separadas,
 *  los números de la sucesión.
 */
import java.util.Scanner;

public class Ejercicio_32 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Escriba un numero: ");
		int numero = scan.nextInt();
		collatz(numero);
		scan.close();
	}
	
	static void collatz(int n) {
		System.out.println(n);
		while (n != 1) {
			if (n % 2 == 0) {
				n = n / 2;
				System.out.println(n);
			}
			else {
				n = 3 * n + 1;
				System.out.println(n);
			}
		}
	}
}
