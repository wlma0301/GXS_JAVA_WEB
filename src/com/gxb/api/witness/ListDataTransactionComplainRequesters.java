package com.gxb.api.witness;

/**
 * ͨ����ʼ�ͽ���ʱ���ȡͶ�ߵķ����ˣ�������ǰlimit��
 * @author Wolkin
 *
 */
public class ListDataTransactionComplainRequesters extends WitnessAPI {

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
				           "\"params\": [0, \"list_data_transaction_complain_requesters\", [\"" + temStr + "\"]], " + 
				           "\"id\":1" + 
				       "}";
	}

}
