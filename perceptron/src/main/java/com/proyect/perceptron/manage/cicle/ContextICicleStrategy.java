package com.proyect.perceptron.manage.cicle;

import java.util.List;

import com.proyect.perceptron.domain.Row;

public class ContextICicleStrategy implements ICicleStrategy{
	
	private ICicle strategy;

	public ContextICicleStrategy(ICicle strategy) {
		this.strategy = strategy;
	}

	public boolean calculate(List<Row> rowList) {
		return strategy.calculate(rowList);
	}

}
