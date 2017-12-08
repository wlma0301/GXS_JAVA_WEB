package com.gxb.web;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.URL;
import java.util.Properties;

import org.json.JSONObject;

import com.gxb.api.APIObj;

/**
 * Describe：API接口对象
 * @author Wolkin
 *
 */

public class APIRequest {
	public static final String ADD_URL = "https://node1.gxb.io/rpc";
	public static final String propertiesFile = "./WebContent/WEB-INF/etc/gxbapi.properties";
	public static HttpURLConnection connection = null;
	public static Properties apiProperties = null;
	
	public APIRequest() {
		
		try {
			File file = new File(propertiesFile);
			InputStream inputStream = new FileInputStream(file);
			apiProperties = new Properties();
			apiProperties.load(inputStream);
			//创建连接
			URL url = new URL(ADD_URL);
			connection = (HttpURLConnection) url.openConnection();
			connection.setDoOutput(true);
			connection.setDoInput(true);
			connection.setRequestMethod("POST");
			connection.setUseCaches(false);
			connection.setInstanceFollowRedirects(true);
			//application/x-javascript text/xml->xml数据 application/x-javascript->json对象 application/x-www-form-urlencoded->表单数据 application/json;charset=utf-8 -> json数据
			connection.setRequestProperty("Content-Type","application/x-www-form-urlencoded");
			connection.setRequestProperty("accept", "*/*");
			connection.setRequestProperty("user-agent","Mozilla/4.0 (compatible; MSIE 6.0; Windows NT 5.1;SV1)");
			
			connection.connect();
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
		try {
			Class c = Class.forName(apiProperties.getProperty(apiType));
			apiObj = (APIObj) c.newInstance();
			
			//POST请求
			DataOutputStream out = new DataOutputStream(connection.getOutputStream());
			JSONObject obj = apiObj.jsonObj();
			
			out.writeBytes(obj.toString());
			out.flush();
			out.close();
			
			//读取响应
			BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
			
			returnStr = reader.toString();
//			String lines;
//			StringBuffer sb = new StringBuffer("");
//			
//			while ((lines = reader.readLine()) != null) {  
//                lines = new String(lines.getBytes(), "utf-8");  
//                sb.append(lines);  
//            }
//			
//			System.out.println(sb);
//			reader.close();
			
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
	
}
