package com.gxb.api.witness;

/**
 * ��ȡ��ע���֤�˵�����
 * @author Wolkin
 *
 */
public class GetWitnessCount extends WitnessAPI {

	@Override
	public void doParameter(String paraStr) {
		this.jsonStr = "{" + 
							"\"jsonrpc\": \"2.0\", " + 
							"\"method\": \"call\", " + 
							"\"params\": [0, \"get_witness_count\", []], " + 
							"\"id\":1" + 
						"}";
	}

}
