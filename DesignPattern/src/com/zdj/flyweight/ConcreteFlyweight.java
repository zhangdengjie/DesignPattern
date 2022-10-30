package com.zdj.flyweight;

/**
 * All Right Reserved, Copyright (C) 2015, Administrator, Ltd.<br/>
 * 享元模式的具体类
 * 
 * @author Administrator created at 2016年4月5日 下午1:20:36
 */
public class ConcreteFlyweight extends Flyweight {

	private String string;

	public ConcreteFlyweight(String str) {
		string = str;
	}

	@Override
	public void operation() {
		System.out.println("Concrete---Flyweight : " + string);
	}

}
