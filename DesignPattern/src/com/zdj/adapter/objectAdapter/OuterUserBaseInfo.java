package com.zdj.adapter.objectAdapter;

import java.util.HashMap;
import java.util.Map;

public final class OuterUserBaseInfo implements IOuterUserBaseInfo {

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.zdj.adapter.objectAdapter.IOuterUserBaseInfo#getUserBaseInfo()
	 * 用户的基本信息
	 */
	@Override
	public Map<String, String> getUserBaseInfo() {
		HashMap<String, String> baseInfoMap = new HashMap<>();
		baseInfoMap.put("userName", "张三");
		baseInfoMap.put("mobileNumber", "110");
		return baseInfoMap;
	}

}
