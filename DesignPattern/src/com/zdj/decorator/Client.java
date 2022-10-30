package com.zdj.decorator;

public class Client {
	public static void main(String[] args) {
		// 生成需要被装饰的组件
		Component component = new ConcreteComponent();
		// 没有修饰 ，则直接使用
		component.operate();
		
		
		// 使用ConcreteDecorator1装饰
		component = new ConcreteDecorator1(component);
		// 使用ConcreteDecorator2装饰
		component = new ConcreteDecorator2(component);
		component.operate();
	}
}
