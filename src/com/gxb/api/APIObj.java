package com.gxb.api;

/**
 * Describe��API�ӿڶ���
 * @author Wolkin
 *
 */

public interface APIObj {
	String paraStr = "";
	public abstract String jsonObj();
	
	public abstract void DoParameter(String paraStr);
}
