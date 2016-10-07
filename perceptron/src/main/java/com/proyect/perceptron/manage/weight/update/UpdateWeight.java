package com.proyect.perceptron.manage.weight.update;

import com.proyect.perceptron.domain.IWeightContainer;
import com.proyect.perceptron.domain.WeightFactory;

class UpdateWeight implements IUpdate{
	
	private IWeightContainer weightContainer = WeightFactory.getWeightContainer();
	
	public void eject(int index, double newWeight) {
		setWeight(index, newWeight);
	}
	
	private void setWeight(int index, double newWeight){
		weightContainer.setValue(index, newWeight);
	}
	
}
