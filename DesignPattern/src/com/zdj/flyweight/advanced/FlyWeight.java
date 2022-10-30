package com.zdj.flyweight.advanced;
/**
 * All Right Reserved, Copyright (C) 2015, Administrator, Ltd.<br/>
 * 享元角色的抽象类
 * 定义出对象的外部状态盒内部状态的接口或者实现
 * @author Administrator
 * created at 2016年4月7日  上午9:32:29
 */
public abstract class FlyWeight {
	/**
	 * 内部状态
	 */
	private String intrinsic;
	
	/**
	 * 外部状态
	 */
	protected final String extrinsic;

	/**
	 * 要求享元角色必须接受外部状态
	 * @param extrinsic
	 * @throws Exception 
	 */
	protected FlyWeight(String extrinsic){
		this.extrinsic = extrinsic;
	}
	
	/**
	 * 定义业务操作
	 * @author Administrator 
	 * created at 2016年4月7日  上午9:44:48
	 */
	public abstract void operate();

	public String getIntrinsic() {
		return intrinsic;
	}

	public void setIntrinsic(String intrinsic) {
		this.intrinsic = intrinsic;
	}
	
	
	
}

