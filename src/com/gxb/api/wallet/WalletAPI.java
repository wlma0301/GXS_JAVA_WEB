package com.gxb.api.wallet;

import org.json.JSONObject;
import com.gxb.api.APIObj;

/**
 * Ǯ����Ϣ�ӿڶ���
 * @author jjwang
 *
 */

public abstract class WalletAPI implements APIObj{
	protected JSONObject jsonObj = new JSONObject();
	/*
	 * (non-Javadoc)
	 * @see com.gxb.api.APIObj#jsonObj()
	 * ��ǰAPI��װ��JSONObject����
	 */
	public abstract JSONObject jsonObj();
}
