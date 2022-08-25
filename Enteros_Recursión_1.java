package practica_0;
// 1. int sumaDesdeUnoHasta(int n)
// Devuelve la suma de todos los numeros entre 1 y n.
import java.util.Scanner;

// Test = 10, 5, 8
// 10 --> 1 + 2 + 3 + 4 + 5 + 6 + 7 + 8 + 9 + 10 = 55
// 5 --> 1 + 2 + 3 + 4 + 5 = 15
// 8 --> 1 + 2 + 3 4 + 5 + 6 + 7 + 8 = 36
public class Enteros_Recursión_1 {
	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		System.out.println("Escriba un numero: ");
		int numero = scan.nextInt();
		System.out.println("La suma de todos los numeros desde 1 hasta " + numero + " es " + sumaDesdeUnoHasta(numero));
	}
	static int sumaDesdeUnoHasta(int n) {
		if (n == 1) {
			return 1;
		}
		else {
			return n + sumaDesdeUnoHasta(n - 1);
		}
	}
}
