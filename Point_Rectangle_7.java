//7. boolean estaContenido(Rectangle r1, Rectangle r2)
// El método debe indicar si el rectangulo r1 está contenido completamente dentro del rectángulo r2.
package practica_0;

import java.awt.*;

public class Point_Rectangle_7 {
	public static void main(String[] args) {
		Rectangle rect1 = new Rectangle(0,90,45,45);
		Rectangle rect2 = new Rectangle(150,300,60,190);
		System.out.println(estaContenido(rect1, rect2));
		//System.out.println(rect1.x + " " + rect1.y + " " + rect2.x + " " + rect2.y);
	}
	static boolean estaContenido(Rectangle r1, Rectangle r2) {
		int areaRect_2 = r2.width * r2.height;
		int areaRect_1 = r1.width * r2.height;
		if (areaRect_1 <= areaRect_2) {
			return true;
		}
		else {
			return false;
		}
		
	}
}
