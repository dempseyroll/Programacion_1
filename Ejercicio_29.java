package practica_0;

import java.util.Scanner;

/* Escribir un método static double promedio(double[] a) que dado un arreglo de números con coma, devuelve el valor
  del promedio de todos los elementos.
 */

public class Ejercicio_29 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Escriba el tamanio del arreglo: ");
		int cant  = scan.nextInt();
		double [] cantArray = new double[cant];
		for (int i=0; i < cant; i++ ) {
			Scanner elem = new Scanner(System.in);
			System.out.println("Escriba el elemento "+ i + " del array: ");
			double elemArray  = elem.nextDouble();
			cantArray[i] = elemArray;
			if (i >= cant) {
				elem.close();
			}
			else {
				continue;
			}
		}
		scan.close();
		/*System.out.println("Los elementos del array son: ");
		for (int j=0; j < cantArray.length; j++) {
			System.out.println(cantArray[j] + " ");
		} --> ESTO ERA PARA PROBAR IMPRIMIR LOS ELEM DEL ARRAY */
		
		System.out.println(promedio(cantArray));
	}
	
	static double promedio(double[] a) {
		double prom = 0.0;
		for (int i = 0; i < a.length; i++) {
			prom += a[i];
		}
		double promFinal = prom / a.length;
		return promFinal;
	}
}
