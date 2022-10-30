package com.zdj.command;
/**
 * All Right Reserved, Copyright (C) 2015, Administrator, Ltd.<br/>
 * @author Administrator
 * created at 2016年6月8日  下午5:17:35
 */
public class Client {
	public static void main(String[] args) {
		Invoker invoker = new Invoker();
		invoker.setCommand(new ConcreteCommand1(new ConcreteReceiver1()));
		invoker.action();
	}
}

