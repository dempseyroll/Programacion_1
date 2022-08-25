package practica_0;
// 1- Escribir una función recursiva llamada public static void imprimirEspaciado(String s) que tome un String 
// e imprima el String con espacios entre cada caracter.
// Ejemplo:
// imprimirEspaciado(“Juan”)
// imprime "J u a n"
// Hacer primero la función auxiliar resto(String s) que devuelva toda la cadenas menos el primer caracter.

public class Strings_Recursión_1 {
	public static void main(String[] args) {
		imprimirEspaciado("Hola?");
	}
	public static String resto(String s) { 
		String nuevo = "";
		for (int i = 1; i < s.length(); i++) { //arranca en la posición 1 dejando afuera la posición 0.
			nuevo = nuevo + s.charAt(i);
		}
		return nuevo;
	} // Fin de función auxiliar.
	public static void imprimirEspaciado(String s) {
		if (s == "") {
			System.out.println("");
		}
		else {
			String n = resto(s);
			System.out.print(s.charAt(0) + " ");
			imprimirEspaciado(n);
		}
	}
}
