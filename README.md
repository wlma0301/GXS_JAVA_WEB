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

## ʹ��˵��
         ʵ����APIRequest��  ����GXBAPIRequest(String apiType,String parameter)
                                      apiType�ӿ�����  parameter����������൥����,�÷ָ�
         ʾ������ȡ�˻���Ϣ�ӿڣ���APIRequest test = new APIRequest();
                         test.GXBAPIRequest("getaccount","gxb-wm");

##�����������ּ����Java�͹��ű������߿���ʵ�ֽӿڿ������Խ�                         
##�ܹ���������ƣ��������Ŀǰ֧�ֵ���������һ����������������������չ

