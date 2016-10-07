package com.proyect.perceptron.manage.perceptron.core;

public class TrainingFactory {
	
	private static TrainingFactory unique;
	
	private TrainingFactory() {
	}
	
	public static TrainingFactory getInstance(){
		if(unique == null){
			synchronized (TrainingFactory.class) {
				if(unique == null){
					unique = new TrainingFactory();
				}
			}
		}
		return unique;
	}
	
	public ITrainingStrategy getITrainingStrategy(){
		return new ContextITrainingStrategy(new PerceptronCore());
	}

}
