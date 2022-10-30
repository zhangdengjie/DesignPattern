package com.zdj.factory.abs;

public class Factory1 extends Factory{

	@Override
	protected ProductA produceProductA() {
		return new ProductA1();
	}

	@Override
	protected ProductB produceProductB() {
		return new ProductB1();
	}

}
