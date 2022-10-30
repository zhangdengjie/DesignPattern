package com.zdj.decorator;

public class ConcreteDecorator1 extends Decorator{

	public ConcreteDecorator1(Component mComponent) {
		super(mComponent);
	}

	/**
	 * 定义自己的修饰方法
	 */
	private void method1(){
		System.out.println("ConcreteDecorator1 的修饰方法 method1");
	}
	
	@Override
	public void operate() {
		method1();
		super.operate();
	}
}
