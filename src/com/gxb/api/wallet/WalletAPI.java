package com.gxb.api.wallet;

import org.json.JSONObject;

import com.gxb.api.APIObj;

/**
 * Ǯ����Ϣ�ӿڶ���
 * @author Wolkin
 *
 */

public abstract class WalletAPI implements APIObj{
	
	@Override
	public abstract JSONObject jsonObj();
	
	@Override
	public abstract void doParameter(String paraStr);
}
