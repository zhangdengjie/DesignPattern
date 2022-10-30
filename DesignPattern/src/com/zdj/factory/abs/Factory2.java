package com.zdj.factory.abs;

public class Factory2 extends Factory{

	@Override
	protected ProductA produceProductA() {
		return new ProductA2();
	}

	@Override
	protected ProductB produceProductB() {
		return new ProductB2();
	}

}
