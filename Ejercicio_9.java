package practica_0;

//Escribir un m´etodo static void imprimirFecha(int dia, int mes, int anio) que imprime la
//fecha pasada como par´ametro en formato del estilo “5 de Julio de 2030”.
import java.util.Scanner;

public class Ejercicio_9 {
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
		String monthString = "";
		switch (mes) {
		case 1: monthString = "Enero";
		break;
		case 2: monthString = "Febrero";
		break;
		case 3: monthString = "Marzo";
		break;
		case 4: monthString = "Abril";
		break;
		case 5: monthString = "Mayo";
		break;
		case 6: monthString = "Junio";
		break;
		case 7: monthString = "Julio";
		break;
		case 8: monthString = "Agosto";
		break;
		case 9: monthString = "Septiembre";
		break;
		case 10: monthString = "Octubre";
		break;
		case 11: monthString = "Noviembre";
		break;
		case 12: monthString = "Diciembre";
		break;
		default: monthString = "MES INVALIDO";
				break;
		}
		System.out.println(dia + espacio + de + espacio + monthString + espacio 
				+ de + espacio  + anio );
	}

}
