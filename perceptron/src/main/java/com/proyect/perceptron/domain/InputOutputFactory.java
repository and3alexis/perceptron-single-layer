package com.proyect.perceptron.domain;

import java.util.ArrayList;
import java.util.List;

public class InputOutputFactory {
	
	private static InputOutputFactory unique;
	
	private InputOutputFactory() {
	}
	
	public static InputOutputFactory getInstance(){
		if(unique == null){
			synchronized (InputOutputFactory.class) {
				if(unique == null){
					unique = new InputOutputFactory();
				}
			}
		}
		return unique;
	}
	
	public List<Input> getInputs(double[] inputValues){
		List<Input> inputList = new ArrayList<Input>();
		for (int i = 0; i < inputValues.length; i++) {
			insertInputsToList(i, inputValues[i], inputList);
		}
		return inputList;
	}
	
	private void insertInputsToList(int index, double value, List<Input> inputList){
		inputList.add(new Input(index, value));
	}
	
	public Output getOutput(int index, double outputValue){
		return new Output(index, outputValue);
	}

}
