package com.gxb.api.wallet;

/**
 * ��Ǯ������һ�������롣�״�����Ǯ������Ҫ��������
 * usage: set_password new_password
 * ����	new_password  Ǯ������
 * @author jjwang
 *
 */
public class SetPassWord extends WalletAPI {
	private String new_password = "";
	
	/*
	 * ȱʡ���캯��
	 */
	public SetPassWord() {
		
	}
	
	/*
	 * ���캯��
	 */
	public SetPassWord(String new_passowrd) {
		this.new_password = new_password;
	}
	
	@Override
	public String jsonObj() {
		
		return this.new_password;
	}

	@Override
	public void DoParameter(String paraStr) {
		this.new_password = paraStr;
	}
	
	public String getNew_password() {
		return new_password;
	}

	public void setNew_password(String new_password) {
		this.new_password = new_password;
	}
}
