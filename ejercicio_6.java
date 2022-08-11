import java.util.Scanner;		

public class ejercicio_6 {
//Escribir un m´etodo static void imprimirSuma(int a, int b) que al igual que el ejercicio 3 imprima la suma de los dos par´ametros. 
//Modificar el programa de dicho ejercicio para que utilice este
//m´etodo
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Scanner scan2 = new Scanner(System.in);
		System.out.println("Escriba un numero :");
		int hola  = scan.nextInt();
		System.out.println("Ahora otro numero :");
		int chau  = scan2.nextInt();
		imprimirSuma(hola,chau);
	}

	static void imprimirSuma(int a, int b) {
		int resultado = a+b;
		System.out.println("La suma de los numeros es igual a " + resultado);
	}
}
