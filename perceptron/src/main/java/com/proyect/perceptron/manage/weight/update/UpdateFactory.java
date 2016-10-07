package com.proyect.perceptron.manage.weight.update;

public class UpdateFactory {
	
	private static UpdateFactory unique;
	
	private UpdateFactory() {
	}
	
	public static UpdateFactory getInstance(){
		if(unique == null){
			synchronized (UpdateFactory.class) {
				if(unique == null){
					unique = new UpdateFactory();
				}
			}
		}
		return unique;
	}
	
	public IUpdateStrategy getIUpdateStrategy(){
		return new ContextIUpdateStrategy(new UpdateWeight());
	}

}
