package com.gxb.api.wallet;

/**
 * ��ȡ�ʲ��˻���Ϣ
 * @author Wolkin
 *
 */
public class GetAccountBalances extends WalletAPI {

	@Override
	public void doParameter(String paraStr) {
		// TODO Auto-generated method stub
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
				           "\"params\": [0, \"get_account_balances\", [\"" + temStr + "\"]], " + 
				           "\"id\":1" + 
				       "}";
	}

}
