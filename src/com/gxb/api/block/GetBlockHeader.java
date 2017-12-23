package com.gxb.api.block;

import org.json.JSONException;
import org.json.JSONObject;

/**
 * 获取区块头信息
 * @author Wolkin
 *
 */
public class GetBlockHeader extends BlockAPI{

	@Override
	public void doParameter(String paraStr) {
		String temStr = "";
		if(paraStr.contains(",")) {
			temStr = paraStr.replace(",", "\",\"");
		}else {
			temStr = paraStr;
		}
		this.jsonStr = "{" + 
				           "\"jsonrpc\": \"2.0\", " + 
				           "\"method\": \"call\", " + 
				           "\"params\": [0, \"get_block\", [\"" + temStr + "\"]], " + 
				           "\"id\":1" + 
				       "}";
	}

}
