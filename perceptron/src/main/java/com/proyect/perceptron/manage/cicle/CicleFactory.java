package com.proyect.perceptron.manage.cicle;

public class CicleFactory {
	
	private static CicleFactory unique;
	
	private CicleFactory() {
	}
	
	public static CicleFactory getInstance(){
		if(unique == null){
			synchronized (CicleFactory.class) {
				if(unique == null){
					unique = new CicleFactory();
				}
			}
		}
		return unique;
	}
	
	public ICicleStrategy getICicleStrategy(){
		return new ContextICicleStrategy(new PerceptronCicle());
	}

}
