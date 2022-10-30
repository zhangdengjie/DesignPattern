package com.zdj.bridge;

/**
 * 具体抽象化角色
 * @author zdj
 *
 */
public class RefinedAbstraction extends Abstraction{

	public RefinedAbstraction(Implementor imp) {
		super(imp);
	}
	
	@Override
	public void request() {
		super.request();
		System.out.println("RefinedAbstraction 执行了request方法");
	}
	
	

}
