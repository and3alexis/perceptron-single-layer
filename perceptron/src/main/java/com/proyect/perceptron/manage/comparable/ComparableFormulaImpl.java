package com.proyect.perceptron.manage.comparable;

public class ComparableFormulaImpl implements ComparableFormula{
	
	public boolean calculate(double neuronResult, double realOutput) {
		return neuronResult == realOutput;
	}

}
