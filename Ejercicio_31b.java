package practica_0;
/* Los numeros de la sucesión se obtienen de la siguiente manera: 
 f0 = 0 
 f1 = 1 
 fn = fn−2+fn−1 
 Los primeros números de la sucesión serían entonces: 0,1,1,2,3,5,8,13,21,... 
 b) usando un ciclo, con la siguiente signatura: static int fibiter(int n)
 */
import java.util.Scanner;

public class Ejercicio_31b {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Escriba un numero: ");
		int numero = scan.nextInt();
		System.out.println("El numero " + numero + " de la sucesion es " + fibiter(numero));
		scan.close();
	}
	static int fibiter(int n) {
		int a = 0;
		int b = 1;
		int fib = 0;
		if (n <= 1) {
			return n;
		}
		for (int i = 2; i <= n; i++) {
			fib = a + b;
			a = b;
			b = fib;
		}
		return fib;
	}
}
