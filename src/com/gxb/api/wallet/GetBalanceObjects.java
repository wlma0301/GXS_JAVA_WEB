package com.gxb.api.wallet;

/**
 * ���ص�ַaddress������δ��ȡ��������
 * @author Wolkin
 *
 */
public class GetBalanceObjects extends WalletAPI {

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
				           "\"params\": [0, \"get_balance_objects\", [\"" + temStr + "\"]], " + 
				           "\"id\":1" + 
				       "}";
	}

}
