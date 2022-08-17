package practica_0;
// Escribir un m´etodo static int cantidadVocales(String s) 
// que dada una cadena que contiene s´olo letras min´usculas sin acentuar, 
// devuelve la cantidad de vocales en dicha cadena.Nota: se puede utilizar el m´etodo definido en el ejercicio anterior.

import java.util.Scanner;

public class Ejercicio_18 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Escriba una palabra: ");
		String cadena  = scan.nextLine();
		System.out.print(cantidadVocales(cadena));
	}
	static int cantidadVocales(String s) {
		int cantVocales = 0;
		String vocales = "aeiouAEIOU";
		for (int i = 0; i < s.length(); i++) {
			for (int j = 0; j < vocales.length(); j++) {
				if (s.charAt(i) == vocales.charAt(j) ) {
					cantVocales+=1;
					break;
				}	
			}
		}
		return cantVocales;
	}
}
