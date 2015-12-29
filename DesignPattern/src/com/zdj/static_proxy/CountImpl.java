package com.zdj.static_proxy;

/**
 * All Right Reserved, Copyright (C) 2015, dengjie, Ltd.<br/>
 * 委托类(包含业务逻辑)
 * 
 * @author dengjie created at 2015年12月29日 下午3:52:43
 */
public class CountImpl implements Count {

	@Override
	public void queryCount() {
		System.out.println("查看账户方法...");

	}

	@Override
	public void updateCount() {
		System.out.println("修改账户方法...");

	}

}
