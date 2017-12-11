package com.gxb.api.wallet;

/**
 * 账户查询
 * @author Wolkin
 *
 */
public class GetAccount extends WalletAPI {

	private String account_name_or_id = "";
	
	/**
	 * 缺省构造函数
	 */
	public GetAccount() {
		
	}
	
	@Override
	public void doParameter(String paraStr) {
		this.account_name_or_id = paraStr;
	}
	
	@Override
	public String jsonObj() {
		System.out.println("account/" + this.account_name_or_id);
		return "account/" + this.account_name_or_id;
	}

	public String getAccount_name_or_id() {
		return account_name_or_id;
	}

	public void setAccount_name_or_id(String account_name_or_id) {
		this.account_name_or_id = account_name_or_id;
	}
}
