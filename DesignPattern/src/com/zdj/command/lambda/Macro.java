package com.zdj.command.lambda;

import java.util.ArrayList;
import java.util.List;

/**
 * All Right Reserved, Copyright (C) 2015, Administrator, Ltd.<br/>
 * @author Administrator
 * 包含操作序列的宏
 * created at 2016年6月12日  下午1:05:14
 */
public class Macro {
	private final List<Action> actions;

	public Macro() {
		super();
		actions = new ArrayList<>();
	}
	
	public void record(Action action){
		actions.add(action);
	}

	public void execute(){
		actions.forEach(Action::perform);
	}
	
}

