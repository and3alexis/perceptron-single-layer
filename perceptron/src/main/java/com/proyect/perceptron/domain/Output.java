package com.proyect.perceptron.domain;

public class Output {
	
	private int postion;
	private double value;
	
	public Output(int postion, double value) {
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
