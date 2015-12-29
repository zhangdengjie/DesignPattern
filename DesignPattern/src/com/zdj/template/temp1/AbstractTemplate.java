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

	protected abstract void functionC();
}
