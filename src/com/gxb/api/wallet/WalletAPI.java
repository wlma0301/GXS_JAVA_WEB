package com.gxb.api.wallet;

import com.gxb.api.APIObj;

/**
 * 钱包信息接口对象
 * @author Wolkin
 *
 */

public abstract class WalletAPI implements APIObj{
	
	@Override
	public abstract String jsonObj();
	
	@Override
	public abstract void doParameter(String paraStr);
}
