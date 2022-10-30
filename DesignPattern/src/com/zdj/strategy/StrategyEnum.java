package com.zdj.strategy;

/**
 * All Right Reserved, Copyright (C) 2015, Administrator, Ltd.<br/>
 * 比如只有几种外部状态：zdj xy 等
 * 
 * @author Administrator created at 2016年4月11日 下午4:57:40
 */
public enum StrategyEnum {
	ADD("+") {
		@Override
		public Strategy operator(String info) {
			return new ConcreteStratege2(info);
		}
	},

	SUB("-") {
		@Override
		public Strategy operator(String info) {
			return new ConcreteStratege1(info);
		}
	};

	String value;

	private StrategyEnum(String value) {
		this.value = value;
	};

	public abstract Strategy operator(String info);

}
