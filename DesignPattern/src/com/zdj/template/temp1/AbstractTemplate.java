package com.zdj.template.temp1;

/**
 * 作者 ： zdj <br/>
 * 创建时间 ： 2015年8月26日 <br/>
 * 模板抽象类
 */
public abstract class AbstractTemplate {
	
	/**
	 * 作者 ： zdj <br/>
	 * 创建时间 ： 2015年8月26日 <br/>
	 * 模板方发
	 */
	protected void functionA() {
		functionB() ;
		functionC() ;
		functionD() ;
	}

	protected void functionB() {
		System.out.println("调用方法B");
	}
	
	protected void functionD() {
		System.out.println("调用方法D");
	}

	
	/** 
	 * 具体的执行逻辑由子类实现，委托思想
	 * @author zdj 
	 * created at 2016年1月23日  上午11:09:53
	 */
	protected abstract void functionC();
}
