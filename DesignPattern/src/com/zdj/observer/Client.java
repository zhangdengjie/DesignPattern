package com.zdj.observer;

/**
 * 作者 ： zdj <br/>
 * 创建时间 ： 2015年8月25日 <br/>
 * 调用客户端
 */
public class Client {
	public static void main(String[] args) {
		IObserver a = new ConcreteObserverA() ;
		IObserver b = new ConcreteObserverB() ;
		AbstractObservable abstractObservable = new ConcreteObservableA() ;
		abstractObservable.addObserver(a) ;
		abstractObservable.addObserver(b) ;
		abstractObservable.notifyChanged() ;
	}
}
