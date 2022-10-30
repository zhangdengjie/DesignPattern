package com.zdj.flyweight.advanced;

/**
 * All Right Reserved, Copyright (C) 2015, Administrator, Ltd.<br/>
 * 可共享的具体享元角色 实现抽象角色定义的业务 改角色中需要注意的事内部状态处理应该与环境无关，不允许一个操作改变了内部状态，同时改变了外部状态
 * 
 * @author Administrator created at 2016年4月7日 上午9:33:29
 */
public class ConcreteFlyweight extends FlyWeight {

	protected ConcreteFlyweight(String extrinsic) {
		super(extrinsic);
	}
	
	@Override
	public void operate() {
		System.out.println("享元角色ConcreteFlyweight");
	}

}
