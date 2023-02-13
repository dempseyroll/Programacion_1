package practica_0;
/* La sucesión de Fibonacci es una sucesión de números naturales que describe, por ejemplo, el número de individuos 
 * en una población de conejos tras varias generaciones. Esta sucesión tiene la particularidad de estar presente en 
 * muchos elementos de la naturaleza, y que a medida que se aproxima al infinito, el cociente entre dos elementos 
 * consecutivos, se aproxima a la proporción áurea. 
 * Los numeros de la sucesión se obtienen de la siguiente manera: 
 * f0 = 0 
 * f1 = 1 
 * fn = fn−2+fn−1 
 * Los primeros números de la sucesión serían entonces: 0,1,1,2,3,5,8,13,21,... 
 * Implementar el método que devuelve el n-ésimo elemento de la sucesión: 
 * a) usando recursividad, con la siguiente signatura: static int fibrec(int n)
 */
import java.util.Scanner;
public class Ejercicio_31a {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Escriba un numero: ");
		int numero = scan.nextInt();
		System.out.println("El numero " + numero + " de la sucesion es " + fibrec(numero));
		scan.close();
	}
	static int fibrec(int n) {
		if (n <= 1) {
			return n;
		}
		else {
			return fibrec(n-2) + fibrec(n-1);
		}
	}
}
