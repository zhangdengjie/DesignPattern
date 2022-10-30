package com.zdj.observer;

/**
 * 观察者接口
 */
public interface IObserver {
	void update() ;
	
	void setObserverName(String observerName);
	
	String getObserverName();
}
