package com.zdj.factory.common;

public class FileLoggerFactory extends LoggerFactory{

	@Override
	protected Logger creatLogger() {
		return new FileLogger();
	}

}
