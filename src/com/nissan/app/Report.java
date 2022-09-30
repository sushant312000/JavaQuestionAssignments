package com.nissan.app;

import java.util.Scanner;

import com.nissan.bean.Items;

public class Report {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//creating input variable
		Scanner input = new Scanner(System.in);
		
		//Asking for item id
		
		System.out.println("Enter item Id ");
		int id = Integer.parseInt(input.nextLine());
		
//		input.nextLine();
		System.out.println("Enter item name ");
		String name = input.nextLine();
		
		System.out.println("Enter item type ");
		String type = input.nextLine();
		
		System.out.println("Enter Quantity in Stock ");
		int quantity = Integer.parseInt(input.nextLine());
		
		//creating an object of item class
		Items item1 = new Items();
		item1.setItemId(id);
		item1.setItemName(name);
		item1.setItemType(type);
		item1.setItemQuantity(quantity);
		item1.showReport();
	}

}
