package practica_0;

import java.util.Scanner;

/* Escribir un método static boolean estaOrdenado(int[] a) que dado un arreglo de enteros, devuelve verdadero 
 si el arreglo está ordenado crecientemente de menor a mayor, y falso en caso contrario.
 */

public class Ejercicio_28 {

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
		
		System.out.println(estaOrdenado(cantArray));
	}
	
	static boolean estaOrdenado(int[] a) {
		int index = 0;
		if (a.length == 0) {
			return false; // convencion ya que no habría nada que ordenar.
		}
		else if (a.length == 1) {
			return true; // convencion ya que no habría nada que ordenar.
		}
		for (int i = 0; i < a.length; i++) {
			if (index < a[i]) {
				index = a[i];
			}
			else {
				return false;
				}
			}
		return true;
		}
}
