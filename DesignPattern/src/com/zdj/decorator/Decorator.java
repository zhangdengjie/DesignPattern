package com.zdj.decorator;


/**
 * 抽象装饰类，特殊的代理类
 * @author zdj
 *
 */
public abstract class Decorator extends Component{
	
	// 需要被代理的组件
	private Component mComponent;

	public Decorator(Component mComponent) {
		super();
		this.mComponent = mComponent;
	}

	@Override
	public void operate() {
		this.mComponent.operate();
	}
}
