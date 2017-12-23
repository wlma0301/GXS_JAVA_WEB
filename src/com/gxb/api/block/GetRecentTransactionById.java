package com.gxb.api.block;

/**
 * ����TXID��ѯ���ף������׳�����Ч����᷵�ؿ�ֵ
 * @author Wolkin
 *
 */
public class GetRecentTransactionById extends BlockAPI {

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
				           "\"params\": [0, \"get_recent_transaction_by_id\", [\"" + temStr + "\"]], " + 
				           "\"id\":1" + 
				       "}";
	}

}
