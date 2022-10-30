package com.zdj.observer;

import java.util.ArrayList;
import java.util.List;


/**
 * 作者 ： zdj <br/>
 * 创建时间 ： 2015年8月25日 <br/>
 * 被监听的抽象类
 */
public abstract class AbstractObservable {
	
	/**
	 * 持有的注册的观察者
	 */
	protected List<IObserver> observers = new ArrayList<IObserver>() ;
	
	/**
	 * 作者 ： zdj <br/>
	 * 创建时间 ： 2015年8月25日 <br/>
	 * 添加一个监听器
	 * @param observer
	 */
	protected void addObserver(IObserver observer){
		if (observers != null) {
			observers.add(observer) ;
		}
	}
	
	/**
	 * 作者 ： zdj <br/>
	 * 创建时间 ： 2015年8月25日 <br/>
	 * 移除监听器
	 * @param observer
	 */
	protected void removeObserver(IObserver observer) {
		if(observers.contains(observer)){
			observers.remove(observer) ;
		}
	}
	
	/**
	 * 作者 ： zdj <br/>
	 * 创建时间 ： 2015年8月25日 <br/>
	 * 移除所有监听器
	 */
	protected void removeAllObservers() {
		if (observers != null) {
			observers.clear() ;
		}
	}
	
	/**
	 * 作者 ： zdj <br/>
	 * 创建时间 ： 2015年8月25日 <br/>
	 * 通知监听器改变状态
	 */
	protected abstract void notifyChanged() ;
}
