package com.proyect.perceptron.domain;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ThreadLocalRandom;

class Weight implements IWeightContainer{
	
	private static Weight unique = null;
	private Map<Integer, Double> valueMap = new ConcurrentHashMap<Integer, Double>();

	private Weight() {
		
	}
	
	public static Weight getInstance(){
		if(unique == null){
			synchronized (Weight.class) {
				if(unique == null){
					unique =  new Weight();
				}
			}
		}
		return unique;
	}
	
	public double getValue(int index){
		synchronized (Weight.class) {
			if(valueMap.get(index) == null){
				valueMap.put(index, ThreadLocalRandom.current().nextDouble(0d, 1.1d));
			}
			return valueMap.get(index);
		}
	}
	
	public void setValue(int index, double value){
		valueMap.put(index, ThreadLocalRandom.current().nextDouble(0d, 1.1d));
	}

	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Weight [");
		if (valueMap != null) {
			builder.append(" valueMap= ");
			builder.append(valueMap);
		}
		builder.append(" ]");
		return builder.toString();
	}
	
	

}
