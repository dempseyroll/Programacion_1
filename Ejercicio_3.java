package practica_0;
import java.util.Scanner;

public class Ejercicio_3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Scanner scan2 = new Scanner(System.in);
		System.out.println("Ingrese un número: ");
		int a = scan.nextInt();
		System.out.println("Ingrese otro número: ");
		int b = scan2.nextInt();
		System.out.println("La suma es: " + (a+b));
	}

}
