package com.gxb.api.witness;

/**
 * ͨ���˻�ID��ȡ��֤����Ϣ
 * @author Wolkin
 *
 */
public class GetWitnessByAccount extends WitnessAPI {

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
							"\"params\": [0, \"get_witness_by_account\", [[\"" + temStr + "\"]]], " + 
							"\"id\":1" + 
						"}";
	}
}
