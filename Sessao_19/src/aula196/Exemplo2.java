package aula196;

import java.util.Scanner;

public class Exemplo2 {
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		PrintService2 ps = new PrintService2();

		System.out.print("How many values? ");
		int n = sc.nextInt();

		for (int i = 0; i < n; i++) {
			Integer value = sc.nextInt();
			ps.addValue(value);
		}

		ps.print();
		System.out.println("First: " + ps.first());
		Integer x = (Integer) ps.first();
		System.out.println("First: " + x);

		sc.close();
	}

}
