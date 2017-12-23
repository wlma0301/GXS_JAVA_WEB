package com.gxb.api.wallet;

/**
 * ͨ���ʲ����Ż�ȡ�ʲ��б�
 * @author Wolkin
 *
 */
public class LookupAssetSymbols extends WalletAPI {

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
							"\"params\": [0, \"lookup_asset_symbols\", [[\"" + temStr + "\"]]], " + 
							"\"id\":1" + 
						"}";
	}

}
