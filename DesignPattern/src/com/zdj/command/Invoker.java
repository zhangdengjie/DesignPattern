package com.zdj.command;
/**
 * All Right Reserved, Copyright (C) 2015, Administrator, Ltd.<br/>
 * @author Administrator
 * created at 2016年6月8日  下午5:16:22
 */
public class Invoker {
	
	private Command command;
	
	// 接收命令
	public void setCommand(Command command) {
		this.command = command;
	}
	
	// 执行命令
	public void action(){
		command.execute();
	}

}

