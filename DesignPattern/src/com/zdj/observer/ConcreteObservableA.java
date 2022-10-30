package com.zdj.observer;

/**
 * 作者 ： zdj <br/>
 * 创建时间 ： 2015年8月25日 <br/>
 * 目标观察者A
 */
public class ConcreteObservableA extends AbstractObservable {
	
	private String status;

	@Override
	protected void notifyChanged() {
		/**
		 * 循环通知观察者
		 */
		for (IObserver iObserver : observers) {
			iObserver.update();
		}
	}
	
	public void setStatus(String status) {
		this.status = status;
		this.notifyChanged();
	}

}
