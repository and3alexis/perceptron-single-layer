package com.proyect.perceptron.manage.comparable;

public class ComparableFormulaFactory {
	
	private static ComparableFormulaFactory unique;
	
	private ComparableFormulaFactory() {
	}
	
	public static ComparableFormulaFactory getInstance(){
		if(unique == null){
			synchronized (ComparableFormulaFactory.class) {
				if(unique == null){
					unique = new ComparableFormulaFactory();
				}
			}
		}
		return unique;
	}
	
	public ComparableFormulaStrategy getComparableFormulaStrategy(){
		return new ContexComparableFormulaStrategy(new ComparableFormulaImpl());
	}

}
