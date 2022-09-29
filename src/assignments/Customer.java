package assignments;

public class Customer {
	String customerName;
	long accNum;
	static double balance = 500;
	
	public static void withdraw(double amount) throws InsufficientBalance {
		if(amount > balance) {
			throw new InsufficientBalance();
		}else {
			balance = balance - amount;
		}
	}
	
}
