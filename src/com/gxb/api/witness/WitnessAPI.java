package com.gxb.api.witness;

import org.json.JSONException;
import org.json.JSONObject;

import com.gxb.api.APIObj;

/**
 * 定义见证信息接口抽象类
 * @author Wolkin
 *
 */

public abstract class WitnessAPI  implements APIObj{
	protected String jsonStr = "";
	
	@Override
	public JSONObject jsonObj() {
		JSONObject jsonObj = null;
		try {
			jsonObj = new JSONObject(this.jsonStr);
			System.out.println(jsonObj.toString());
		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return jsonObj;
	}

	/**
	 * 参数处理
	 */
	@Override
	public abstract void doParameter(String paraStr);
}
