package com.gxb.test;

import com.gxb.web.APIRequest;

public class APITest {

	public static void main(String[] args) {
		APIRequest test = new APIRequest();
		String str = test.GXBAPIRequest("getaccount","gxb-wm");
		System.out.println(str);
	}
}