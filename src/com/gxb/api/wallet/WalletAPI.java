package com.gxb.api.wallet;

import com.gxb.api.APIObj;

/**
 * Ǯ����Ϣ�ӿڶ���
 * @author Wolkin
 *
 */

public abstract class WalletAPI implements APIObj{
	
	@Override
	public abstract String jsonObj();
	
	@Override
	public abstract void doParameter(String paraStr);
}
