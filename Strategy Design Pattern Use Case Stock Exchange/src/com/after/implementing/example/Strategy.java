package com.after.implementing.example;

public interface Strategy {

	String executeBuy(int quantity, int price);
	
	String executeSell(int quantity, int price);
}
