package practica_0;
//Escribir un m´etodo static double potencia(double x, int a) que toma un n´umero racional
//x y un entero a y calcula x^a.


import java.util.Scanner;
import java.lang.Math;

public class Ejercicio_12 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Scanner scan2 = new Scanner(System.in);
		System.out.println("Escriba la base: ");
		double base  = scan.nextFloat();
		System.out.println("Ahora el exponente: ");
		int exponente  = scan2.nextInt();
		System.out.println(base + " elevado a la " + exponente + " es " + potencia(base, exponente));
	}
	static double potencia(double x, int a) {
		double calculo = Math.pow(x, a);
		return calculo;
	}
}
