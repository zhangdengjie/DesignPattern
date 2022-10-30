package com.zdj.strategy;
/**
 * All Right Reserved, Copyright (C) 2015, Administrator, Ltd.<br/>
 * Context封装角色，也叫做上下文角色，起承上启下的封装作用，屏蔽高层模块对策略、算法的直接访问，封装可能存在的变化
 * @author Administrator
 * created at 2016年4月11日  下午4:21:13
 */
public class Context {
	// 抽象策略，实现对策略的封装
	private Strategy strategy;

	public Context(Strategy strategy) {
		this.strategy = strategy;
	}
	// 封装后的策略方法
	public void exec(){
		this.strategy.operate();
	}
	
	
}

