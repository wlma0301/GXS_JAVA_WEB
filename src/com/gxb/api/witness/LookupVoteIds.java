package com.gxb.api.witness;

/**
 * ͨ��ͶƱ����ID�����ͶƱ����
 * @author Wolkin
 *
 */
public class LookupVoteIds extends WitnessAPI {

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
							"\"params\": [0, \"lookup_vote_ids\", [[\"" + temStr + "\"]]], " + 
							"\"id\":1" + 
						"}";
	}
}
