package assignments;

public class UserDefinedException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Customer customer1 = new Customer();
		try {
			customer1.withdraw(788);
		} 
		
		catch (InsufficientBalance isb) {
			// TODO Auto-generated catch block
			System.out.println("Insuffient balance");
		}
		
		catch(Exception Ex) {
			System.out.println("Message " + Ex);
		}
	}

}
