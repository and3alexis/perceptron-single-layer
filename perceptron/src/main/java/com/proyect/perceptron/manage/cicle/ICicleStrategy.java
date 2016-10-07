package com.proyect.perceptron.manage.cicle;

import java.util.List;

import com.proyect.perceptron.domain.Row;

public interface ICicleStrategy {
	
	boolean calculate(List<Row> rowList);

}
