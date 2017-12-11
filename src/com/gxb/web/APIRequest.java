package com.gxb.web;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.util.Properties;

import com.gxb.api.APIObj;
import com.gxb.util.HttpRequestDo;

/**
 * Describe：API接口对象
 * @author Wolkin
 *
 */

public class APIRequest {
	public static final String ADD_URL = "https://block.gxb.io/api/";
	public static final String propertiesFile = "./WebContent/WEB-INF/etc/gxbapi.properties";
	public static HttpURLConnection connection = null;
	public static Properties apiProperties = null;
	APIObj apiObj = null;
	
	public APIRequest() {
		
		try {
			File file = new File(propertiesFile);
			InputStream inputStream = new FileInputStream(file);
			apiProperties = new Properties();
			apiProperties.load(inputStream);
			
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ProtocolException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * 
	 * @param apiType
	 * @param parameter,多个参数以逗号按顺序分割
	 * @return
	 */
	public String GXBAPIRequest(String apiType,String parameter) {
		String returnStr = "";
		APIObj apiObj = null;
		StringBuffer buffer = new StringBuffer();
		HttpRequestDo httpDo = null;
		
		try {
			Class c = Class.forName(apiProperties.getProperty(apiType));
			apiObj = (APIObj) c.newInstance();
			apiObj.doParameter(parameter);
			String obj = apiObj.jsonObj();
			String strUrl = ADD_URL + obj;
			httpDo = new HttpRequestDo(strUrl);
			int count = 0;
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
	        while ((str = bufferedReader.readLine()) != null) {
	        	buffer.append(str);
	        }
	        
	        returnStr = buffer.toString();
	        bufferedReader.close();
	        inputStreamReader.close();
	        // 释放资源    
	        inputStream.close();
	        inputStream = null;
	        httpDo.connection.disconnect();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return returnStr;
	}
}