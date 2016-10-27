package com.proyect.perceptron.manage.perceptron.core;

import java.util.List;

import com.proyect.perceptron.domain.Input;
import com.proyect.perceptron.domain.Output;
import com.proyect.perceptron.domain.Row;
import com.proyect.perceptron.manage.comparable.ComparableFormulaFactory;
import com.proyect.perceptron.manage.comparable.ComparableFormulaStrategy;
import com.proyect.perceptron.manage.weight.recalculator.WeightRecalculatorFactory;
import com.proyect.perceptron.manage.weight.recalculator.IWeightRecalculatorStrategy;
import com.proyect.perceptron.manage.weight.update.UpdateFactory;
import com.proyect.perceptron.manage.weight.update.IUpdateStrategy;
import com.proyect.perceptron.manage.yifunction.YIFunctionFactory;
import com.proyect.perceptron.manage.yifunction.YIFunctionStrategy;

class PerceptronCore implements ITraining{
	
	private YIFunctionStrategy yiFunctionStrategy = YIFunctionFactory.getInstance().getYIFunctionStrategy();
	private ComparableFormulaStrategy comparableFormulaStrategy = ComparableFormulaFactory.getInstance().getComparableFormulaStrategy();
	private IWeightRecalculatorStrategy weightRecalculatorStrategy = WeightRecalculatorFactory.getInstance().getASADStrategy();
	private IUpdateStrategy iUpdateStrategy = UpdateFactory.getInstance().getIUpdateStrategy();

	public boolean learning(Row row){
		double neuronOutput = getHardLimit(row);
		return isCorrectOutput(neuronOutput, row);
	}
	
	private double getHardLimit(Row row){
		return this.yiFunctionStrategy.calculate(row);
	}
	
	private boolean isCorrectOutput(double neuronOutput, Row row){
		if(!this.comparableFormulaStrategy.calculate(neuronOutput, row.getOutput().getValue())){
			List<Input> inputList = row.getInputList();
			updateWeights(inputList, neuronOutput, row.getOutput());
			return false;
		}
		return true;
	}
	
	private void updateWeights(List<Input> inputList, double neuronOutput, Output output){
		if(inputList != null && !inputList.isEmpty()){
			for (Input input : inputList) {
				double weight = this.weightRecalculatorStrategy.calculate(input, neuronOutput, output);
				this.iUpdateStrategy.eject(input.getPostion(), weight);
			}
		}
	}

}
