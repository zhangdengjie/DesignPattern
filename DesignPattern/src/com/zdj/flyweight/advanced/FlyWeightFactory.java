package com.zdj.flyweight.advanced;

import java.util.HashMap;

/**
 * All Right Reserved, Copyright (C) 2015, Administrator, Ltd.<br/>
 * 享元工厂
 * 构造一个容器池，同时提供从池中获得对象的方法
 * @author Administrator
 * created at 2016年4月7日  上午9:37:04
 */
public class FlyWeightFactory {
	/**
	 * 定义一个容量池
	 */
	private static HashMap<String,FlyWeight> pool = new HashMap<>();
	
	/**
	 * 根据外部状态获取享元角色
	 * @author Administrator 
	 * created at 2016年4月7日  上午9:50:57
	 * @param extrinsic 外部状态
	 * @return
	 */
	public static FlyWeight getFlyWeight(String extrinsic){
		FlyWeight flyWeight = null;
		if(pool.containsKey(extrinsic)){
			flyWeight = pool.get(extrinsic);
		}else{
			// 根据外部状态的不同创建不同的具体享元角色
			if("zdj".equals(extrinsic)){
				flyWeight = new ConcreteFlyweight(extrinsic);
			}else if("xy".equals(extrinsic)){
				flyWeight = new ConcreteFlyweight1(extrinsic);
			}
			pool.put(extrinsic, flyWeight);
		}
		return flyWeight;
	}
	
}

