/**
 * 
 */
package com.proyect.perceptron.domain;

import java.util.List;

public class Row {
	
	private List<Input> inputList;
	private Output output;
	private Umbral umbral;
	
	public Row(List<Input> inputList, Output output, Umbral umbral) {
		this.inputList = inputList;
		this.output = output;
		this.umbral = umbral;
	}

	public List<Input> getInputList() {
		return inputList;
	}

	public Output getOutput() {
		return output;
	}

	public Umbral getUmbral() {
		return umbral;
	}
}
