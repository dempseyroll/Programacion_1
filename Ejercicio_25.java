package practica_0;

import java.util.Scanner;

/* Escribir un método static int maximo(int[] a) que dado un arreglo de enteros no vacío, 
devuelve el valor más alto que aparece.
 */

public class Ejercicio_25 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Escriba el tamanio del arreglo: ");
		int cant  = scan.nextInt();
		int [] cantArray = new int[cant];
		for (int i=0; i < cant; i++ ) {
			Scanner elem = new Scanner(System.in);
			System.out.println("Escriba el elemento "+ i + " del array: ");
			int elemArray  = elem.nextInt();
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
		
		System.out.println(maximo(cantArray));
		
	}
	
	static int maximo(int[] a) {
		int mayor = 0;
		if (a.length == 0) {
			return 0;
		}
		else if (a.length == 1) {
			return a[0];
		}
		for (int i = 0; i < a.length; i++) {
				if (mayor < a[i]) {
					mayor = a[i];
				}
				else {
					continue;
				}
		}
		return mayor;
	}
}