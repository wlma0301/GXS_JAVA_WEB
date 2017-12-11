package com.gxb.api.witness;

/**
 * ������Ϣ��ѯ  /api/block/:block_height
 * @author Wolkin
 *
 */
public class BlockQuery extends WitnessAPI{
	private String block_height = "";   //����߶Ȳ���
	
	@Override
	public String jsonObj() {
		
		return "block/" + block_height;
	}

	@Override
	public void doParameter(String paraStr) {
		this.block_height = paraStr;
	}

	public String getBlock_height() {
		return block_height;
	}

	public void setBlock_height(String block_height) {
		this.block_height = block_height;
	}
}