package com.gxb.api.witness;

/**
 * ��ȡ��ע���֤�˵�ID���˻���
 * @author Wolkin
 *
 */
public class LookupWitnessAccounts extends WitnessAPI {

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
							"\"params\": [0, \"lookup_witness_accounts\", [[\"" + temStr + "\"]]], " + 
							"\"id\":1" + 
						"}";
	}

}
