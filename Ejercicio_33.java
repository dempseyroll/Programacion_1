package practica_0;
/* (Ejercicio 5.10 del libro) El siguiente algoritmo es conocido como el algoritmo de Euclides ya que aparece en 
 * los Elementos de Euclides (Libro 7, año 300 a.c.). Es probablemente el algoritmo no trivial mas antiguo que se 
 * conoce. El algoritmo se basa en la observacion de que, si r es el resto de dividir a por b, entonces los divisores 
 * en comun entre a y b son los mismos que los divisores en comun entre b y r. 
 * Asi, podemos usar la ecuación: 
 * mcd(a,b) = mcd(b,r) 
 * para reducir reiteradamente el problema de calcular un MCD(maximo comun divisor) al problema de calcular el MCD de 
 * pares de enteros cada vez mas pequeños. Por ejemplo: 
 * mcd(36,20) = mcd(20,16) = mcd(16,4) = mcd(4,0) = 4
 * 
 * implica que el MCD entre 36 y 20 es 4. Se puede demostrar que para cualquier par de numeros iniciales, 
 * esta reduccion repetida eventualmente genera un par en el cual el segundo numero es 0. 
 * Asi, el MCD es el otro numero del par. 
 * Escribir, utilizando recursividad, un metodo int mcd(int a, int b) que calcula el maximo comun divisor entre a y b.
 */
import java.util.Scanner;

public class Ejercicio_33 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Escriba el primer numero: ");
		int numero = scan.nextInt();
		Scanner scan2 = new Scanner(System.in);
		System.out.println("Escriba el segundo numero: ");
		int numeroDos = scan2.nextInt();
		System.out.println(mcd(numero, numeroDos));
		scan.close();
		scan2.close();
	}
	static int mcd(int a, int b) {
		if (b == 0 ) {
			return a;
		}
		return mcd(b, a % b);
	}
}
