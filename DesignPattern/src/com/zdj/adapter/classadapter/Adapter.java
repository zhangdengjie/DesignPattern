package com.zdj.adapter.classadapter;

/**
 * @author zdj
 *  适配器角色
 *  其实就是将目标角色的原有的方法的请求委托给了源角色的方法
 *  通过继承加实现接口的方式称为类适配器，这种适配器的特点是请求转换的数据来源只有1个
 */
public class Adapter extends Adaptee implements Target {

	/* (non-Javadoc)
	 * @see com.zdj.adapter.classadapter.Target#request()
	 * 委托给了源角色的方法调用
	 */
	@Override
	public void request() {
		super.doSomething();
	}
	
}
