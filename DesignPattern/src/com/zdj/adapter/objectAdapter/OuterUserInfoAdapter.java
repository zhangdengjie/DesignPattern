package com.zdj.adapter.objectAdapter;

import java.util.Map;

/**
 * @author zdj
 *  对象适配器：关联不同的多个源角色，适配器实现方式是通过类间的关联关系，这是与类适配器的根本区别
 */
public class OuterUserInfoAdapter implements IUserInfo{
	
	
	// 源目标对象
	private IOuterUserBaseInfo baseInfo = null;
	private IOuterUserHomeInfo homeInfo = null;
	private IOuterUserOfficeInfo officeInfo = null;
	
	// 数据处理
	private Map<String,String> baseMap = null;
	private Map<String,String> homeMap = null;
	private Map<String,String> officeMap = null;
	

	public OuterUserInfoAdapter(IOuterUserBaseInfo baseInfo, IOuterUserHomeInfo homeInfo,
			IOuterUserOfficeInfo officeInfo) {
		super();
		this.baseInfo = baseInfo;
		this.homeInfo = homeInfo;
		this.officeInfo = officeInfo;
		
		baseMap = this.baseInfo.getUserBaseInfo();
		homeMap = this.homeInfo.getUserHomeInfo();
		officeMap = this.officeInfo.getUserOfficeInfo();
	}


	@Override
	public void getUserBaseInfo() {
		System.out.println(baseMap.toString());
	}


	@Override
	public void getUserHomeInfo() {
		System.out.println(homeMap.toString());
	}


	@Override
	public void getUserOfficeInfo() {
		System.out.println(officeMap.toString());
	}



}
