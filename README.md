# GXS_JAVA_WEB �����ű��ӿڷ�װ��
## ��չ����˵��
#   #\WebContent\WEB-INF\etc\gxbapi.properties
## �ļ��������ӿ����ͺͽӿ�ʵ�����Ӧ��ϵ
## ʾ����getaccount = com.gxb.api.wallet.GetAccount
## ʵ����������̳в�ͬ������
## Baas-APIʵ�ֽӿ���̳�BaasAPI������ʵ�ֶ�Ӧ����
## Wallet-APIʵ�ֽӿ���̳�WalletAPI������ʵ�ֶ�Ӧ����
## Witness-APIʵ�ֽӿ�ֻ��̳�WitnessAPI������ʵ�ֶ�Ӧ����
## ʾ����public class GetAccount extends WalletAPI {
##           @Override
##           ......
##       }

## ʹ��˵��
## ʵ����APIRequest��  ����GXBAPIRequest(String apiType,String parameter)
##                                      apiType�����ӿ�����  parameter�������
##    ʾ������ȡ�˻���Ϣ�ӿڣ���APIRequest test = new APIRequest();
##                              test.GXBAPIRequest("getaccount","gxb-wm");

