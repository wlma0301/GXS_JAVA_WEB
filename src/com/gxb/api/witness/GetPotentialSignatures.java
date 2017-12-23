package com.gxb.api.witness;

/**
 * ��ȡǩ���Ľ�����Ϣ��ǩ����Կ
 * @author Wolkin
 *
 */
public class GetPotentialSignatures extends WitnessAPI {

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
							"\"params\": [0, \"get_potential_signatures\", [[\"" + temStr + "\"]]], " + 
							"\"id\":1" + 
						"}";
	}

}
