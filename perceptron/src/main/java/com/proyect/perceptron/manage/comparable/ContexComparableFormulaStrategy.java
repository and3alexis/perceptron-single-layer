package com.proyect.perceptron.manage.comparable;

public class ContexComparableFormulaStrategy implements ComparableFormulaStrategy{
	
	private ComparableFormula strategy;
	
	public ContexComparableFormulaStrategy(ComparableFormula strategy) {
		this.strategy = strategy;
	}

	public boolean calculate(double neuronResult, double realOutput) {
		return strategy.calculate(neuronResult, realOutput);
	}

}
