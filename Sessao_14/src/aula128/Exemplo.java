package aula128;

public class Exemplo {

	public static void main(String[] args) {

//		Account acc1 = new Account(1001, "Alex", 1000.0); Acontecerá um erro!
		Account acc2 = new SavingsAccount(1002, "Maria", 1000.0, 0.01);
		Account acc3 = new BusinessAccount(1003, "Bob", 1000.0, 500.0);

	}

}
