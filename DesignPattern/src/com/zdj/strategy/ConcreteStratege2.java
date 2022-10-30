package com.zdj.strategy;
/**
 * All Right Reserved, Copyright (C) 2015, Administrator, Ltd.<br/>
 * 具体策略模式
 * @author Administrator
 * created at 2016年4月11日  下午4:41:30
 */
public class ConcreteStratege2 extends Strategy {

	protected ConcreteStratege2(String extrinsic) {
		super(extrinsic);
	}

	@Override
	public void operate() {
		System.out.println("ConcreteStratege2对抽象的实现算法");
		
	}

}

