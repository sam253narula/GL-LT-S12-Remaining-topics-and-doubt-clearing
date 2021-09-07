package com.after.implementing.example;

public class NSE implements Strategy {

	@Override
	public String executeBuy(int quantity, int price) {
		System.out.println("NSE Buy Call, Quantity: " + quantity + ", price: " + price);
		return "Success";
	}

	@Override
	public String executeSell(int quantity, int price) {
		System.out.println("NSE Sell Call, Quantity: " + quantity + ", price: " + price);
		return "Success";
	}

}
