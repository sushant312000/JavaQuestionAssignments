package assignments;

import java.util.Scanner;

public class ArrayExc {

	public static void main(String[] args) {
		try {
			Scanner input = new Scanner(System.in);
			
			int arrSize = 10;
			
			int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
			
			System.out.println(arr[11]);
		}
		catch(ArrayIndexOutOfBoundsException ex) {
			System.out.println("Access array elements under array size");
		}
		// TODO Auto-generated method stub
		

	}

}
