package aula129;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exemplo {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		List<Shape> list = new ArrayList<>();
		
		System.out.println("Enter the number of shapes: ");
		int n = sc.nextInt();
		
		for(int i = 1; i < n; i++) {
			System.out.println("Shape # " + i + " data:");
			System.out.println("Rectangule or Circle? (R/C)");
			char ch = sc.next().charAt(0);
			System.out.println("Color? (Black, Blue or Red?): ");
			Color color = Color.valueOf(sc.next());
			if(ch == 'R') {
				System.out.println("Width: ");
				double width = sc.nextDouble();
				System.out.println("Height: ");
				double height = sc.nextDouble();
				list.add(new Rectangule(color, width, height));
			}
			else {
				System.out.println("Radius: ");
				double radius = sc.nextDouble();
				list.add(new Circle(color, radius));
			}
		}
		
		System.out.println();
		System.out.println("SHAPE AREAS: ");
		for( Shape shape: list) {
			System.out.println(String.format("%.2f", shape.area()));
		}
		sc.close();

	}

}
