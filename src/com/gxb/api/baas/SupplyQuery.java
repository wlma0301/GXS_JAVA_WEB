package com.gxb.api.baas;

/**
 * http://block.gxb.io/api/supply
 * @author Wolkin
 *
 */

public class SupplyQuery extends BaasAPI {
	/**
	 * 缺省构造函数
	 */
	public SupplyQuery() {
		
	}
	
	@Override
	public void doParameter(String paraStr) {
		//参数处理
	}
	
	@Override
	public String jsonObj() {
		return "supply";
	}
}
