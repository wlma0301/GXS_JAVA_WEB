package com.gxb.api;

/**
 * Describe：API接口对象
 * @author Wolkin
 *
 */

public interface APIObj {
	String paraStr = "";
	public abstract String jsonObj();
	
	public abstract void DoParameter(String paraStr);
}
