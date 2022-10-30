package com.zdj.adapter.objectAdapter;

public class Client {
	public static void main(String[] args) {
		IOuterUserBaseInfo baseInfo = new OuterUserBaseInfo();
		IOuterUserHomeInfo homeInfo = new OuterUserHomeInfo();
		IOuterUserOfficeInfo officeInfo = new OuterUserOfficeInfo();
		
		OuterUserInfoAdapter adapter = new OuterUserInfoAdapter(baseInfo,homeInfo,officeInfo);
		adapter.getUserBaseInfo();
		adapter.getUserHomeInfo();
		adapter.getUserOfficeInfo();
	}
}
