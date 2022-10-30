package com.zdj.strategy;

/**
 * All Right Reserved, Copyright (C) 2015, Administrator, Ltd.<br/>
 * 
 * @author Administrator created at 2016年4月11日 下午4:43:00
 */
public class Client {
	public static void main(String[] args) {
		// 采用享元模式优化策略模式的缺点：生成过多的相同的算法类
		Strategy s = StrategyFactory.getFlyWeight(StrategyEnum.SUB);
		Strategy s1 = StrategyFactory.getFlyWeight(StrategyEnum.SUB);
		Context c = new Context(s);
		c.exec();
		System.out.println(s == s1);
	}
}
