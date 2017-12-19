package com.gxb.test;


import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.lang.reflect.Array;

import org.json.JSONException;
import org.json.JSONObject;

import com.gxb.util.HttpRequestDo;
import com.gxb.web.APIRequest;

public class APITest {

	public static void main(String[] args) {
//		APIRequest test = new APIRequest();
//		String str = test.GXBAPIRequest("getaccount","gxb-wm");
//		System.out.println(str);
		String objectStr = "{" + 
					"\"jsonrpc\": \"2.0\", " + 
					"\"method\": \"call\", " + 
					"\"params\": [0, \"get_accounts\", [[\"1.2.1\",\"1.2.2\"]]], " + 
					"\"id\": 1" + 
				"}";
		try {
			JSONObject jsonObject = new JSONObject(objectStr);
			System.out.println(jsonObject.get("params"));
			HttpRequestDo httpDo = new HttpRequestDo("https://node1.gxb.io/");
			DataOutputStream out = new DataOutputStream(
					httpDo.connection.getOutputStream());
			out.writeBytes(jsonObject.toString());
            out.flush();
            out.close();
			int count = 0;
			String returnStr = "";
			while(httpDo.responseCode() == 302 || httpDo.responseCode() == 301) {
				count ++ ;
				String localUrl = httpDo.headerFieldURL();
				httpDo.connection.disconnect();
				httpDo = new HttpRequestDo(localUrl);
				
				//最多纪录3次
				if(count == 3) break;
			}
			
			InputStream inputStream = httpDo.connection.getInputStream();
			
	        InputStreamReader inputStreamReader = new InputStreamReader(inputStream, "utf-8");
	        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
	    
	        String str = "";
	        StringBuffer buffer = new StringBuffer();
	        while ((str = bufferedReader.readLine()) != null) {
	        	buffer.append(str);
	        }
	        
	        returnStr = buffer.toString();
	        System.out.println(returnStr);
	        bufferedReader.close();
	        inputStreamReader.close();
	        // 释放资源    
	        inputStream.close();
	        inputStream = null;
	        httpDo.connection.disconnect();
		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}