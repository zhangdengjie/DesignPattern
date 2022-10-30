package com.zdj.decorator;

public class ConcreteDecorator2 extends Decorator{

	public ConcreteDecorator2(Component mComponent) {
		super(mComponent);
	}

	private void method2(){
		System.out.println("ConcreteDecorator1 的修饰方法 method2");
	}
	
	@Override
	public void operate() {
		method2();
		super.operate();
	}
}
