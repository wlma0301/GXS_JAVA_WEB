package com.gxb.api.block;

/**
 * ��ȡ��̬ȫ������
 * @author Wolkin
 *
 */
public class GetDynamicGlobalProperties extends BlockAPI {

	@Override
	public void doParameter(String paraStr) {
		this.jsonStr = "{" + 
				           "\"jsonrpc\": \"2.0\", " + 
				           "\"method\": \"call\", " + 
				           "\"params\": [0, \"get_dynamic_global_properties\", []], " + 
				           "\"id\":1" + 
				       "}";
	}
}
