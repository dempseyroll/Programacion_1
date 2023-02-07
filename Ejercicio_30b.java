package practica_0;
import java.util.Scanner;
/* Escribir las versiones recursivas de los siguientes métodos de la Sección 3:
 b) sumatoriaPares: static int sumatoriaParesRec(int n): 
 	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Indique un numero limite para la sumatoria: ");
		int numero = scan.nextInt();
		System.out.println("La sumatoria de los numeros pares del 2 al " + numero + " es " + sumatoriaPares(numero));
	}
	static int sumatoriaPares (int n) {
		int i = 2;
		int par = 2;
		int suma = 0;
		int cero = 0;
		int anterior = 0;
		while (i <= n) {
			if (i % par == cero) {
				suma+=i;
				anterior+=suma;
				 i+=1;
			}
			i+=1;
		}
		return suma;
	
 */

public class Ejercicio_30b {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Indique un numero limite para la sumatoria: ");
		int numero = scan.nextInt();
		System.out.println("La sumatoria de los numeros pares del 2 al " + numero + " es " + sumatoriaParesRec(numero));
		scan.close();
	}
	static int sumatoriaParesRec(int n) {
		if (n <= 0) {
			return n;
		}
		if (n % 2 == 0) {
			return n + sumatoriaParesRec(n - 1);
		}
		else {
			return sumatoriaParesRec (n - 1);
		}
		
	}
}
