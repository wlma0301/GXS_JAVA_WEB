package com.gxb.api.history;

/**
 * ��ѯ�ʻ��Ľ�����ʷ������operations_idsɸѡָ�����͵Ľ�����ʷ������startΪ��ţ���1��ʼ
 * @author Wolkin
 *
 */
public class GetAccountHistoryByOperations extends HistoryAPI {

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
							"\"params\": [3, \"get_account_history_by_operations\", [\"" + temStr + "\"]], " + 
							"\"id\":1" + 
						"}";
	}

}
