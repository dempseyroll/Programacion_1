package programacion_1;
// 1. double distancia(Point p1, Point p2)
// El método debe devolver la distancia entre los puntos dados.

import java.awt.*;

public class Point_Rectangle_1 {
public static void main(String[] args) {
	Rectangle r = new Rectangle(40,50,20,20); // valores para jugar con el programa.
	System.out.println("La distancia entre P y Q es " + diagonal(r));
	}

public static double distancia(Point p1, Point p2){
	int dx = p1.x - p2.x;
	int dy = p1.y - p2.y;
	return Math.sqrt(dx * dx + dy * dy);
	}

public static double diagonal(Rectangle r){
	Point P= new Point(r.x,r.y);
	Point Q= new Point(r.x+r.width, r.y + r.height);
	return distancia(P,Q);
	}
}
