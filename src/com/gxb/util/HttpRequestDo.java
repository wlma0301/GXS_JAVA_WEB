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
			//this.connection.setInstanceFollowRedirects(false);
			//application/x-javascript text/xml->xml���� application/x-javascript->json���� application/x-www-form-urlencoded->������ application/json;charset=utf-8 -> json����
			//�趨 �����ʽ json��Ҳ�����趨xml��ʽ��
			this.connection.setRequestProperty("Content-Type","application/json");
			this.connection.connect();
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
		return this.connection.getHeaderField("Location");
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
		return code;
	}
}
