package com.gxb.api.wallet;

import org.json.JSONException;
import org.json.JSONObject;

/**
 * 对钱包设置一个新密码。首次启动钱包，需要设置密码
 * usage: set_password new_password
 * 参数	new_password  钱包密码
 * @author jjwang
 *
 */
public class SetPassWord extends WalletAPI {
	private String new_password = "";
	
	/*
	 * 缺省构造函数
	 */
	public SetPassWord() {
		
	}
	
	/*
	 * 构造函数
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
