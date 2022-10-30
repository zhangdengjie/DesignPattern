package com.zdj.observer;

/**
 * 作者 ： zdj <br/>
 * 创建时间 ： 2015年8月25日 <br/>
 * 调用客户端
 */
public class Client {
	public static void main(String[] args) {
		// 生成两个观察者
		IObserver a = new ConcreteObserverA() ;
		IObserver b = new ConcreteObserverB() ;
		// 创建目标对象
		AbstractObservable abstractObservable = new ConcreteObservableA() ;
		// 注册观察者
		abstractObservable.addObserver(a) ;
		abstractObservable.addObserver(b) ;
		// 通知观察者
		abstractObservable.notifyChanged() ;
	}
}
