package arreglos;
// 0. public static void imprimir(int[] a)
//Imprime por pantalla los elementos del arreglo.

import java.util.Scanner;

public class Ejercicio_0 {
	public static void main(String[] args) {
		int [] arreglo = new int [4];
		for (int i = 0; i < arreglo.length; i++) {
			Scanner scan = new Scanner(System.in);
			System.out.println("Escriba un elemento: ");
			int elemento = scan.nextInt();
			arreglo[i] = elemento;
			System.out.println("Elementos del arreglo: " + arreglo[i]);
		}
		//System.out.println("Elementos del arreglo: " + arreglo);
		
	}
	
	public static void imprimir(int[] a) {
		
	//	return arreglo;
	}
}
