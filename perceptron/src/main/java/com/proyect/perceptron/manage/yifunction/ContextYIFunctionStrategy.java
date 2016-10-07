package com.proyect.perceptron.manage.yifunction;

import com.proyect.perceptron.domain.Row;

class ContextYIFunctionStrategy implements YIFunctionStrategy{
	
	private YIFunction strategy;
	
	public ContextYIFunctionStrategy(YIFunction strategy) {
		this.strategy = strategy;
	}

	public double calculate(Row row) {
		return strategy.calculate(row);
	}

}
