package com.gxb.api.witness;

import com.gxb.api.APIObj;

/**
 * �����֤��Ϣ�ӿڳ�����
 * @author Wolkin
 *
 */

public abstract class WitnessAPI  implements APIObj{

	@Override
	public abstract JSONObject jsonObj();

	/**
	 * ��������
	 */
	@Override
	public abstract void doParameter(String paraStr);
}
