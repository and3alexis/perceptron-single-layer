package com.proyect.perceptron.manage.perceptron.core;

import com.proyect.perceptron.domain.Row;

public interface ITrainingStrategy {
	
	boolean learning(Row row);

}
