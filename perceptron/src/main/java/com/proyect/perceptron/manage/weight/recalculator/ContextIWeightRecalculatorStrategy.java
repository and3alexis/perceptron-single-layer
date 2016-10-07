package com.proyect.perceptron.manage.weight.recalculator;

import com.proyect.perceptron.domain.Input;
import com.proyect.perceptron.domain.Output;

public class ContextIWeightRecalculatorStrategy implements IWeightRecalculatorStrategy{
	
	private IWeightRecalculator strategy;
	
	public ContextIWeightRecalculatorStrategy(IWeightRecalculator strategy) {
		this.strategy = strategy;
	}
	
	public double calculate(Input input, double salidaNeurona, Output output){
		return strategy.calculate(input, salidaNeurona, output);
	}

}
