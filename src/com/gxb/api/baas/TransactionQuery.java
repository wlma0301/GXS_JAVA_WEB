package com.gxb.api.baas;

/**
 * ������Ϣ��ѯ/api/transaction/:tx_id
 * @author Wolkin
 *
 */

public class TransactionQuery extends BaasAPI{
	private String tx_id = "";   //���� ID
	
	@Override
	public String jsonObj() {
		return "transaction/" + tx_id;
	}

	@Override
	public void doParameter(String paraStr) {
		this.tx_id = paraStr;
	}

	public String getTx_id() {
		return tx_id;
	}

	public void setTx_id(String tx_id) {
		this.tx_id = tx_id;
	}
}
