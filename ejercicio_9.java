//Escribir un m´etodo static void imprimirFecha(int dia, int mes, int anio) que imprime la
//fecha pasada como par´ametro en formato del estilo “5 de Julio de 2030”.
import java.util.Scanner;

public class ejercicio_9 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Scanner scan2 = new Scanner(System.in);
		Scanner scan3 = new Scanner(System.in);
		System.out.println("Escriba el dia: ");
		int day  = scan.nextInt();
		System.out.println("Ahora el mes: ");
		int month  = scan2.nextInt();
		System.out.println("Por ultimo el año: ");
		int year  = scan3.nextInt();
		imprimirFecha(day, month, year);
	}
	static void imprimirFecha(int dia, int mes, int anio) {
		String de = "de";
		String espacio = " ";
		System.out.println(dia + espacio + de + espacio + mes + espacio 
				+ de + espacio  + anio );
	}

}

// Faltan los meses como Strings.