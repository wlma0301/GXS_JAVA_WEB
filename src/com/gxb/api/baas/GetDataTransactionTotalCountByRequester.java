package com.gxb.api.baas;

/**
 * ��ȡ�����˻������̻�����ָ��ʱ���ڷ������ݽ��׵Ĵ���
 * @author Wolkin
 *
 */
public class GetDataTransactionTotalCountByRequester extends BaasAPI {

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
							"\"params\": [0, \"get_data_transaction_total_count_by_requester\", [[\"" + temStr + "\"]]], " + 
							"\"id\":1" + 
						"}";
	}

}
