package programacion_1;
// 4. boolean estaDentro(Point p, Rectangle r)
// El método debe indicar si el punto p está dentro del rectángulo dado.

import java.awt.*;

public class Point_Recatangle_4 {
	public static void main(String[] args) {
		Point p = new Point(); // insert valores de prueba.
		Rectangle r = new Rectangle(); // insert valores de prueba.
		System.out.println(estaDentro(p, r));
	
	}
	public static boolean estaDentro(Point p, Rectangle r) {
		return p.x >= r.x &&
				p.x <= r.x + r.width &&
				p.y >= r.y &&
				p.y <= r.y + r.height;
	}
	
}
