package com.before.implementing.example;

public class Context {

	public String executeBuyStrategy(String market, int quantity, int price) {
		if (market.equalsIgnoreCase("BSE")) {
			// Assume there is some BSE specific logic, that all will comes here for buy call
			System.out.println("BSE Buy Call, Quantity: " + quantity + ", price: " + price);
			return "Success";
		} else if (market.equalsIgnoreCase("NSE")) {
			// Assume there is some NSE specific logic, that all will comes here for buy call
			System.out.println("NSE Buy Call, Quantity: " + quantity + ", price: " + price);
			return "Success";
		} else
			throw new RuntimeException("Provide a proper Stock Exchange");

	}

	public String executeSellStrategy(String market, int quantity, int price) {
		if (market.equalsIgnoreCase("BSE")) {
			// Assume there is some BSE specific logic, that all will comes here for sell call
			System.out.println("BSE Sell Call, Quantity: " + quantity + ", price: " + price);
			return "Success";
		} else if (market.equalsIgnoreCase("NSE")) {
			// Assume there is some BSE specific logic, that all will comes here for sell call
			System.out.println("BSE Sell Call, Quantity: " + quantity + ", price: " + price);
			return "Success";
		} else
			throw new RuntimeException("Provide a proper Stock Exchange");
	}
	// Imagine now if you have a application that allows you to trade in international stock markets, how big this class will become
	// and how difficult it will become to manage changes in this call then.
}
