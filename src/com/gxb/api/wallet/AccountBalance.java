package com.gxb.api.wallet;

/**
 * ��ѯ�˻����/api/account_balance/:id_or_name
 * @author Wolkin
 *
 */

public class AccountBalance extends WalletAPI{
	private String id_or_name = "";    //�˻�ID ���� �˻���
	
	@Override
	public JSONObject jsonObj() {
		// TODO Auto-generated method stub
		return "account_balance/" + this.id_or_name;
	}

	@Override
	public void doParameter(String paraStr) {
		this.id_or_name = paraStr;
	}

	public String getId_or_name() {
		return id_or_name;
	}

	public void setId_or_name(String id_or_name) {
		this.id_or_name = id_or_name;
	}
}
