package com.zdj.dynamic_proxy;

/**
 * 作者 ： zdj <br/>
 * 创建时间 ： 2015年8月22日 <br/>
 * 被动态代理的类
 */
public class ProxyDemo implements IProxyDemo{

	@Override
	public void proxy() {
		System.out.println("被代理了");
	}

}
