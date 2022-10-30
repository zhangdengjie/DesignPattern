package com.zdj.strategy;
/**
 * All Right Reserved, Copyright (C) 2015, Administrator, Ltd.<br/>
 * 策略、算法家族的抽象，通常为接口
 * @author Administrator
 * created at 2016年4月11日  下午4:40:32
 */
public abstract class Strategy {
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
	protected Strategy(String extrinsic){
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

