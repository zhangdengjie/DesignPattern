package com.zdj.flyweight;

import com.zdj.flyweight.advanced.ConcreteFlyweight1;
import com.zdj.flyweight.advanced.FlyWeight;
import com.zdj.flyweight.advanced.FlyWeightFactory;

/**
 * All Right Reserved, Copyright (C) 2015, Administrator, Ltd.<br/>
 * 
 * @author Administrator created at 2016年4月5日 下午1:24:24
 */
public class Client {
	FlyweightFactory factory = new FlyweightFactory();
	Flyweight fly1;
	Flyweight fly2;
	Flyweight fly3;
	Flyweight fly4;
	Flyweight fly5;
	Flyweight fly6;

	/** Creates a new instance of Client */
	public Client() {
		fly1 = factory.getFlyWeight("Google");
		fly2 = factory.getFlyWeight("Qutr");
		fly3 = factory.getFlyWeight("Google");
		fly4 = factory.getFlyWeight("Google");
		fly5 = factory.getFlyWeight("Google");
		fly6 = factory.getFlyWeight("Google");
	}

	public void showFlyweight() {
		fly1.operation();
		fly2.operation();
		fly3.operation();
		fly4.operation();
		fly5.operation();
		fly6.operation();
		int objSize = factory.getFlyweightSize();
		System.out.println("objSize = " + objSize);
	}

	public static void main(String[] args) {
		/**
		 * 我们定义了6个对象，其中有5个是相同的，按照Flyweight模式的定义“Google”应该共享一个对象，在实际的对象数中我们可以看出实际的对象却是只有2个
		 */
		System.out.println("The FlyWeight Pattern!");
		Client fp = new Client();
		fp.showFlyweight();
	}
}
