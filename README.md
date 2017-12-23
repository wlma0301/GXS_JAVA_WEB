# GXS_JAVA_WEB （公信宝接口封装）
## 扩展开发说明
        增加配置文件\WebContent\WEB-INF\etc\gxbapi.properties 记录
        接口类型和接口实现类对应关系    
        示例：getaccounts = com.gxb.api.wallet.GetAccounts（获取账户信息接口）文件增加记录
        定义类com.gxb.api.wallet.GetAccounts继承WalletAPI
        如：public class GetAccounts extends WalletAPI {
           ......
      }
      实现继承函数public void doParameter(String paraStr){
      				Json类型报文组装
            }
#### 接口APIObj  子抽象类BaasAPI、BlockAPI、HistoryAPI、GlobalAPI、WalletAPI、WitnessAPI
#### 各接口实现仅需继承对应抽象类即可，目的提升封装接口可扩展性
#### 当前已完成全部公信宝Database API和History API的封装，为各位Java开发者提供进一步公信宝应用开发

## API说明
### 接口详细说明可参见公信宝官方API 【<a href="https://github.com/gxchain/Technical-Documents/blob/master/api/witness-api.md">这里</a>】
	
## 使用说明
         实例化APIRequest类  调用GXBAPIRequest(String apiType,String parameter)
                                      apiType接口类型  parameter传入参数，多单数以,好分割
         示例（获取账户信息接口）：APIRequest test = new APIRequest();
                         test.GXBAPIRequest("getaccount","gxb-wm");
                         
### 详细使用说明参见：\src\com\gxb\test\APITest.java (包含全部封装接口调用实例)
         
         
#### 本程序设计主旨帮助Java和公信宝爱好者快速实现接口开发、对接 

