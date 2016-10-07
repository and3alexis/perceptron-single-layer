package com.proyect.perceptron.domain;

public class Umbral {
	
	private int postion;
	private double value;
	
	public Umbral(int postion, double value) {
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
