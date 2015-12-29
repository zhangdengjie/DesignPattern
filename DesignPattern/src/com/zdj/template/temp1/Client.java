package com.zdj.template.temp1;

public class Client {
	public static void main(String[] args) {
		AbstractTemplate a = new ConcretClassA() ;
		AbstractTemplate b = new ConcretClassB() ;
		a.functionA();
		b.functionA();
	}
}
