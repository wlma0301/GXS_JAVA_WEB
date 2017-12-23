package com.gxb.api.baas;

import org.json.JSONException;
import org.json.JSONObject;

import com.gxb.api.APIObj;

/**
 * ͳ�Ʋ�ѯ��Ϣ�ӿ�
 * @author Wolkin
 *
 */

public abstract class BaasAPI implements APIObj{
	protected String jsonStr = "";
	
	/**
	 * ����ӿڷ�����Ϣ
	 */
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
	 * ��������
	 */
	@Override
	public abstract void doParameter(String paraStr);
}
