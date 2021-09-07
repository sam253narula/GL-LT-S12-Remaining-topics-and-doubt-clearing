package com.after.implementing.example;

public class BSE implements Strategy {

	@Override
	public String executeBuy(int quantity, int price) {
		System.out.println("BSE Buy Call, Quantity: " + quantity + ", price: " + price);
		return "Success";
	}

	@Override
	public String executeSell(int quantity, int price) {
		System.out.println("BSE Sell Call, Quantity: " + quantity + ", price: " + price);
		return "Success";
	}

}
