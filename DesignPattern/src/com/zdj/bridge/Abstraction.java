package com.zdj.bridge;

/**
 * 抽象化角色：定义出该角色的行为，同时保存一个对实现化角色的引用，该引用一般是一个抽象类
 * 
 * @author zdj
 *
 */
public abstract class Abstraction {
	private Implementor imp;

	/**
	 * 约束子类必须实现该构造函数
	 * 为了提醒子类，必须要做这项工作
	 * @param imp
	 */
	public Abstraction(Implementor imp) {
		this.imp = imp;
	}

	public void request() {
		this.imp.doAnything();
		System.out.println("Abstraction 执行了request方法");
	}
	
	public Implementor getImp() {
		return imp;
	}

}
