package com.gxb.api.wallet;

/**
 * ��ȡ�˻�account_id��ص��˻�id
 * @author Wolkin
 *
 */
public class GetAccountReferences extends WalletAPI {

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
							"\"params\": [0, \"get_account_references\", [\"" + temStr + "\"]], " + 
							"\"id\":1" + 
						"}";
	}

}
