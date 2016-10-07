package com.proyect.perceptron.domain;

public class WeightFactory {
	
	private static WeightFactory unique;
	
	private WeightFactory() {
	}
	
	public static WeightFactory getInstance(){
		if(unique == null){
			synchronized (WeightFactory.class) {
				if(unique == null){
					unique = new WeightFactory();
				}
			}
		}
		return unique;
	}
	
	public static IWeightContainer getWeightContainer(){
		return Weight.getInstance();
	}

}
