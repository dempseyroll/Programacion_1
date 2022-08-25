package practica_0;
// 3. void imprimirDesde(int n)
// Imprime por pantalla los números entre 1 y n (en orden descendente).

public class Enteros_Recursión_3 {
	public static void main(String[] args) {
		imprimirDesde(5);
	}
	static void imprimirDesde(int n) {
		if (n == 1) {
			System.out.println(n);
		}
		else {
			int resta = n - 1;
			System.out.println(n);
			imprimirDesde(resta);
		}
	}

}
