package com.gxb.api;

import org.json.JSONObject;

/**
 * Describe������API�ӿڶ���
 * @author Wolkin
 * 
 */

public interface APIObj {
	
	/**
	 * ��������ӿ���Ϣ
	 * @return
	 */
	public abstract JSONObject jsonObj();
	
	/**
	 * �����ӿڲ�������
	 * @param paraStr
	 */
	public abstract void doParameter(String paraStr);
}
