package com.zdj.flyweight;

import java.util.Hashtable;

/**
 * All Right Reserved, Copyright (C) 2015, Administrator, Ltd.<br/>
 * 享元模式工厂方法类
 * 
 * @author Administrator created at 2016年4月5日 下午1:22:42
 */
public class FlyweightFactory {
	/**
	 * 维护着享元实例列表
	 */
	private Hashtable<Object, Flyweight> flyweights = new Hashtable<>();

	public FlyweightFactory() {
	}


	/**
	 * 如果实例对象存在了，则直接返回已经存在的实例对象
	 * 如果实例对象不存在，则new 一个实例对象并返回
	 * @author Administrator 
	 * created at 2016年4月5日  下午1:28:30
	 * @param obj
	 * @return
	 */
	public Flyweight getFlyWeight(Object obj) {
		Flyweight flyweight = (Flyweight) flyweights.get(obj);
		if (flyweight == null) {
			// 产生新的ConcreteFlyweight
			flyweight = new ConcreteFlyweight((String) obj);
			flyweights.put(obj, flyweight);
		}
		return flyweight;
	}

	/**
	 * 返回当前实例对象的个数（种类）
	 * @author Administrator 
	 * created at 2016年4月5日  下午1:29:31
	 * @return
	 */
	public int getFlyweightSize() {
		return flyweights.size();
	}
}
