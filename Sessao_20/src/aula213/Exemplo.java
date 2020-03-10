package aula213;

import java.util.ArrayList;
import java.util.List;

public class Exemplo {

	public static void main(String[] args) {
		
		List<Product> list = new ArrayList<>();
		
		list.add(new Product("Tv", 900.00));
		list.add(new Product("Mouse", 50.00));
		list.add(new Product("Tablet", 350.50));
		list.add(new Product("HD Case", 80.90));
		
//		list.removeIf(Product::staticProductPredicate);
//		list.removeIf(Product::nonStaticProductPredicate);
		
//		Predicate<Product> pred = p -> p.getPrice() >= 100.0;
		list.removeIf(p -> p.getPrice() >= 100.0);
		
		for (Product p : list) {
			System.out.println(p);
		}
	}
	
}
