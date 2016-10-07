package com.proyect.perceptron.manage;

import java.util.List;

import com.proyect.perceptron.domain.Row;
import com.proyect.perceptron.manage.cicle.CicleFactory;
import com.proyect.perceptron.manage.cicle.ICicleStrategy;

public class Perceptron {
	
	private ICicleStrategy cicleStrategy = CicleFactory.getInstance().getICicleStrategy();
	
	public void calculate(List<Row> rowList){
		boolean sw = false;
        do {
        	sw = cicleStrategy.calculate(rowList);
		} while (!sw);
	}

}
