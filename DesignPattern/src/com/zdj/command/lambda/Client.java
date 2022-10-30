package com.zdj.command.lambda;

import javax.crypto.Mac;

/**
 * All Right Reserved, Copyright (C) 2015, Administrator, Ltd.<br/>
 * @author Administrator
 * created at 2016年6月12日  下午1:07:48
 */
public class Client {
	public static void main(String[] args) {
		f1();
		System.out.println("=================================");
		f2();
		System.out.println("=================================");
		f3();
	}
	
	public static void f1(){
		EditorImpl editor = new EditorImpl();
		Macro macro = new Macro();
		macro.record(new Open(editor));
		macro.record(new Save(editor));
		macro.record(new Close(editor));
		macro.execute();
	}
	
	public static void f2(){
		// 去除了Open Save Close等样板代码
		EditorImpl editor = new EditorImpl();
		Macro macro = new Macro();
		macro.record(()->editor.save());
		macro.record(()->editor.open());
		macro.record(()->editor.close());
		macro.execute();
	}
	public static void f3(){
		// 去除了Open Save Close等样板代码
		EditorImpl editor = new EditorImpl();
		Macro macro = new Macro();
		macro.record(editor::save);
		macro.record(editor::open);
		macro.record(editor::close);
		macro.execute();
		
	}
}

class EditorImpl implements Editor{

	@Override
	public void save() {
		System.out.println("保存");
	}

	@Override
	public void open() {
		System.out.println("打开");
	}

	@Override
	public void close() {
		System.out.println("关闭");
	}
	
}

