package com.gxb.api.baas;

/**
 * ��ȡ�����˻������̻�����ָ��ʱ���ڷ������ݽ��׵�������
 * @author Wolkin
 *
 */
public class GetDataTransactionPayFeesByRequester extends BaasAPI {

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
							"\"params\": [0, \"get_data_transaction_pay_fees_by_requester\", [[\"" + temStr + "\"]]], " + 
							"\"id\":1" + 
						"}";
	}

}
