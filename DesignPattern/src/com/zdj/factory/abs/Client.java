package com.zdj.factory.abs;

public class Client {
	public static void main(String[] args) {
		Factory1 factory1 = new Factory1();
		factory1.produceProductA().doSomething();
		factory1.produceProductB().doSomething();
		
		Factory2 factory2 = new Factory2();
		factory2.produceProductA().doSomething();
		factory2.produceProductB().doSomething();
	}
}
