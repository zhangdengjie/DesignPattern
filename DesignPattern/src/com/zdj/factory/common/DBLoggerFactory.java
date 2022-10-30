package com.zdj.factory.common;

public class DBLoggerFactory extends LoggerFactory{

	@Override
	public Logger creatLogger() {
		return new DBLoggger();
	}

}
