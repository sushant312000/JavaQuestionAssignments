package com.nissan.bean;

public class Items {
	//Instance variable
	private int itemId;
	private String itemName;
	private String itemType;
	private int itemQuantity;
	
	//Default constructor
	public Items() {
		super();
		
	}

	//Parameterized constructor
//	public Items(int id, String name, String type, int quantity) {
//		this.itemId = id;
//		this.itemName = name;
//		this.itemType = type;
//		this.itemQuantity = quantity;
//	}
//	
	public int getItemId() {
		return itemId;
	}


	public void setItemId(int itemId) {
		this.itemId = itemId;
	}


	public String getItemName() {
		return itemName;
	}


	public void setItemName(String itemName) {
		this.itemName = itemName;
	}


	public String getItemType() {
		return itemType;
	}


	public void setItemType(String itemType) {
		this.itemType = itemType;
	}


	public int getItemQuantity() {
		return itemQuantity;
	}


	public void setItemQuantity(int itemQuantity) {
		this.itemQuantity = itemQuantity;
	}
	
	//Show report 
	public void showReport() {
		System.out.println("Item ID is " + getItemId());
		System.out.println("Item name is " + getItemName() );
		System.out.println("Item type is " + getItemType());
		System.out.println("Item quantity is " + getItemQuantity());
	}

	@Override
	public String toString() {
		return "Items [itemId=" + itemId + ", itemName=" + itemName + ", itemType=" + itemType + ", itemQuantity="
				+ itemQuantity + "]";
	}
	
}
