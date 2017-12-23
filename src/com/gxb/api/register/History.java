package com.gxb.api.register;

import org.json.JSONException;
import org.json.JSONObject;

import com.gxb.api.APIObj;

/**
 * 定义History类，注册获取公信链History api编号
 * @author Wolkin
 *
 */
public class History  implements APIObj{
	private String jsonStr = "";
	
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

	@Override
	public void doParameter(String paraStr) {
		// TODO Auto-generated method stub
		this.jsonStr = "{" + 
						   "\"method\": \"call\", " + 
						   "\"params\": [1, \"history\", []], " + 
						   "\"id\":3" + 
					   "}";
	}

}
