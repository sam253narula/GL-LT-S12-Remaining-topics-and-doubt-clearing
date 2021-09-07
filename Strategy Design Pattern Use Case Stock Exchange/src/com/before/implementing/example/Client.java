package com.before.implementing.example;

//Strategy Design Pattern comes under the category of behavioral design patterns  
public class Client {

	public static void main(String[] args) {

		Context context = new Context();
		int quantity = 10;
		int price = 10;

		String market = "BSE";

		String result = context.executeBuyStrategy(market, quantity, price);

	}

}
