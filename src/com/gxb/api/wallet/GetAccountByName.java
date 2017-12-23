package com.gxb.api.wallet;

/**
 * ͨ���˻�����ȡ�˻���Ϣ
 * @author Wolkin
 *
 */
public class GetAccountByName extends WalletAPI {

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
							"\"params\": [0, \"get_account_by_name\", [\"" + temStr + "\"]], " + 
							"\"id\":1" + 
						"}";
	}

}
