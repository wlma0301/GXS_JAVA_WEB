package com.gxb.api;

/**
 * Describe：定义API接口对象
 * @author Wolkin
 * 
 */

public interface APIObj {
	
	/**
	 * 打包各个接口信息
	 * @return
	 */
	public abstract String jsonObj();
	
	/**
	 * 各个接口参数处理
	 * @param paraStr
	 */
	public abstract void doParameter(String paraStr);
}
