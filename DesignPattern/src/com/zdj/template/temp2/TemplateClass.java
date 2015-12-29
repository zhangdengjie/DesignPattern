package com.zdj.template.temp2;

/**
 * 作者 ： zdj <br/>
 * 创建时间 ： 2015年8月26日 <br/>
 * 模板类
 */
public class TemplateClass {
	/**
	 * 作者 ： zdj <br/>
	 * 创建时间 ： 2015年8月26日 <br/>
	 * 模板方发
	 */
	protected void functionA(MyCallBack callback) {
		functionB() ;
		callback.execute() ;
		functionD() ;
	}

	protected void functionB() {
		System.out.println("调用方法B");
	}
	
	protected void functionD() {
		System.out.println("调用方法D");
	}

}
