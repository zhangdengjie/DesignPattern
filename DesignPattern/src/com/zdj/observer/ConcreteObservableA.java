package com.zdj.observer;

/**
 * 作者 ： zdj <br/>
 * 创建时间 ： 2015年8月25日 <br/>
 * 被观察者A
 */
public class ConcreteObservableA extends AbstractObservable {

	@Override
	protected void notifyChanged() {
		for (IObserver iObserver : observers) {
			iObserver.update();
		}
	}

}
