package com.zdj.bridge;

public class Client {
	public static void main(String[] args) {
		// 定义一个实现化具体角色实例
		Implementor implementor = new ConcreteImplementor1();
		// 定义一个抽象化具体角色实例
		Abstraction abstraction = new RefinedAbstraction(implementor);
		abstraction.request();
	}
}
