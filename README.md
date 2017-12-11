# GXS_JAVA_WEB （公信宝接口封装）
## 扩展开发说明
#   #\WebContent\WEB-INF\etc\gxbapi.properties
## 文件定义各类接口类型和接口实现类对应关系
## 示例：getaccount = com.gxb.api.wallet.GetAccount
## 实现类根据类别继承不同抽象类
## Baas-API实现接口需继承BaasAPI抽象类实现对应方法
## Wallet-API实现接口需继承WalletAPI抽象类实现对应方法
## Witness-API实现接口只需继承WitnessAPI抽象类实现对应方法
## 示例：public class GetAccount extends WalletAPI {
##           @Override
##           ......
##       }

## 使用说明
## 实例化APIRequest类  调用GXBAPIRequest(String apiType,String parameter)
##                                      apiType参数接口类型  parameter传入参数
##    示例（获取账户信息接口）：APIRequest test = new APIRequest();
##                              test.GXBAPIRequest("getaccount","gxb-wm");

