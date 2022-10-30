package com.zdj.command.lambda;
/**
 * All Right Reserved, Copyright (C) 2015, Administrator, Ltd.<br/>
 * @author Administrator
 * created at 2016年6月12日  下午1:02:56
 */
public class Save implements Action{
	
	private final Editor editor;
	
	public Save(Editor editor) {
		super();
		this.editor = editor;
	}


	@Override
	public void perform() {
		editor.save();
	}

}

