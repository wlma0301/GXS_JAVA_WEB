package com.gxb.api.baas;

/**
 * ��ȡ�����˻������̻�����ָ��ʱ�������ݽ��ײ����Ĳ�Ʒ����
 * @author Wolkin
 *
 */
public class GetDataTransactionProductCostsByRequester extends BaasAPI {

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
							"\"params\": [0, \"get_data_transaction_product_costs_by_requester\", [[\"" + temStr + "\"]]], " + 
							"\"id\":1" + 
						"}";
	}

}
