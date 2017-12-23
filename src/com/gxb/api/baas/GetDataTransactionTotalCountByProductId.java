package com.gxb.api.baas;

/**
 * ��ȡ��ָ��ʱ���ڹ���ָ����Ʒ�Ĵ���
 * @author Wolkin
 *
 */
public class GetDataTransactionTotalCountByProductId extends BaasAPI {

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
							"\"params\": [0, \"get_data_transaction_total_count_by_product_id\", [[\"" + temStr + "\"]]], " + 
							"\"id\":1" + 
						"}";
	}

}
