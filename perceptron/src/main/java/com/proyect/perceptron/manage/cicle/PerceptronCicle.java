package com.proyect.perceptron.manage.cicle;

import java.util.List;

import com.proyect.perceptron.domain.Row;
import com.proyect.perceptron.manage.perceptron.core.TrainingFactory;
import com.proyect.perceptron.manage.perceptron.core.ITrainingStrategy;

class PerceptronCicle implements ICicle{
	
	private ITrainingStrategy perceptronCore = TrainingFactory.getInstance().getITrainingStrategy();
	
	public boolean calculate(List<Row> rowList){
		if(rowList != null && !rowList.isEmpty()){
			for (Row row : rowList) {
				if(!perceptronCore.learning(row)){
					return false;
				}
			}
		}
		return true;
	}

}
