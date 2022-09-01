package practica;
// 1 public [static?] int diasDelMes(int mes, int año)
// Devuelve la cantidad de días del mes dado, en el año dado.

	public class Fecha_1 {
		int dia;
		int mes;
		int anio;

// Constructor		
	public Fecha_1() {
		this.dia = 1;
		this.mes = 1;
		this.anio = 1970;
	}
	
// Método de instancia
	public void imprimir() {
	System.out.println(this.dia + "/" + this.mes + "/" + this.anio);
	}
}


