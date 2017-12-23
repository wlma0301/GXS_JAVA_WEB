package com.gxb.api.witness;

/**
 * ��֤ǩ�����Ƿ����㹻��Ȩ������һ���ʻ�
 * @author Wolkin
 *
 */
public class VerifyAccountAuthority extends WitnessAPI {

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
							"\"params\": [0, \"verify_account_authority\", [[\"" + temStr + "\"]]], " + 
							"\"id\":1" + 
						"}";
	}

}
