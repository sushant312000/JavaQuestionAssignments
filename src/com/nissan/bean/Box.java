package com.nissan.bean;

public class Box {
	//instance variables
	int width;
	int height;
	int depth;
	
	//default constructor
	public Box(int width, int height, int depth) {
		this.width = width;
		this.height = height;
		this.depth = depth;
	}
		
	//volume method
	public void volume() {
		int result = this.width * this.height * this.depth;
		System.out.println(result);
	}
	
	
}
