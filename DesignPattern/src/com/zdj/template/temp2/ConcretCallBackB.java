package com.zdj.template.temp2;

/**
 * 作者 ： zdj <br/>
 * 创建时间 ： 2015年8月26日 <br/>
 * 具体的回调接口实现类B
 */
public class ConcretCallBackB implements MyCallBack {

	@Override
	public void execute() {
		System.out.println("调用了ConcretCallBackB的方法execute");
	}

}
