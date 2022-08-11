//An´alogamente al ejercicio anterior, escribir 
//un m´etodo static void imprimirPromedio(int a, int b)
//que imprima el promedio de los dos par´ametros.
import java.util.Scanner;

public class ejercicio_7 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Scanner scan2 = new Scanner(System.in);
		System.out.println("Escriba un numero :");
		int hola  = scan.nextInt();
		System.out.println("Ahora otro numero :");
		int chau  = scan2.nextInt();
		imprimirPromedio(hola,chau);
	}

	static void imprimirPromedio(int a, int b) {
		int promedio = (a+b)/2;
		System.out.println("La promedio de los numeros es " + promedio);
	}

}
