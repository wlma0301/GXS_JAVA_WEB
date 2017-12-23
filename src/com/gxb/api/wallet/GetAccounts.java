package com.gxb.api.wallet;

/**
 * �˻���ѯ
 * @author Wolkin
 *
 */
public class GetAccounts extends WalletAPI {

	/**
	 * ȱʡ���캯��
	 */
	public GetAccounts() {
		
	}
	
	/**
	 * �����˻���ѯ�Զ��ŷָ�
	 */
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
							"\"params\": [0, \"get_accounts\", [[\"" + temStr + "\"]]], " + 
							"\"id\":1" + 
						"}";
	}
}
