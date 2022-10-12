package practica_0;
//6. Rectangle encuadrar(Rectangle r1, Rectangle r2)
//El método debe devolver el rectángulo más pequeño que contenga a los dos rectángulos dados.

import java.awt.*;

public class Point_Rectangle_6 {
	public static void main(String[] args) {
		Rectangle rect_1;
		Rectangle rect_2;
		rect_1 = new Rectangle(1,48,100,400); // test values
		rect_2 = new Rectangle(20,90,50,150); // test values
		System.out.println(encuadrar(rect_1,rect_2));
	}
	static Rectangle encuadrar(Rectangle r1, Rectangle r2) {
		Point a1 = new Point(r1.x,r1.y);
	    Point b1 = new Point(r1.x + r1.width, r1.y +r1.height);

	    Point a2 = new Point(r2.x,r2.y);
	    Point b2 = new Point(r2.x + r2.width, r2.y +r2.height);
	    
	    //a3 y b3 son los vertices de origen y opuesto del rectangulo resultante
	    Point a3 = new Point(Math.min(a1.x, a2.x), Math.min(a1.y, a2.y));
	    Point b3 = new Point(Math.max(b1.x, b2.x), Math.max(b1.y, b2.y));

	    return new Rectangle(a3.x, a3.y, b3.x - a3.x, b3.y - a3.y);
	}
}
