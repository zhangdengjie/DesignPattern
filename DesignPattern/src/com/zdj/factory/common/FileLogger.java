package com.zdj.factory.common;

public class FileLogger extends Logger{

	@Override
	protected void writeLog() {
		System.out.println("文件日志记录器");
	}

}
