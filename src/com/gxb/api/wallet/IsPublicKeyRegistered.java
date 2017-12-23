package com.gxb.api.wallet;

/**
 * ��֤��Կ�Ƿ��Ѿ���ע��
 * @author Wolkin
 *
 */
public class IsPublicKeyRegistered extends WalletAPI {

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
							"\"params\": [0, \"is_public_key_registered\", [[\"" + temStr + "\"]]], " + 
							"\"id\":1" + 
						"}";
	}

}
