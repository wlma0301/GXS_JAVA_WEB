package com.gxb.api.wallet;

/**
 * ��������ָ��Կ���ʻ���Ϣ	
 * @author Wolkin
 *
 */
public class GetKeyReferences extends WalletAPI {

	@Override
	public void doParameter(String paraStr) {
		//������Զ��ŷָ���ʶ��
		String temStr = "";
		if(paraStr.contains(",")) {
			temStr = paraStr.replace(",", "\",\"");
		}else {
			temStr = paraStr;
		}
		
		this.jsonStr = "{" + 
							"\"jsonrpc\": \"2.0\", " + 
							"\"method\": \"call\", " + 
							"\"params\": [0, \"get_key_references\", [[\"" + temStr + "\"]]], " + 
							"\"id\":1" + 
						"}";
	}

}
