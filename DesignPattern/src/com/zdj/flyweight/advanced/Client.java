package com.zdj.flyweight.advanced;

/**
 * All Right Reserved, Copyright (C) 2015, Administrator, Ltd.<br/>
 * 
 * @author Administrator created at 2016年4月7日 上午9:52:44
 */
public class Client {
	public static void main(String[] args) {
		/**
		 * 不要使用new 操作符创建对象
		 */
		FlyWeight f1 = FlyWeightFactory.getFlyWeight("zdj");
		FlyWeight f2 = FlyWeightFactory.getFlyWeight("zdj");
		FlyWeight f3 = FlyWeightFactory.getFlyWeight("zdj");
		FlyWeight f4 = FlyWeightFactory.getFlyWeight("zdj");
		FlyWeight f5 = FlyWeightFactory.getFlyWeight("xy");
		FlyWeight f6 = FlyWeightFactory.getFlyWeight("xy");
		FlyWeight f7 = FlyWeightFactory.getFlyWeight("xy");
		FlyWeight f8 = FlyWeightFactory.getFlyWeight("xy");
		System.out.println(f1 == FlyWeightFactory.getFlyWeight("zdj"));
		System.out.println(f7 == FlyWeightFactory.getFlyWeight("xy"));
		FlyWeightFactory.getFlyWeight("zdj").operate();
		FlyWeightFactory.getFlyWeight("xy").operate();
	}
}
