package com.zdj.factory.common;

public class DBLoggger extends Logger{

	@Override
	protected void writeLog() {
		System.out.println("数据库日志记录器");
	}

}
