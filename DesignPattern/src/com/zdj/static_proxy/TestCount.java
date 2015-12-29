package com.zdj.static_proxy;
/**
 * All Right Reserved, Copyright (C) 2015, dengjie, Ltd.<br/>
 * 测试Count类 
 * @author dengjie
 * created at 2015年12月29日  下午3:54:27
 */
public class TestCount {
	public static void main(String[] args) {
		Count count = new CountImpl();
		CountProxy proxy = new CountProxy(count);
		proxy.updateCount();
		proxy.queryCount();
	}
}

