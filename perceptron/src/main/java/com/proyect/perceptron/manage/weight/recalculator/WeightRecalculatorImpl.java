package com.proyect.perceptron.manage.weight.recalculator;

import com.proyect.perceptron.domain.IWeightContainer;
import com.proyect.perceptron.domain.Input;
import com.proyect.perceptron.domain.Output;
import com.proyect.perceptron.domain.WeightFactory;
import com.proyect.perceptron.manage.Constants;

class WeightRecalculatorImpl implements IWeightRecalculator {
	
	private IWeightContainer weightContainer = WeightFactory.getWeightContainer();
	
	public double calculate(Input input, double neuronOutput, Output output) {
		return getNewWeight(input, neuronOutput, output);
	}
	
	private double getNewWeight(Input input, double neuronOutput, Output output){
		double weight = getCurrentWeight(input.getPostion());
		weight = weight + Constants.LEARNING_RANGE *  (output.getValue() - neuronOutput) * input.getValue();
		return weight;
	}
	
	private double getCurrentWeight(int index){
		return weightContainer.getValue(index);
	}
	
}
