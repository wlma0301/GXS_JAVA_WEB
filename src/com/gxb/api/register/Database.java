package com.gxb.api.register;

import org.json.JSONException;
import org.json.JSONObject;

import com.gxb.api.APIObj;

/**
 * ����Database�࣬ע���ȡ������database api���
 * @author Wolkin
 *
 */
public class Database implements APIObj{
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
							"\"jsonrpc\": \"2.0\", " + 
							"\"method\": \"call\", " + 
							"\"params\": [1, \"database\", []], " + 
							"\"id\":2" + 
						"}";
	}

}
