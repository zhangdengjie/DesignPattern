package com.zdj.decorator;


/**
 * 具体需要被装饰的组件
 * @author zdj
 *
 */
public class ConcreteComponent extends Component{ 
	@Override
	public void operate() {
		System.out.println("do something");
	}

}
