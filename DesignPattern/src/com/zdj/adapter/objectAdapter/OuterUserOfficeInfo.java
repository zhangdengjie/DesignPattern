package com.zdj.adapter.objectAdapter;

import java.util.HashMap;
import java.util.Map;

public class OuterUserOfficeInfo implements IOuterUserOfficeInfo {

	@Override
	public Map<String, String> getUserOfficeInfo() {
		HashMap<String, String> baseInfoMap = new HashMap<>();
		baseInfoMap.put("jobPosition", "3排5组");
		baseInfoMap.put("officeTelNumber", "120");
		return baseInfoMap;
	}

}
