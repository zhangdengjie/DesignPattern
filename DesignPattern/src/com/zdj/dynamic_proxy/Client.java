package com.zdj.dynamic_proxy;

import java.lang.reflect.Proxy;

public class Client {
	public static void main(String[] args) {
		// 创建被代理对象
		IProxyDemo iProxyDemo = new ProxyDemo() ;
		// 生成代理工具
		DynamicProxy dynamicProxy = new DynamicProxy() ;
		// 设置被代理对象
		dynamicProxy.setTarget(iProxyDemo) ;
		// 生成代理对象
		IProxyDemo iProxyDemoProxy = (IProxyDemo) Proxy.newProxyInstance(iProxyDemo.getClass().getClassLoader(), iProxyDemo.getClass().getInterfaces(), dynamicProxy) ;
		iProxyDemoProxy.proxy();
	}
}
