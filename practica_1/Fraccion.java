package resolucion;

public class Fraccion {
    int numerador;
    int denominador;
// Constructor: 
    public Fraccion(int n, int d) {
    	this.numerador = n;
    	this.denominador = d;
    }
    
    public void imprimir() {
    	System.out.println(this.numerador + "/" + this.denominador);
    }
    
    public void invertirSigno() {
    	if (this.numerador > 0 && this.denominador > 0) {
    		this.numerador = this.numerador - (this.numerador * 2);
    		this.denominador = this.denominador - (this.denominador * 2);
    		System.out.println(this.numerador + "/" + this.denominador);
    	}
    	else if (this.numerador < 0 && this.denominador < 0) {
    		this.numerador = (this.numerador * -2) + (this.numerador);
    		this.denominador = this.denominador + (this.denominador * -2);
    		System.out.println(this.numerador + "/" + this.denominador);
    	}
    	else if (this.numerador > 0 && this.denominador < 0) {
    		this.numerador = this.numerador - (this.numerador * 2);
    		this.denominador = this.denominador + (this.denominador * -2);
    		System.out.println(this.numerador + "/" + this.denominador);
    	}
    	else if (this.numerador < 0 && this.denominador > 0) {
    		this.numerador = (this.numerador * -2) + (this.numerador);
    		this.denominador = this.denominador - (this.denominador * 2);
    		System.out.println(this.numerador + "/" + this.denominador);
    	}
    	else {
    		System.out.println(this.numerador + "/" + this.denominador);
    	}
    }
    
    public void invertir() {
    	int aux = 0;
    	aux = this.numerador;
    	this.numerador = this.denominador;
    	this.denominador = aux;
    	System.out.println(this.numerador + "/" + this.denominador);
    }
    
    public double aDouble() {
    	double calc = this.numerador / this.denominador;
    	return calc;
    }
    
    public void reducir() {
    	int MCD = mcd(this.numerador, this.denominador);
    	System.out.println(this.numerador / MCD + "/" + this.denominador / MCD);
    }
    
	static int mcd(int a, int b) {
		if (b == 0 ) {
			return a;
		}
		return mcd(b, a % b);
	}
	
	public static Fraccion producto(Fraccion q1, Fraccion q2) {
		Fraccion nuevaFrac = new Fraccion(0,0);
		nuevaFrac.numerador = q1.numerador * q2.numerador;
		nuevaFrac.denominador = q1.denominador * q2.denominador;
		int MCD = mcd(nuevaFrac.numerador, nuevaFrac.denominador);
		nuevaFrac.numerador = nuevaFrac.numerador / MCD;
		nuevaFrac.denominador = nuevaFrac.denominador / MCD;
		return nuevaFrac;
	}
	
	public static Fraccion suma(Fraccion q1, Fraccion q2) {
		Fraccion nuevaFrac = new Fraccion(0,0);		
		nuevaFrac.denominador = q1.denominador * q2.denominador;
		nuevaFrac.numerador = (nuevaFrac.denominador / q1.denominador * q1.numerador) + (nuevaFrac.denominador / q2.denominador * q2.numerador);
		int MCD = mcd(nuevaFrac.numerador, nuevaFrac.denominador);
		nuevaFrac.numerador = nuevaFrac.numerador / MCD;
		nuevaFrac.denominador = nuevaFrac.denominador / MCD;
		return nuevaFrac;
	}
}


