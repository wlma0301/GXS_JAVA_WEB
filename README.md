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
#### 各接口实现仅需集成对应抽象类即可，目的提升可扩展性
#### 当前已完成全部公信宝Database API和History API的封装，为各位Java开发者提供进一步公信宝应用开发

## API说明
#####"根据ID查询目标对象 params <ids>"
     test.GXBAPIRequest("getobjects", "1.25.100,1.2.200");
#####"注册全局订阅的回调 params <cb> <clear_filter>"
#####test.GXBAPIRequest("setsubscribecallback", "cb,clear_filter");
#####"注册数据交易的回调  params <cb> <clear_filter>"
#####test.GXBAPIRequest("setdatatransactionsubscribecallback", "cb,clear_filter");
#####
#####"取消注册数据交易的回调"
#####String strUnsubscribeDataTransactionCallback = test.GXBAPIRequest("unsubscribedatatransactioncallback", "");
#####
#####System.out.println("注册特定数据产品ID的数据交易回调 params <cb> <ids>");
#####String strSetDataTransactionProductsSubscribeCallback = test.GXBAPIRequest("setdatatransactionproductssubscribecallback", "cb,ids");
#####
#####System.out.println("注册未确认的交易的回调 params <cb>");
#####String strSetPendingTransactionCallback = test.GXBAPIRequest("setpendingtransactioncallback", "cb");
#####
#####System.out.println("注册区块是否被应用的回调	params <cb>");
#####String strSetBlockAppliedCallback = test.GXBAPIRequest("setblockappliedcallback", "cb");
#####
#####System.out.println("停止所有订阅（回调）");
#####String strCancelAllSubscriptions = test.GXBAPIRequest("cancelallsubscriptions", "");
#####
#####System.out.println("获取区块头信息 params	<block_num>");
#####String strGetBlockHeader = test.GXBAPIRequest("getblockheader", "5000000");
#####
#####System.out.println("获得交易信息 params <block_num> <trx_in_block>");
#####String strGetTransaction = test.GXBAPIRequest("gettransaction", "<block_num>,<trx_in_block>");
#####
#####System.out.println("获取区块信息  params <block_num>");
#####String str1 = test.GXBAPIRequest("getblock","5360976");
#####
#####System.out.println("根据TXID查询交易，若交易超出有效期则会返回空值 params <id>");
#####String strGetRecentTransactionById = test.GXBAPIRequest("get_recent_transaction_by_id", "<id>");
#####
#####System.out.println("获取链属性");
#####String strGetChainProperties = test.GXBAPIRequest("getchainproperties", "");
#####
#####System.out.println("获取全局属性");
#####String strGetGlobalProperties = test.GXBAPIRequest("getglobalproperties", "");
#####
#####System.out.println("获取佣金比例");
#####String strGetCommissionPercent = test.GXBAPIRequest("getcommissionpercent", "");
#####
#####System.out.println("获取编译时常量");
#####String strGetConfig = test.GXBAPIRequest("getconfig", "");
#####
#####System.out.println("获取链ID");
#####String strGetChainId = test.GXBAPIRequest("getchainid", "");
#####
#####System.out.println("获取动态全局属性");
#####String strGetDynamicGlobalProperties = test.GXBAPIRequest("getdynamicglobalproperties", "");
#####
#####System.out.println("返回所有指向公钥的帐户信息 params <key>");
#####String strGetKeyReferences = test.GXBAPIRequest("get_key_references", "<key>");
#####
#####System.out.println("验证公钥是否已经被注册 params <public_key>");
#####String strIsPublicKeyRegistered = test.GXBAPIRequest("ispublickeyregistered", "<public_key>");
#####
#####System.out.println("通过ID获取账户信息 params <account_ids>");
#####String strGetAccounts = test.GXBAPIRequest("getaccounts", "<account_ids>");
#####
#####System.out.println("获取符合条件的所有账户相关信息 params <names_or_ids> <subscribe>");
#####String strGetFullAccounts = test.GXBAPIRequest("getfullaccounts", "<names_or_ids>,<subscribe>");
#####
#####System.out.println("通过账户名获取账户信息 params <name>");
#####String strGetAccountByName = test.GXBAPIRequest("getaccountbyname","<name>");
#####
#####System.out.println("获取账户account_id相关的账户id params <account_id>");
#####String strGetAccountReferences = test.GXBAPIRequest("get_account_references", "<account_id>");
#####
#####System.out.println("通过账户名获取账户信息 params <account_names>");
#####String strLookupAccountNames = test.GXBAPIRequest("lookupaccountnames","<account_names>");
#####
#####System.out.println("获取已注册账户的账户名和ID params <limit> <lower_bound_name>");
#####String strLookupAccounts = test.GXBAPIRequest("lookupaccounts","<lower_bound_name>,<limit>");
#####
#####System.out.println("获取链上注册的所有账户数量");
#####String strGetAccountCount = test.GXBAPIRequest("getaccountcount", "");
#####
#####System.out.println("通过账户ID和资产ID获取账户资产信息 params <id> <assets>");
#####String strGetAccountBalances = test.GXBAPIRequest("getaccountbalances","<assets>,<id>");
#####
#####System.out.println("通过账户名和资产ID获取账户资产信息 params <name> <assets>");
#####String strGetNamedAccountBalances = test.GXBAPIRequest("getnamedaccountbalances","<name>,<assets>");
#####
#####System.out.println("返回地址address上所有未领取的余额对象  params <<[address]>>");
#####String strGetBalanceObjects = test.GXBAPIRequest("getbalanceobjects","<<[address]>>");
#####
#####System.out.println("通过账户余额ID获取可领取的资产信息 params <objs>");
#####String strGetVestedBalances = test.GXBAPIRequest("getvestedbalances", "<objs>");
#####
#####System.out.println("通过账户ID获取归属该账户但暂时不可领取的余额信息 params <account_id>");
#####String strGetVestingBalances = test.GXBAPIRequest("getvestingbalances", "<account_id>");
#####
#####System.out.println("通过开始和结束时间获取投诉的发起人，并返回前limit个 params <start_date_time> <end_date_time> <limit>");
#####String strListDataTransactionComplainRequesters = test.GXBAPIRequest("listdatatransactioncomplainrequesters","<start_date_time>,<end_date_time>,<limit>");
#####
#####System.out.println("通过开始和结束时间获取被投诉的数据源，并返回前limit个 params <start_date_time> <end_date_time> <limit>");
#####String strListDataTransactionComplainDatasources = test.GXBAPIRequest("listdatatransactioncomplaindatasources", "<start_date_time>,<end_date_time>,<limit>");
#####
#####System.out.println("通过资产ID获取资产 params <asset_ids>");
#####String strGetAssets = test.GXBAPIRequest("getassets","<asset_ids>");
#####
#####System.out.println("通过资产符号名称获取资产信息，并返回前limit个 params <lower_bound_symbol> <limit>");
#####String strListAssets = test.GXBAPIRequest("listassets","<lower_bound_symbol>,<limit>");
#####
#####System.out.println("通过资产符号获取资产列表 params <symbols_or_ids>");
#####String strLookupAssetSymbols = test.GXBAPIRequest("lookupassetsymbols","<symbols_or_ids>");
#####
#####System.out.println("通过见证人ID获取见证人列表 params <witness_ids>");
#####String strGetWitnesses = test.GXBAPIRequest("getwitnesses","<witness_ids>");
#####
#####System.out.println("通过账户ID获取见证人信息 params <account>");
#####String strGetWitnessByAccount = test.GXBAPIRequest("getwitnessbyaccount","<account>");
#####
#####System.out.println("获取已注册见证人的ID和账户名 params <lower_bound_name> <limit>");
#####String strLookupWitnessAccounts = test.GXBAPIRequest("lookupwitnessaccounts","<lower_bound_name>,<limit>");
#####
#####System.out.println("获取已注册见证人的数量");
#####String strGetWitnessCount = test.GXBAPIRequest("getwitnesscount", "");
#####
#####System.out.println("通过ID获取理事会成员信息 params <committee_member_ids>");
#####String strGetCommitteeMembers = test.GXBAPIRequest("getcommitteemembers","<committee_member_ids>");
#####
#####System.out.println("通过账户ID获取理事会成员信息 params <account>");
#####String strGetCommitteeMemberByAccount = test.GXBAPIRequest("getcommitteememberbyaccount","<account>");
#####
#####System.out.println("获得已注册理事会成员的ID和账户名,并返回前limit个  params <account> <limit>");
#####String strLookupCommitteeMemberAccounts = test.GXBAPIRequest("lookupcommitteememberaccounts", "<account>,<limit>");
#####
#####System.out.println("通过账户ID获取工作对象信息 params <account>");
#####String strGetWorkersByAccount = test.GXBAPIRequest("getworkersbyaccount","<account>");
#####
#####System.out.println("通过投票对象ID来获得投票对象 params <votes>");
#####String strLookupVoteIds = test.GXBAPIRequest("lookupvoteids","<votes>");
#####
#####System.out.println("获取签名的交易信息的十六进制编码  params <trx>");
#####String strGetTransactionHex = test.GXBAPIRequest("gettransactionhex", "<trx>");
#####
#####System.out.println("获取签名的交易信息的签名公钥 params <trx> <available_keys>");
#####String strGetRequiredSignatures = test.GXBAPIRequest("getrequiredsignatures", "<trx>,<available_keys>");
#####
#####System.out.println("获取签名的交易信息的签名公钥 params <trx>");
#####String strGetPotentialSignatures = test.GXBAPIRequest("getpotentialsignatures", "<trx>");
#####
#####System.out.println("获取签名的交易信息的地址 params <trx>");
#####String strGetPotentialAddressSignatures = test.GXBAPIRequest("getpotentialaddresssignatures", "<trx>");
#####
#####System.out.println("验证交易是否已满足全部签名要求 params <trx>");
#####String strVerifyAuthority = test.GXBAPIRequest("verifyauthority", "<trx>");
#####
#####System.out.println("验证签名人是否有足够的权力控制一个帐户 params <name_or_id> <signers>");
#####String strVerifyAccountAuthority = test.GXBAPIRequest("verifyaccountauthority", "<name_or_id>,<signers>");
#####
#####System.out.println("在当前情况下验证交易而不广播交易 params <trx>");
#####String strValidateTransaction = test.GXBAPIRequest("validatetransaction", "<trx>");
#####
#####System.out.println("通过操作ID和资产ID获取手续费 params <ops> <id>");
#####String strGetRequiredFees = test.GXBAPIRequest("getrequiredfees", "<ops>,<id>");
#####
#####System.out.println("通过具体账户ID获得相关的被提议的交易 params <id>");
#####String strGetProposedTransactions = test.GXBAPIRequest("getproposedtransactions", "<id>");
#####
#####System.out.println("通过委托ID获取隐藏资产 params <id>");
#####String strGetBlindedBalances = test.GXBAPIRequest("getblindedbalances", "<id>");
#####
#####System.out.println("获取指定时间内数据交易的产品费用 params <start> <end>");
#####String strGetDataTransactionProductCosts = test.GXBAPIRequest("getdatatransactionproductcosts", "<start>,<end>");
#####
#####System.out.println("获取指定时间内数据交易的次数 params <start> <end>");
#####String strGetDataTransactionTotalCount = test.GXBAPIRequest("getdatatransactiontotalcount", "<start>,<end>");
#####
#####System.out.println("获取当前商户个数");
#####String strGetMerchantsTotalCount = test.GXBAPIRequest("getmerchantstotalcount", "");
#####
#####System.out.println("获取指定时间内数据交易的佣金 params <start> <end>");
#####String strGetDataTransactionCommission = test.GXBAPIRequest("getdatatransactioncommission", "<start>,<end>");
#####
#####System.out.println("获取指定时间内数据交易的手续费 params <start> <end>");
#####String strGetDataTransactionPayFee = test.GXBAPIRequest("getdatatransactionpayfee", "<start>,<end>");
#####
#####System.out.println("获取请求账户（即商户）在指定时间内数据交易产生的产品费用 params <requester> <start> <end>");
#####String strGetDataTransactionProductCostsByRequester = test.GXBAPIRequest("getdatatransactionproductcostsbyrequester", "<requester>,<start>,<end>");
#####
#####System.out.println("获取请求账户（即商户）在指定时间内发起数据交易的次数 params <requester> <start> <end>");
#####String strGetDataTransactionTotalCountByRequester = test.GXBAPIRequest("getdatatransactiontotalcountbyrequester", "<requester>,<start>,<end>");
#####
#####System.out.println("获取请求账户（即商户）在指定时间内发起数据交易的手续费 params <requester> <start> <end>");
#####String strGetDataTransactionPayFeesByRequester = test.GXBAPIRequest("getdatatransactionpayfeesbyrequester", "<requester>,<start>,<end>");
#####
#####System.out.println("获取在指定时间内购买指定产品的产品费用 params <product_id> <start> <end>");
#####String strGetDataTransactionProductCostsByProductId = test.GXBAPIRequest("getdatatransactionproductcostsbyproductid", "<product_id>,<start>,<end>");
#####
#####System.out.println("获取在指定时间内购买指定产品的次数 params <product_id> <start> <end>");
#####String strGetDataTransactionTotalCountByProductId = test.GXBAPIRequest("getdatatransactiontotalcountbyproductid", "<product_id>,<start>,<end>");
#####
#####System.out.println("查询帐户的交易历史，其中start/stop为operation_history_id， id为1.11.x  params <account_id> <start> <limit> <stop>");
#####String strGetAccountHistory = test.GXBAPIRequest("getaccounthistory", "<account_id>,<start>,<limit>,<stop>");
#####
#####System.out.println("查询帐户的交易历史，根据operations_ids筛选指定类型的交易历史，其中start为序号，从1开始 params <account_id> <operation_ids> <start> <limit>");
#####String strGetAccountHistoryByOperations = test.GXBAPIRequest("getaccounthistorybyoperations", "<account_id>,<operation_ids>,<start>,<limit>");

	
## 使用说明
         实例化APIRequest类  调用GXBAPIRequest(String apiType,String parameter)
                                      apiType接口类型  parameter传入参数，多单数以,好分割
         示例（获取账户信息接口）：APIRequest test = new APIRequest();
                         test.GXBAPIRequest("getaccount","gxb-wm");
                         
### 详细使用说明参见：\src\com\gxb\test\APITest.java
         
         
#### 本程序设计主旨帮助Java和公信宝爱好者快速实现接口开发、对接 

