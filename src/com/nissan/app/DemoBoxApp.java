package com.nissan.app;

import java.util.Scanner;

import com.nissan.bean.Box;


public class DemoBoxApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		//Entering width
		System.out.println("Enter width : ");
		int width1 = Integer.parseInt(input.nextLine());
		
		//Entering Height
		System.out.println("Enter height : ");
		int height1 = Integer.parseInt(input.nextLine());
		
		//Enter depth
		System.out.println("Enter depth : ");
		int depth1 = Integer.parseInt(input.nextLine());
		
		
		//creating object
		Box box1 = new Box(width1, height1, depth1);
		
		//calling and printing the result of volume function
		box1.volume();
	
		System.out.println("Enter width : ");
		int width2 = Integer.parseInt(input.nextLine());
		
		System.out.println("Enter height : ");
		int height2 = Integer.parseInt(input.nextLine());
		
		System.out.println("Enter depth : ");
		int depth2 = Integer.parseInt(input.nextLine());
		
		//Creating second object
		Box box2 = new Box(width2, height2, depth2);
		box2.volume();
			
	}

}
