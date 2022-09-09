package practica_0;
//5. Point puntoMedio(Point p1, Point p2)
// El método devuelve un nuevo punto, que se encuentra en el medio del segmento que une  a p1 con p2.
// Matemáticamente, este punto tiene como coordenada x el promedio de las coordenadas x de los dos puntos y
// lo mismo para la coordenada y.

import java.awt.*;

public class Point_Rectangle_5 {
	public static void main(String[] args) {
		Point punto_1;
		Point punto_2;
		punto_1 = new Point(-30,8); // valores de prueba.
		punto_2 = new Point(25,2); // valores de prueba.
		System.out.println(puntoMedio(punto_1, punto_2));
	}
	static Point puntoMedio(Point p1, Point p2) {
		int coord_x = (p1.x + p2.x) / 2;
		int coord_y = (p1.y + p2.y) / 2;
		Point pMedio = new Point(coord_x, coord_y);
		return pMedio;
	}
}
