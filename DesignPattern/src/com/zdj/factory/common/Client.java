package com.zdj.factory.common;

public class Client {
	public static void main(String[] args) {
		Logger logger = new DBLoggerFactory().creatLogger();
		logger.writeLog();
		
		logger = new FileLoggerFactory().creatLogger();
		logger.writeLog();
	}
}
