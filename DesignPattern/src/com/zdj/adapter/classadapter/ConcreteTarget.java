package com.zdj.adapter.classadapter;

/**
 * @author zdj
 *  具体的目标实现类
 */
public class ConcreteTarget implements Target{

	@Override
	public void request() {
		System.out.println("目标角色的方法");
	}

}
