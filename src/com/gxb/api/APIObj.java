package com.gxb.api;

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
	public abstract String jsonObj();
	
	/**
	 * �����ӿڲ�������
	 * @param paraStr
	 */
	public abstract void doParameter(String paraStr);
}
