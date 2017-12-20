package com.gxb.test;

import com.gxb.web.APIRequest;

public class APITest {

	public static void main(String[] args) {
		APIRequest test = new APIRequest();
		String str = test.GXBAPIRequest("getaccount","gxb-wm");
		System.out.println("getaccount:" + str);
		str = test.GXBAPIRequest("supplyquery","");
		System.out.println("supplyquery:" + str);
		str = test.GXBAPIRequest("blockquery","1407251");
		System.out.println("blockquery:" + str);
		str = test.GXBAPIRequest("transactionquery","69ce90cdb52189dee863d2bcf6ce153d89657295");
		System.out.println("transactionquery:" + str);
		str = test.GXBAPIRequest("accountbalance","gxb-wm");
		System.out.println("accountbalance:" + str);
		str = test.GXBAPIRequest("accountheader","gxb-wm");
		System.out.println("accountheader:" + str);
	}
}