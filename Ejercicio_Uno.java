package src;

//1. Hacer una función que tome un String y cuente la cantidad de veces que aparece la letra 'e' ya sea mayúscula o minúscula. Probarla en una función main() de pruebas en un archivo aparte.

import java.util.Scanner;

public class Ejercicio_Uno {
	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		System.out.println("Ingrese una palabra: ");
		String string = scan.nextLine();
		System.out.println("La cantidad de 'e' que hay en la palabra " + string + " es " + cuentaE(string));
	}
	static int cuentaE(String palabra) {
		int cantE = 0;
		for (int i = 0; i < palabra.length(); i++) {
			if (palabra.charAt(i) == 'E' || palabra.charAt(i) == 'e') {
				cantE+=1;
			}	
		}
		return cantE;
	}

}
