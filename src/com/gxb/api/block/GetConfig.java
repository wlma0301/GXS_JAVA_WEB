package com.gxb.api.block;

/**
 * ��ȡ����ʱ����
 * @author Wolkin
 *
 */
public class GetConfig extends BlockAPI {

	@Override
	public void doParameter(String paraStr) {
		this.jsonStr = "{" + 
		           "\"jsonrpc\": \"2.0\", " + 
		           "\"method\": \"call\", " + 
		           "\"params\": [0, \"get_config\", []], " + 
		           "\"id\":1" + 
		       "}";
	}

}
