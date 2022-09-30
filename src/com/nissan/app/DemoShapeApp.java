package com.nissan.app;

import com.nissan.bean.Shapes;
import com.nissan.bean.Square;

public class DemoShapeApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shapes shapeOne = new Shapes();
		
		Square squareArea = new Square(10);
		System.out.println("Area is : " + squareArea);	
	}

}
