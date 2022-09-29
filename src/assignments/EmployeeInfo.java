package assignments;

import java.util.Scanner;

public class EmployeeInfo {

	public static void main(String[] args) throws Exception{
			Scanner input = new Scanner(System.in);
			
			System.out.println("Enter name : ");	
			String name = input.nextLine();
		
			System.out.println("Enter ID : ");
			int id = input.nextInt();
			
			System.out.println("Enter age : ");
			int age = input.nextInt();
			
			if(age < 18 || age > 60) {
				throw new Exception("Enter the age between 18 to 60");
			}
		}		
}
