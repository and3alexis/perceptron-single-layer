package com.proyect.perceptron;

import java.util.List;

import com.proyect.perceptron.domain.Row;
import com.proyect.perceptron.domain.RowFactory;
import com.proyect.perceptron.domain.WeightFactory;
import com.proyect.perceptron.manage.Perceptron;

/*
 * Learn OR
 */
public class App 
{
    public static void main( String[] args )
    {
    	double[] output = new double[]{1,1,1,-1};
    	double[][] inputs = new double[][]{
    		{1,1},
    		{-1,1},
    		{1,-1},
    		{-1,-1},
    	};
    	
        RowFactory rowFactory = RowFactory.getInstance();
        List<Row> rowList = rowFactory.getRowList(inputs, output);
        
        Perceptron perceptron = new Perceptron();
        perceptron.calculate(rowList);
        
        System.out.println("END");
        System.out.println(WeightFactory.getWeightContainer());
    }
}
