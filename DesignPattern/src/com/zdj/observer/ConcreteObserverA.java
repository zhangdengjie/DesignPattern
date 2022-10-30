package com.zdj.observer;

/**
 * 作者 ： zdj <br/>
 * 创建时间 ： 2015年8月25日 <br/>
 * 具体的监听器A
 */
public class ConcreteObserverA implements IObserver{

	@Override
	public void update() {
		System.out.println("ConcreteObserverA 观察者更新状态了");
	}

	@Override
	public void setObserverName(String observerName) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String getObserverName() {
		// TODO Auto-generated method stub
		return null;
	}

}