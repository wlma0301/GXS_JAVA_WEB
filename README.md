# GXS_JAVA_WEB �����ű��ӿڷ�װ��
## ��չ����˵��
        ���������ļ�\WebContent\WEB-INF\etc\gxbapi.properties 
        �ӿ����ͺͽӿ�ʵ�����Ӧ��ϵ    
        ʾ����getaccount = com.gxb.api.wallet.GetAccount����ȡ�˻���Ϣ�ӿڣ��ļ����Ӽ�¼
        ������com.gxb.api.wallet.GetAccount�̳�WalletAPI
        �磺public class GetAccount extends WalletAPI {
           ......
      }
      ʵ�ּ̳к���public void doParameter(String paraStr){}
            public String jsonObj(){}
            
### Baas-APIʵ�ֽӿ���̳�BaasAPI������ʵ�ֶ�Ӧ����
### Wallet-APIʵ�ֽӿ���̳�WalletAPI������ʵ�ֶ�Ӧ����
### Witness-APIʵ�ֽӿ�ֻ��̳�WitnessAPI������ʵ�ֶ�Ӧ����
        ʾ����public class GetAccount extends WalletAPI {
           @Override
           ......
       }
### API˵��
# 1.��Ӧ����ѯ
	com.gxb.web.APIRequest().GXBAPIRequest("supplyquery", "")
# 2.�����ѯ
	com.gxb.web.APIRequest().GXBAPIRequest("blockquery", "")
# 3.���ײ�ѯ
	com.gxb.web.APIRequest().GXBAPIRequest("transactionquery", tx_id)
# 4.�˻���ѯ
	com.gxb.web.APIRequest().GXBAPIRequest("getaccount", account_name_or_id)
# 5.����ѯ
	com.gxb.web.APIRequest().GXBAPIRequest("accountbalance", account_name_or_id)
# 6.�˻�ͷ��
	com.gxb.web.APIRequest().GXBAPIRequest("accountheader", account_name)
	
## ʹ��˵��
         ʵ����APIRequest��  ����GXBAPIRequest(String apiType,String parameter)
                                      apiType�ӿ�����  parameter����������൥����,�÷ָ�
         ʾ������ȡ�˻���Ϣ�ӿڣ���APIRequest test = new APIRequest();
                         test.GXBAPIRequest("getaccount","gxb-wm");
                         
### ��ϸʹ��˵���μ���\src\com\gxb\test\APITest.java
         
         
##�����������ּ����Java�͹��ű������߿���ʵ�ֽӿڿ������Խ�                         
##�ܹ���������ƣ��������Ŀǰ֧�ֵ���������һ����������������������չ

