package com.proyect.perceptron.manage.weight.update;

class ContextIUpdateStrategy implements IUpdateStrategy{
	
	private IUpdate strategy;

	public ContextIUpdateStrategy(IUpdate strategy) {
		this.strategy = strategy;
	}
	
	public void eject(int index, double newWeight){
		strategy.eject(index, newWeight);
	}

}
