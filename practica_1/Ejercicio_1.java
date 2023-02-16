package practica_1; 
import resolucion.Fraccion;

/* Teniendo en cuenta la siguiente clase en Java
 *  public class Fraccion
 *   { int numerador; int denominador; } 
 *   a) Escribir el constructor Fraccion(int numerador, int denominador) 
 *   b) Escribir el metodo de instancia void imprimir() que imprime en pantalla la fraccion en algun formato comodo. 
 Crear en un main una Fraccion e imprimirla con este metodo. 
 *   c) Escribir el m´etodo de instancia void invertirSigno() que invierte el signo del numero: si era negativo pasa a 
ser positivo y viceversa. 
 *   d) Escribir el metodo de instancia void invertir() que invierte el numerador y el denominador de la fraccion. 
 Ej. invertir(1/2) = 2/1. 
 	 e) Escribir el metodo de instancia double aDouble() que convierte el numero racional en un double (numero de 
punto flotante) y devuelve el resultado. 
 	 f) Escribir el metodo de instancia void reducir() que reduce el numero racional a sus terminos mas chicos. Para esto 
 buscar el MCD del numerador y el denominador y luego dividir numerador y denominador por su MCD. 
 Usar la funcion ya programada de la practica anterior. 
 	 g) Escribir el metodo de clase static Fraccion producto(Fraccion q1, Fraccion q2) que calcula el producto entre dos 
fracciones en nuevo objeto Fraccion. ´Este debe estar reducido a su m´ınima expresion, de modo que el numerador y el 
denominador no tengan un divisor comun mayor a 1. ¿Por que en este caso hace falta la palabra clave static? 
	 h) Escribir el metodo de clase static Fraccion suma(Fraccion q1, Fraccion q2) que calcula la suma de dos fracciones 
en un nuevo objeto Fraccion. ´Este debe debe estar reducido a su mınima expresion.
 */

public class Ejercicio_1 {
	public static void main(String[] args) {
		Fraccion f = new Fraccion(1,10);
		Fraccion f2 = new Fraccion(3,4);
		//f.imprimir();
		//f.invertirSigno();
		//f.invertir();
		//System.out.println(f.aDouble());
		//f.reducir();
		Fraccion finalFrac;
		//finalFrac = Fraccion.producto(f, f2);
		finalFrac = Fraccion.suma(f, f2);
		f.imprimir();
		f2.imprimir();
		finalFrac.imprimir();
		
	}
}