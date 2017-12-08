package com.gxb.api.wallet;

import org.json.JSONException;
import org.json.JSONObject;

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
	public JSONObject jsonObj() {
		
		try {
			jsonObj.put("new_password", new_password);
		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return jsonObj;
	}

	public String getNew_password() {
		return new_password;
	}

	public void setNew_password(String new_password) {
		this.new_password = new_password;
	}
}
