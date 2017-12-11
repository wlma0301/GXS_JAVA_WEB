package com.gxb.util;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

/**
 * Http�������⴦��
 * @author Wolkin
 *
 */

public class HttpRequestDo {
	public HttpURLConnection connection = null;
	
	/**
	 * ����URL����
	 * @param strUrl
	 */
	public HttpRequestDo(String strUrl) {
		try {
			URL url = new URL(strUrl);
			//ʹ��URL��һ������
			this.connection = (HttpURLConnection) url.openConnection();
			
			//������������������ϴ�
			this.connection.setDoOutput(true);
			//����������������������
			this.connection.setDoInput(true);
			//ʹ��post����
			this.connection.setRequestMethod("POST");
			//��ʹ�û���
			this.connection.setUseCaches(false);
			this.connection.setConnectTimeout(5000);
			//�Զ�ִ��HTTP�ض��� 
			this.connection.setInstanceFollowRedirects(true);
			//application/x-javascript text/xml->xml���� application/x-javascript->json���� application/x-www-form-urlencoded->������ application/json;charset=utf-8 -> json����
			this.connection.setRequestProperty("Content-Type","application/x-www-form-urlencoded");
			
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
	/**
	 * ����URL�ַ���
	 * @return
	 */
	public String headerFieldURL() {
		String strURL = this.connection.getHeaderField("Location");
		if(strURL.startsWith("https")) {
			strURL = strURL.replace("https", "http");
		}
		System.out.println(strURL);
		return strURL;
	}
	
	/**
	 * ������Ӧ����
	 * @return
	 */
	public int responseCode() {
		int code = 0;
		
		try {
			code = this.connection.getResponseCode();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(code);
		return code;
	}
}
