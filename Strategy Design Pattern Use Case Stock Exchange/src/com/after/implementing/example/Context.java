package com.after.implementing.example;

public class Context {
	// Responsibility of choosing the correct strategy is of the client class
	private Strategy strategy;

	/*
	 * Usually the context accepts a strategy through the constructor, and also
	 * provides a setter so that the strategy can be switched at runtime.
	 */
	public void setStrategy(Strategy strategy) {
		this.strategy = strategy;
	}

	/*
	 * The context delegates some work to the strategy object instead of
	 * implementing multiple versions of the algorithm on its own.
	 */
	public String executeBuyStrategy(int quantity, int price) {
		return strategy.executeBuy(quantity, price);
	}
	
	public String executeSellStrategy(int quantity, int price) {
		return strategy.executeSell(quantity, price);
	}
}
