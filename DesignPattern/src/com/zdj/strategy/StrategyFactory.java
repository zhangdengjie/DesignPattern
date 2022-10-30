package com.zdj.strategy;

import java.util.HashMap;

import com.zdj.flyweight.advanced.ConcreteFlyweight;
import com.zdj.flyweight.advanced.ConcreteFlyweight1;
import com.zdj.flyweight.advanced.FlyWeight;

/**
 * All Right Reserved, Copyright (C) 2015, Administrator, Ltd.<br/>
 * 
 * @author Administrator created at 2016年4月11日 下午4:53:16
 */
public class StrategyFactory {
	/**
	 * 定义一个容量池
	 */
	private static HashMap<StrategyEnum, HashMap<String, Strategy>> pool = new HashMap<>();

	/**
	 * 根据外部状态获取享元角色
	 * 
	 * @author Administrator created at 2016年4月7日 上午9:50:57
	 * @param extrinsic
	 *            外部状态
	 * @return
	 */
	public static Strategy getFlyWeight(StrategyEnum strategyEnum) {
		Strategy strategy = null;
		if (pool.containsKey(strategyEnum)) {
			if (pool.get(strategyEnum).containsKey(strategyEnum.value)) {
				strategy = pool.get(strategyEnum).get(strategyEnum.value);
			} else {
				// 存在该enum值，但是没有对应的策略
				strategy = strategyEnum.operator(strategyEnum.value);
				pool.put(strategyEnum, pool.get(strategyEnum));
			}
		} else {
			// 使用策略枚举创建对象
			// 不存在该enum
			strategy = strategyEnum.operator(strategyEnum.value);
			HashMap<String, Strategy> s = new HashMap<>();
			s.put(strategyEnum.value, strategy);
			pool.put(strategyEnum, s);
		}
		return strategy;
	}
}
