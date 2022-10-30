package com.zdj.factory.simple;


public interface Product {
	
	
	public static final String TYPE_A = "A";
	public static final String TYPE_B = "B";
	public static final String TYPE_C = "C";
	
	
	void doSomething();
	
	
	public static Product createSubProductByType(String type){
		Product product = null;
		switch (type) {
		case TYPE_A:
			product = new ProductA();
			break;
		case TYPE_B:
			product = new ProductB();
			break;
		case TYPE_C:
			product = new ProductC();
			break;
		}
		return product;
	}
}
