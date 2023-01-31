package practica_0;
// Una palabra se dice que es “abecedaria” si las letras en la palabra aparecen en orden alfabético.
// Por ejemplo, las siguientes son todas palabras abecedarias del idioma castellano.

// adiós, afín, afinó, ágil, bello, celos, cenó, chinos dijo, dimos, dios, fijos, finos, hijos, hilos, himno 
// 1. Describí un algoritmo para decidir si una palabra dada es abecedaria, asumiendo que la misma contiene sólo letras minúsculas.
// 2. Implementar el algoritmo en un método static boolean esAbecedaria(String s).
// 3. ¿Funciona el algoritmo si le pasamos como parámetro ‘‘agil’’? 
// En caso negativo, ¿por qué te parece que puede ser? ¿Cómo lo solucionarías?


import java.util.Scanner;

public class Ejercicio_19 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Escriba una palabra: ");
		String palabra  = scan.nextLine().toLowerCase();
		System.out.println(esAbecedaria(palabra));
		scan.close();
        }
	
	static boolean esAbecedaria(String s) {
		boolean isAlphabetic = true;
        for (int i = 1; i < s.length(); i++) {
        	      //char c = abecedario.charAt(j);
        	      char anterior = s.charAt(i-1);
                  if ( s.charAt(i) < anterior  ) {
                  	isAlphabetic = false;
                      break;
                      }
                  
        }
        if (isAlphabetic) {
            return true;
        } else {
            return false;
            }
        
	}
	}