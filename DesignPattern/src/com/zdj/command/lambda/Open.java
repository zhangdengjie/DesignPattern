package com.zdj.command.lambda;
/**
 * All Right Reserved, Copyright (C) 2015, Administrator, Ltd.<br/>
 * @author Administrator
 * created at 2016年6月12日  下午1:04:11
 */
public class Open implements Action{
	
	private final Editor editor;
	
	public Open(Editor editor) {
		super();
		this.editor = editor;
	}



	@Override
	public void perform() {
		editor.open();
	}

}

