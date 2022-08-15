package practica_0;
//Escribir un m´etodo static boolean esDivisible(int n, int m) que devuelve true si n es divisible por m 
// y false en caso contrario. Probarlo adecuadamente llam´andola desde el main.

import java.util.Scanner;

public class Ejercicio_15 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Scanner scan2 = new Scanner(System.in);
		System.out.println("Escriba el numero a dividir: ");
		int a  = scan.nextInt();
		System.out.println("Ahora el divisor: ");
		int b  = scan2.nextInt();
		System.out.println(esDivisible(a, b));
	}
	static boolean esDivisible(int n, int m) {
		if (n % m == 0) {
			return true;
		} 
		else {
			return false;
		}
	}

}
