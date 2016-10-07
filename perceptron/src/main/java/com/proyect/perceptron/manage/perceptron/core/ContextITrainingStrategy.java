package com.proyect.perceptron.manage.perceptron.core;

import com.proyect.perceptron.domain.Row;

public class ContextITrainingStrategy implements ITrainingStrategy{

	private ITraining strategy;
	
	public ContextITrainingStrategy(ITraining strategy) {
		this.strategy = strategy;
	}

	public boolean learning(Row row) {
		return strategy.learning(row);
	}

}
