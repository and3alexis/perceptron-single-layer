package com.proyect.perceptron.domain;

public class Input {
	
	private int postion;
	private double value;
	
	public Input(int postion, double value) {
		this.postion = postion;
		this.value = value;
	}

	public int getPostion() {
		return postion;
	}

	public double getValue() {
		return value;
	}

}
