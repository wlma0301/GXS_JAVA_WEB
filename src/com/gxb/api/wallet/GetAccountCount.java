package com.gxb.api.wallet;

/**
 * ��ȡ����ע��������˻�����
 * @author Wolkin
 *
 */
public class GetAccountCount extends WalletAPI {

	@Override
	public void doParameter(String paraStr) {
		this.jsonStr = "{" + 
				           "\"jsonrpc\": \"2.0\", " + 
				           "\"method\": \"call\", " + 
				           "\"params\": [0, \"get_account_count\", []], " + 
				           "\"id\":1" + 
				       "}";
	}
}
