package com.after.implementing.example;

//Strategy Design Pattern comes under the category of behavioral design patterns  
public class Client {

	public static void main(String[] args) {

		Context context = new Context();
		int quantity = 10;
		int price = 10;

		String market = "BSE";
		String action = "Buy";
		String result = "";

		if (market.equalsIgnoreCase("NSE")) 
			context.setStrategy(new NSE());
		 else if (market.equalsIgnoreCase("BSE")) 
			context.setStrategy(new BSE());
		 else 
			throw new RuntimeException("Provide valid stock Exchange name");
		

		if (action.equalsIgnoreCase("Buy"))
			result = context.executeBuyStrategy(quantity, price);
		else if(action.equalsIgnoreCase("Sell"))
			result = context.executeSellStrategy(quantity, price);
		else
			throw new RuntimeException("Provide valid action type");

	}

}
