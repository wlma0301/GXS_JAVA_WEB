package com.gxb.web;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.URL;
import java.util.Properties;

import com.gxb.api.APIObj;

/**
 * Describe：API接口对象
 * @author Wolkin
 *
 */

public class APIRequest {
	public static final String ADD_URL = "http://block.gxb.io/api";
	public static final String propertiesFile = "./WebContent/WEB-INF/etc/gxbapi.properties";
	public static HttpURLConnection connection = null;
	public static Properties apiProperties = null;
	
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
	 * @param parameter
	 * @return
	 */
	public String GXBAPIRequest(String apiType,String parameter) {
		String returnStr = "";
		APIObj apiObj = null;
		StringBuffer buffer = new StringBuffer();
		
		try {
			Class c = Class.forName(apiProperties.getProperty(apiType));
			apiObj = (APIObj) c.newInstance();
			apiObj.DoParameter(parameter);
			String obj = apiObj.jsonObj();
			
			//创建连接
			URL url = new URL("http://block.gxb.io/api/account/gxb-wm");
			connection = (HttpURLConnection) url.openConnection();
			connection.setDoOutput(true);
			connection.setDoInput(true);
			connection.setRequestMethod("POST");
			connection.setUseCaches(false);
			connection.setConnectTimeout(5000);
			//connection.setInstanceFollowRedirects(true);
			connection.setRequestProperty("Content-Length",String.valueOf(parameter.length()));
			//application/x-javascript text/xml->xml数据 application/x-javascript->json对象 application/x-www-form-urlencoded->表单数据 application/json;charset=utf-8 -> json数据
			connection.setRequestProperty("Content-Type","application/x-www-form-urlencoded");
			//connection.setRequestProperty("accept", "*/*");
			//connection.setRequestProperty("user-agent","Mozilla/4.0 (compatible; MSIE 6.0; Windows NT 5.1;SV1)");
			connection.connect();
			
			InputStream inputStream = connection.getInputStream();
	        InputStreamReader inputStreamReader = new InputStreamReader(inputStream, "utf-8");
	        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);    
	    
	        String str = null;    
	        while ((str = bufferedReader.readLine()) != null) {    
	        	buffer.append(str);
	        }
	        
	        System.out.println(buffer.toString());
	        bufferedReader.close();    
	        inputStreamReader.close();    
	        // 释放资源    
	        inputStream.close();    
	        inputStream = null;    
	        connection.disconnect();    
			
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
	
	
	public static void main(String[] args) {
		APIRequest test = new APIRequest();
		String str = test.GXBAPIRequest("get_account","gxb-wm");
		System.out.println(str);
	}
}
