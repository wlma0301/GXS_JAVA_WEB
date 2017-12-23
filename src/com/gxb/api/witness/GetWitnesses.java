package com.gxb.api.witness;

/**
 * ͨ����֤��ID��ȡ��֤���б�
 * @author Wolkin
 *
 */
public class GetWitnesses extends WitnessAPI {

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
							"\"params\": [0, \"get_witnesses\", [[\"" + temStr + "\"]]], " + 
							"\"id\":1" + 
						"}";
	}

}
