package com.gxb.api.baas;

import com.gxb.api.APIObj;

/**
 * ͳ�Ʋ�ѯ��Ϣ�ӿ�
 * @author Wolkin
 *
 */

public abstract class BaasAPI implements APIObj{

	/**
	 * ����ӿڷ�����Ϣ
	 */
	@Override
	public abstract String jsonObj();

	/**
	 * ��������
	 */
	@Override
	public abstract void doParameter(String paraStr);
}
