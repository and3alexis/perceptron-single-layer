package com.proyect.perceptron.manage.weight.recalculator;

public class WeightRecalculatorFactory {
	
	private static WeightRecalculatorFactory unique;
	
	private WeightRecalculatorFactory() {
	}
	
	public static WeightRecalculatorFactory getInstance(){
		if(unique == null){
			synchronized (WeightRecalculatorFactory.class) {
				if(unique == null){
					unique = new WeightRecalculatorFactory();
				}
			}
		}
		return unique;
	}
	
	public IWeightRecalculatorStrategy getASADStrategy(){
		return new ContextIWeightRecalculatorStrategy(new WeightRecalculatorImpl());
	}

}
