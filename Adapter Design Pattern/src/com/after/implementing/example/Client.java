package com.after.implementing.example;

// Adapter Design Pattern comes under the category of Structural Design patterns.
public class Client {

	public static void main(String[] args) {
		System.out.println("Adapter Design Pattern Example ");

		// Created instances of devices
		IPhone iPhone = new IPhone();
		OnePlusPhone onePlusPhone = new OnePlusPhone();
		EarPlug earPlug = new EarPlug();

		// Ear plug is able to take iPhone sound signal
		String soundSignal = iPhone.getSoundOutput();
		earPlug.takeSoundInput(soundSignal);

		// Ear plug is not able to take google phone sound signal
		Integer soundSignals = onePlusPhone.getSoundOutput();

		// Created adapter to convert signals expected by client
		EarPlugAdapter earPlugAdapter = new EarPlugAdapter();
		earPlug.takeSoundInput(earPlugAdapter.convertSoundSignal(soundSignals));

	}
}
