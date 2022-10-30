package com.zdj.command.lambda;

/**
 * All Right Reserved, Copyright (C) 2015, Administrator, Ltd.<br/>
 * 
 * @author Administrator created at 2016年6月12日 下午1:10:46
 */
public class Close implements Action {

	private final Editor editor;

	public Close(Editor editor) {
		this.editor = editor;
	}

	@Override
	public void perform() {
		editor.close();
	}

}
