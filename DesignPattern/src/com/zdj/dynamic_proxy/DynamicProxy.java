package com.zdj.dynamic_proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;


/**
 * 作者 ： zdj <br/>
 * 创建时间 ： 2015年8月22日 <br/>
 * 代理类,被代理的对象必须实现了接口
 */
public class DynamicProxy implements InvocationHandler {
	
	/**
	 * 代理目标
	 */
	private Object target ;

	@Override
	public Object invoke(Object proxy, Method method, Object[] args)
			throws Throwable {
		beforeMethod() ;
		method.invoke(target, args) ;
		return null;
	}
	
	/**
	 * 作者 ： zdj <br/>
	 * 创建时间 ： 2015年8月22日 <br/>
	 * 在代理方法之前执行的方法
	 */
	public void beforeMethod(){
		System.out.println("method start");
	}

	public Object getTarget() {
		return target;
	}

	public void setTarget(Object target) {
		this.target = target;
	}
	
	

}
