package com.proyect.perceptron.manage.yifunction;

import java.util.Iterator;
import java.util.List;

import com.proyect.perceptron.domain.IWeightContainer;
import com.proyect.perceptron.domain.Input;
import com.proyect.perceptron.domain.Row;
import com.proyect.perceptron.domain.Umbral;
import com.proyect.perceptron.domain.WeightFactory;

public class PropagationFunction implements YIFunction{
	
	private IWeightContainer weightContainer = WeightFactory.getWeightContainer();
	
	public double calculate(Row row) {
		double result = 0d;
		List<Input> inputList = row.getInputList();
		if(inputList != null && !inputList.isEmpty()){
			result = addAllWeightMultiplyInput(inputList);
			result = result - multiplyUmbralAndWeight(row.getUmbral());
		}
		return result >= 0 ? 1 : -1;
	}
	
	private double addAllWeightMultiplyInput(List<Input> inputList){
		double result = 0d;
		for (Iterator<Input> iterator = inputList.iterator(); iterator.hasNext();) {
			Input input = (Input) iterator.next();
			Double weight = weightContainer.getValue(input.getPostion());
			result += multiplyInputAndWeight(weight, input.getValue());
		}
		return result;
	}
	
	private double multiplyInputAndWeight(double weight, double input){
		return input * weight;
	}
	
	private double multiplyUmbralAndWeight(Umbral umbral){
		Double weight = weightContainer.getValue(umbral.getPostion());
		return multiplyUmbralAndWeight(weight, umbral.getValue());
	}
	
	private double multiplyUmbralAndWeight(double weight, double umbralValue){
		return umbralValue * weight;
	}
	
}
