package com.gxb.api.witness;

/**
 * ͨ��ί��ID��ȡ�����ʲ�
 * @author Wolkin
 *
 */
public class GetBlindedBalances extends WitnessAPI {

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
							"\"params\": [0, \"get_blinded_balances\", [[\"" + temStr + "\"]]], " + 
							"\"id\":1" + 
						"}";
	}

}
