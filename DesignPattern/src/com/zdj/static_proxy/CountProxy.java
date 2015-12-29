package com.zdj.static_proxy;

/**
 * All Right Reserved, Copyright (C) 2015, dengjie, Ltd.<br/>
 * 这是一个代理类（增强CountImpl实现类）
 * 
 * @author dengjie created at 2015年12月29日 下午3:53:34
 */
public class CountProxy implements Count {
	
	private Count count;

	/**
	 * 覆盖默认构造器
	 * 
	 * @param countImpl
	 */
	public CountProxy(Count count) {
		this.count = count;
	}

	@Override
	public void queryCount() {
		System.out.println("事务处理之前");
		// 调用委托类的方法;
		count.queryCount();
		System.out.println("事务处理之后");
	}

	@Override
	public void updateCount() {
		System.out.println("事务处理之前");
		// 调用委托类的方法;
		count.updateCount();
		System.out.println("事务处理之后");

	}

}
