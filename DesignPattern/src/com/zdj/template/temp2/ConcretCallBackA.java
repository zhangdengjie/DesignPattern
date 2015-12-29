package com.zdj.template.temp2;

/**
 * 作者 ： zdj <br/>
 * 创建时间 ： 2015年8月26日 <br/>
 * 具体的回调接口实现类A
 */
public class ConcretCallBackA implements MyCallBack {

	@Override
	public void execute() {
		System.out.println("调用了ConcretCallBackA的方法execute");
	}

}
