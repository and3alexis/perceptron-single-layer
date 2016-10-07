package com.proyect.perceptron.domain;

import java.util.ArrayList;
import java.util.List;

import com.proyect.perceptron.manage.Constants;

public class RowFactory {
	
	private static RowFactory unique;
	private InputOutputFactory inputOutputFactory = InputOutputFactory.getInstance();
	
	private RowFactory(){
		
	}
	
	public static RowFactory getInstance(){
		if(unique == null){
			synchronized (RowFactory.class) {
				if(unique == null){
					unique = new RowFactory();
				}
			}
		}
		return unique;
	}
	
	public List<Row> getRowList(double[][] inputs, double[] outputs){
		List<Row> rowList = new ArrayList<Row>(); 
		for (int i = 0; i < outputs.length; i++) {
			rowList.add(createRow(i, inputs[i], outputs[i]));
		}
		return rowList;
	}
	
	private Row createRow(int index, double[] inputs, double outputValue){
		List<Input> inputsList = getInputs(inputs);
		Output output = createOutput(index, outputValue);
		Umbral umbral = createUmbral(inputs.length);
		return createRow(inputsList, output, umbral);
	}
	
	private Row createRow(List<Input> inputsList, Output output, Umbral umbral){
		return new Row(inputsList, output, umbral);
	}
	
	private List<Input> getInputs(double[] input){
		return inputOutputFactory.getInputs(input);
	}
	
	private Output createOutput(int index, double value){
		return inputOutputFactory.getOutput(index, value);
	}
	
	private Umbral createUmbral(int index){
		Umbral umbral = new Umbral(index, Constants.UMBRAL_VALUE);
		return umbral;
	}

}
