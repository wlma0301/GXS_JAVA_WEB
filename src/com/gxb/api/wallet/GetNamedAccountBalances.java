package com.gxb.api.wallet;

/**
 * ͨ���˻������ʲ�ID��ȡ�˻��ʲ���Ϣ
 * @author Wolkin
 *
 */
public class GetNamedAccountBalances extends WalletAPI {

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
				           "\"params\": [0, \"get_named_account_balances\", [\"" + temStr + "\"]], " + 
				           "\"id\":1" + 
				       "}";
	}

}
