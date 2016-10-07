package com.proyect.perceptron.manage.yifunction;

public class YIFunctionFactory {
	
	private static YIFunctionFactory unique;
	
	private YIFunctionFactory() {
	}
	
	public static YIFunctionFactory getInstance(){
		if(unique == null){
			synchronized (YIFunctionFactory.class) {
				if(unique == null){
					unique = new YIFunctionFactory();
				}
			}
		}
		return unique;
	}
	
	public YIFunctionStrategy getYIFunctionStrategy(){
		return new ContextYIFunctionStrategy(new PropagationFunction());
	}

}
