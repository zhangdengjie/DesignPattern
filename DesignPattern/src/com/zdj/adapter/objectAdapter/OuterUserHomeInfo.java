package com.zdj.adapter.objectAdapter;

import java.util.HashMap;
import java.util.Map;

public class OuterUserHomeInfo implements IOuterUserHomeInfo {

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.zdj.adapter.objectAdapter.IOuterUserHomeInfo#getUserHomeInfo()
	 * 员工的家庭信息
	 */
	@Override
	public Map<String, String> getUserHomeInfo() {
		HashMap<String, String> baseInfoMap = new HashMap<>();
		baseInfoMap.put("homeTelNumber", "119");
		baseInfoMap.put("homeAddress", "火星");
		return baseInfoMap;
	}

}
