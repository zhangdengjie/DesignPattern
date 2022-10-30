package com.zdj.command;
/**
 * All Right Reserved, Copyright (C) 2015, Administrator, Ltd.<br/>
 * @author Administrator
 * created at 2016年6月8日  下午5:14:15
 */
public class ConcreteCommand1 extends Command{
	
	private Receiver receiver;
	
	

	public ConcreteCommand1(Receiver receiver) {
		super();
		this.receiver = receiver;
	}

	@Override
	public void execute() {
		receiver.doSomething();
	}

}

