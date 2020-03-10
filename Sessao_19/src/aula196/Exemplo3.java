package aula196;

import java.util.Scanner;

public class Exemplo3 {
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		PrintService3<Integer> ps = new PrintService3<>();

		System.out.print("How many values? ");
		int n = sc.nextInt();

		for (int i = 0; i < n; i++) {
			int value = sc.nextInt();
			ps.addValue(value);
		}

		ps.print();
		Integer x = (Integer)ps.first();
		System.out.println("First: " + x);

		sc.close();
	}
}
