package com.gxb.api.wallet;

import org.json.JSONObject;
import com.gxb.api.APIObj;

/**
 * 钱包信息接口对象
 * @author jjwang
 *
 */

public abstract class WalletAPI implements APIObj{
	protected JSONObject jsonObj = new JSONObject();
	/*
	 * (non-Javadoc)
	 * @see com.gxb.api.APIObj#jsonObj()
	 * 当前API封装成JSONObject对象
	 */
	public abstract JSONObject jsonObj();
}
