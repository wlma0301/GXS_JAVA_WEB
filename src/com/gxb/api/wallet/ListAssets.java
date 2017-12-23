package com.gxb.api.wallet;

/**
 * ͨ���ʲ��������ƻ�ȡ�ʲ���Ϣ��������ǰlimit��
 * @author Wolkin
 *
 */
public class ListAssets extends WalletAPI {

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
							"\"params\": [0, \"list_assets\", [[\"" + temStr + "\"]]], " + 
							"\"id\":1" + 
						"}";
	}

}
