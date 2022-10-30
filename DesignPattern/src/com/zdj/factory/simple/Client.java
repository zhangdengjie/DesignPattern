package com.zdj.factory.simple;

public class Client {
	public static void main(String[] args) {
		Product productA = Product.createSubProductByType(Product.TYPE_A);
		productA.doSomething();
		
		Product productB = Product.createSubProductByType(Product.TYPE_B);
		productB.doSomething();
		
		Product productC = Product.createSubProductByType(Product.TYPE_C);
		productC.doSomething();
	}
}
