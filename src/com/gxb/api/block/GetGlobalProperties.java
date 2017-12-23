package com.gxb.api.block;

/**
 * 获取全局属性
 * @author Wolkin
 *
 */
public class GetGlobalProperties extends BlockAPI {

	@Override
	public void doParameter(String paraStr) {
		this.jsonStr = "{" + 
				           "\"jsonrpc\": \"2.0\", " + 
				           "\"method\": \"call\", " + 
				           "\"params\": [0, \"get_global_properties\", []], " + 
				           "\"id\":1" + 
				       "}";
	}

}
