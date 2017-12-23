package com.gxb.test;

import com.gxb.web.APIRequest;

public class APITest {

	public static void main(String[] args) {
		APIRequest test = new APIRequest();
		
		/*
		System.out.println("����ID��ѯĿ����� params <ids>");
		String strGetObjects = test.GXBAPIRequest("getobjects", "1.25.100,1.2.200");
		System.out.println(strGetObjects);
		*/
		
		/*
		System.out.println("ע��ȫ�ֶ��ĵĻص� params <cb> <clear_filter>");
		String strSetSubscribeCallback = test.GXBAPIRequest("setsubscribecallback", "cb,clear_filter");
		System.out.println(strSetSubscribeCallback);
		*/
		
		/*
		System.out.println("ע�����ݽ��׵Ļص�  params <cb> <clear_filter>");
		String strSetDataTransactionSubscribeCallback = test.GXBAPIRequest("setdatatransactionsubscribecallback", "cb,clear_filter");
		System.out.println(strSetDataTransactionSubscribeCallback);
		*/
		
		/*
		System.out.println("ȡ��ע�����ݽ��׵Ļص�");
		String strUnsubscribeDataTransactionCallback = test.GXBAPIRequest("unsubscribedatatransactioncallback", "");
		System.out.println(strUnsubscribeDataTransactionCallback);
		*/
		
		/*
		System.out.println("ע���ض����ݲ�ƷID�����ݽ��׻ص� params <cb> <ids>");
		String strSetDataTransactionProductsSubscribeCallback = test.GXBAPIRequest("setdatatransactionproductssubscribecallback", "cb,ids");
		System.out.println(strSetDataTransactionProductsSubscribeCallback);
		*/
		
		/*
		System.out.println("ע��δȷ�ϵĽ��׵Ļص� params <cb>");
		String strSetPendingTransactionCallback = test.GXBAPIRequest("setpendingtransactioncallback", "cb");
		System.out.println(strSetPendingTransactionCallback);
		*/
		
		/*
		System.out.println("ע�������Ƿ�Ӧ�õĻص�	params <cb>");
		String strSetBlockAppliedCallback = test.GXBAPIRequest("setblockappliedcallback", "cb");
		System.out.println(strSetBlockAppliedCallback);
		*/
		
		/*
		System.out.println("ֹͣ���ж��ģ��ص���");
		String strCancelAllSubscriptions = test.GXBAPIRequest("cancelallsubscriptions", "");
		System.out.println(strCancelAllSubscriptions);
		*/
		
		/*
		System.out.println("��ȡ����ͷ��Ϣ params	<block_num>");
		String strGetBlockHeader = test.GXBAPIRequest("getblockheader", "5000000");
		System.out.println(strGetBlockHeader);
		*/
		
		/*
		System.out.println("��ý�����Ϣ params <block_num> <trx_in_block>");
		String strGetTransaction = test.GXBAPIRequest("gettransaction", "<block_num>,<trx_in_block>");
		System.out.println(strGetTransaction);
		*/
		
		/*
		System.out.println("��ȡ������Ϣ  params <block_num>");
		String str1 = test.GXBAPIRequest("getblock","5360976");
		System.out.println(str1);
		*/
		
		/*
		System.out.println("����TXID��ѯ���ף������׳�����Ч����᷵�ؿ�ֵ params <id>");
		String strGetRecentTransactionById = test.GXBAPIRequest("get_recent_transaction_by_id", "<id>");
		System.out.println(strGetRecentTransactionById);
		*/
		
		/*
		System.out.println("��ȡ������");
		String strGetChainProperties = test.GXBAPIRequest("getchainproperties", "");
		System.out.println(strGetChainProperties);
		*/
		
		/*
		System.out.println("��ȡȫ������");
		String strGetGlobalProperties = test.GXBAPIRequest("getglobalproperties", "");
		System.out.println(strGetGlobalProperties);
		*/
		
		/*
		System.out.println("��ȡӶ�����");
		String strGetCommissionPercent = test.GXBAPIRequest("getcommissionpercent", "");
		System.out.println(strGetCommissionPercent);
		*/
		
		/*
		System.out.println("��ȡ����ʱ����");
		String strGetConfig = test.GXBAPIRequest("getconfig", "");
		System.out.println(strGetConfig);
		*/
		
		/*
		System.out.println("��ȡ��ID");
		String strGetChainId = test.GXBAPIRequest("getchainid", "");
		System.out.println(strGetChainId);
		*/
		
		/*
		System.out.println("��ȡ��̬ȫ������");
		String strGetDynamicGlobalProperties = test.GXBAPIRequest("getdynamicglobalproperties", "");
		System.out.println(strGetDynamicGlobalProperties);
		*/
		
		/*
		System.out.println("��������ָ��Կ���ʻ���Ϣ params <key>");
		String strGetKeyReferences = test.GXBAPIRequest("get_key_references", "<key>");
		System.out.println(strGetKeyReferences);
		*/
		
		/*
		System.out.println("��֤��Կ�Ƿ��Ѿ���ע�� params <public_key>");
		String strIsPublicKeyRegistered = test.GXBAPIRequest("ispublickeyregistered", "<public_key>");
		System.out.println(strIsPublicKeyRegistered);
		*/
		
		/*
		System.out.println("ͨ��ID��ȡ�˻���Ϣ params <account_ids>");
		String strGetAccounts = test.GXBAPIRequest("getaccounts", "<account_ids>");
		System.out.println(strGetAccounts);
		*/
		
		/*
		System.out.println("��ȡ���������������˻������Ϣ params <names_or_ids> <subscribe>");
		String strGetFullAccounts = test.GXBAPIRequest("getfullaccounts", "<names_or_ids>,<subscribe>");
		System.out.println(strGetFullAccounts);
		*/
		
		/*
		System.out.println("ͨ���˻�����ȡ�˻���Ϣ params <name>");
		String strGetAccountByName = test.GXBAPIRequest("getaccountbyname","<name>");
		System.out.println(strGetAccountByName);
		*/
		
		/*
		System.out.println("��ȡ�˻�account_id��ص��˻�id params <account_id>");
		String strGetAccountReferences = test.GXBAPIRequest("get_account_references", "<account_id>");
		System.out.println(strGetAccountReferences);
		*/
		
		/*
		System.out.println("ͨ���˻�����ȡ�˻���Ϣ params <account_names>");
		String strLookupAccountNames = test.GXBAPIRequest("lookupaccountnames","<account_names>");
		System.out.println("strLookupAccountNames");
		*/
		
		/*
		System.out.println("��ȡ��ע���˻����˻�����ID params <limit> <lower_bound_name>");
		String strLookupAccounts = test.GXBAPIRequest("lookupaccounts","<lower_bound_name>,<limit>");
		System.out.println(strLookupAccounts);
		*/
		
		/*
		System.out.println("��ȡ����ע��������˻�����");
		String strGetAccountCount = test.GXBAPIRequest("getaccountcount", "");
		System.out.println(strGetAccountCount);
		*/
		
		/*
		System.out.println("ͨ���˻�ID���ʲ�ID��ȡ�˻��ʲ���Ϣ params <id> <assets>");
		String strGetAccountBalances = test.GXBAPIRequest("getaccountbalances","<assets>,<id>");
		System.out.println(strGetAccountBalances);
		*/
		
		/*
		System.out.println("ͨ���˻������ʲ�ID��ȡ�˻��ʲ���Ϣ params <name> <assets>");
		String strGetNamedAccountBalances = test.GXBAPIRequest("getnamedaccountbalances","<name>,<assets>");
		System.out.println(strGetNamedAccountBalances);
		*/
		
		/*
		System.out.println("���ص�ַaddress������δ��ȡ��������  params <<[address]>>");
		String strGetBalanceObjects = test.GXBAPIRequest("getbalanceobjects","<<[address]>>");
		System.out.println(strGetBalanceObjects);
		*/
		
		/*
		System.out.println("ͨ���˻����ID��ȡ����ȡ���ʲ���Ϣ params <objs>");
		String strGetVestedBalances = test.GXBAPIRequest("getvestedbalances", "<objs>");
		System.out.println(strGetVestedBalances);
		*/
		
		/*
		System.out.println("ͨ���˻�ID��ȡ�������˻�����ʱ������ȡ�������Ϣ params <account_id>");
		String strGetVestingBalances = test.GXBAPIRequest("getvestingbalances", "<account_id>");
		System.out.println(strGetVestingBalances);
		*/
		
		/*
		System.out.println("ͨ����ʼ�ͽ���ʱ���ȡͶ�ߵķ����ˣ�������ǰlimit�� params <start_date_time> <end_date_time> <limit>");
		String strListDataTransactionComplainRequesters = test.GXBAPIRequest("listdatatransactioncomplainrequesters","<start_date_time>,<end_date_time>,<limit>");
		System.out.println(strListDataTransactionComplainRequesters);
		*/
		
		/*
		System.out.println("ͨ����ʼ�ͽ���ʱ���ȡ��Ͷ�ߵ�����Դ��������ǰlimit�� params <start_date_time> <end_date_time> <limit>");
		String strListDataTransactionComplainDatasources = test.GXBAPIRequest("listdatatransactioncomplaindatasources", "<start_date_time>,<end_date_time>,<limit>");
		System.out.println(strListDataTransactionComplainDatasources);
		*/
		
		/*
		System.out.println("ͨ���ʲ�ID��ȡ�ʲ� params <asset_ids>");
		String strGetAssets = test.GXBAPIRequest("getassets","<asset_ids>");
		System.out.println(strGetAssets);
		*/
		
		/*
		System.out.println("ͨ���ʲ��������ƻ�ȡ�ʲ���Ϣ��������ǰlimit�� params <lower_bound_symbol> <limit>");
		String strListAssets = test.GXBAPIRequest("listassets","<lower_bound_symbol>,<limit>");
		System.out.println(strListAssets);
		*/
		
		/*
		System.out.println("ͨ���ʲ����Ż�ȡ�ʲ��б� params <symbols_or_ids>");
		String strLookupAssetSymbols = test.GXBAPIRequest("lookupassetsymbols","<symbols_or_ids>");
		System.out.println(strLookupAssetSymbols);
		*/
		
		/*
		System.out.println("ͨ����֤��ID��ȡ��֤���б� params <witness_ids>");
		String strGetWitnesses = test.GXBAPIRequest("getwitnesses","<witness_ids>");
		System.out.println(strGetWitnesses);
		*/
		
		/*
		System.out.println("ͨ���˻�ID��ȡ��֤����Ϣ params <account>");
		String strGetWitnessByAccount = test.GXBAPIRequest("getwitnessbyaccount","<account>");
		System.out.println(strGetWitnessByAccount);
		*/
		
		/*
		System.out.println("��ȡ��ע���֤�˵�ID���˻��� params <lower_bound_name> <limit>");
		String strLookupWitnessAccounts = test.GXBAPIRequest("lookupwitnessaccounts","<lower_bound_name>,<limit>");
		System.out.println(strLookupWitnessAccounts);
		*/
		
		/*
		System.out.println("��ȡ��ע���֤�˵�����");
		String strGetWitnessCount = test.GXBAPIRequest("getwitnesscount", "");
		System.out.println(strGetWitnessCount);
		*/
		
		/*
		System.out.println("ͨ��ID��ȡ���»��Ա��Ϣ params <committee_member_ids>");
		String strGetCommitteeMembers = test.GXBAPIRequest("getcommitteemembers","<committee_member_ids>");
		System.out.println(strGetCommitteeMembers);
		*/
		
		/*
		System.out.println("ͨ���˻�ID��ȡ���»��Ա��Ϣ params <account>");
		String strGetCommitteeMemberByAccount = test.GXBAPIRequest("getcommitteememberbyaccount","<account>");
		System.out.println(strGetCommitteeMemberByAccount);
		*/
		
		/*
		System.out.println("�����ע�����»��Ա��ID���˻���,������ǰlimit��  params <account> <limit>");
		String strLookupCommitteeMemberAccounts = test.GXBAPIRequest("lookupcommitteememberaccounts", "<account>,<limit>");
		System.out.println(strLookupCommitteeMemberAccounts);
		*/
		
		/*
		System.out.println("ͨ���˻�ID��ȡ����������Ϣ params <account>");
		String strGetWorkersByAccount = test.GXBAPIRequest("getworkersbyaccount","<account>");
		System.out.println(strGetWorkersByAccount);
		*/
		
		/*
		System.out.println("ͨ��ͶƱ����ID�����ͶƱ���� params <votes>");
		String strLookupVoteIds = test.GXBAPIRequest("lookupvoteids","<votes>");
		System.out.println(strLookupVoteIds);
		*/
		
		/*
		System.out.println("��ȡǩ���Ľ�����Ϣ��ʮ�����Ʊ���  params <trx>");
		String strGetTransactionHex = test.GXBAPIRequest("gettransactionhex", "<trx>");
		System.out.println(strGetTransactionHex);
		*/
		
		/*
		System.out.println("��ȡǩ���Ľ�����Ϣ��ǩ����Կ params <trx> <available_keys>");
		String strGetRequiredSignatures = test.GXBAPIRequest("getrequiredsignatures", "<trx>,<available_keys>");
		System.out.println(strGetRequiredSignatures);
		*/
		
		/*
		System.out.println("��ȡǩ���Ľ�����Ϣ��ǩ����Կ params <trx>");
		String strGetPotentialSignatures = test.GXBAPIRequest("getpotentialsignatures", "<trx>");
		System.out.println(strGetPotentialSignatures);
		*/
		
		/*
		System.out.println("��ȡǩ���Ľ�����Ϣ�ĵ�ַ params <trx>");
		String strGetPotentialAddressSignatures = test.GXBAPIRequest("getpotentialaddresssignatures", "<trx>");
		System.out.println(strGetPotentialAddressSignatures);
		*/
		
		/*
		System.out.println("��֤�����Ƿ�������ȫ��ǩ��Ҫ�� params <trx>");
		String strVerifyAuthority = test.GXBAPIRequest("verifyauthority", "<trx>");
		System.out.println(strVerifyAuthority);
		*/
		
		/*
		System.out.println("��֤ǩ�����Ƿ����㹻��Ȩ������һ���ʻ� params <name_or_id> <signers>");
		String strVerifyAccountAuthority = test.GXBAPIRequest("verifyaccountauthority", "<name_or_id>,<signers>");
		System.out.println(strVerifyAccountAuthority);
		*/
		
		/*
		System.out.println("�ڵ�ǰ�������֤���׶����㲥���� params <trx>");
		String strValidateTransaction = test.GXBAPIRequest("validatetransaction", "<trx>");
		System.out.println(strValidateTransaction);
		*/
		
		/*
		System.out.println("ͨ������ID���ʲ�ID��ȡ������ params <ops> <id>");
		String strGetRequiredFees = test.GXBAPIRequest("getrequiredfees", "<ops>,<id>");
		System.out.println(strGetRequiredFees);
		*/
		
		/*
		System.out.println("ͨ�������˻�ID�����صı�����Ľ��� params <id>");
		String strGetProposedTransactions = test.GXBAPIRequest("getproposedtransactions", "<id>");
		System.out.println(strGetProposedTransactions);
		*/
		
		/*
		System.out.println("ͨ��ί��ID��ȡ�����ʲ� params <id>");
		String strGetBlindedBalances = test.GXBAPIRequest("getblindedbalances", "<id>");
		System.out.println(strGetBlindedBalances);
		*/
		
		/*
		System.out.println("��ȡָ��ʱ�������ݽ��׵Ĳ�Ʒ���� params <start> <end>");
		String strGetDataTransactionProductCosts = test.GXBAPIRequest("getdatatransactionproductcosts", "<start>,<end>");
		System.out.println(strGetDataTransactionProductCosts);
		*/
		
		/*
		System.out.println("��ȡָ��ʱ�������ݽ��׵Ĵ��� params <start> <end>");
		String strGetDataTransactionTotalCount = test.GXBAPIRequest("getdatatransactiontotalcount", "<start>,<end>");
		System.out.println(strGetDataTransactionTotalCount);
		*/
		
		/*
		System.out.println("��ȡ��ǰ�̻�����");
		String strGetMerchantsTotalCount = test.GXBAPIRequest("getmerchantstotalcount", "");
		System.out.println(strGetMerchantsTotalCount);
		*/
		
		/*
		System.out.println("��ȡָ��ʱ�������ݽ��׵�Ӷ�� params <start> <end>");
		String strGetDataTransactionCommission = test.GXBAPIRequest("getdatatransactioncommission", "<start>,<end>");
		System.out.println(strGetDataTransactionCommission);
		*/
		
		/*
		System.out.println("��ȡָ��ʱ�������ݽ��׵������� params <start> <end>");
		String strGetDataTransactionPayFee = test.GXBAPIRequest("getdatatransactionpayfee", "<start>,<end>");
		System.out.println(strGetDataTransactionPayFee);
		*/
		
		/*
		System.out.println("��ȡ�����˻������̻�����ָ��ʱ�������ݽ��ײ����Ĳ�Ʒ���� params <requester> <start> <end>");
		String strGetDataTransactionProductCostsByRequester = test.GXBAPIRequest("getdatatransactionproductcostsbyrequester", "<requester>,<start>,<end>");
		System.out.println(strGetDataTransactionProductCostsByRequester);
		*/
		
		/*
		System.out.println("��ȡ�����˻������̻�����ָ��ʱ���ڷ������ݽ��׵Ĵ��� params <requester> <start> <end>");
		String strGetDataTransactionTotalCountByRequester = test.GXBAPIRequest("getdatatransactiontotalcountbyrequester", "<requester>,<start>,<end>");
		System.out.println(strGetDataTransactionTotalCountByRequester);
		*/
		
		/*
		System.out.println("��ȡ�����˻������̻�����ָ��ʱ���ڷ������ݽ��׵������� params <requester> <start> <end>");
		String strGetDataTransactionPayFeesByRequester = test.GXBAPIRequest("getdatatransactionpayfeesbyrequester", "<requester>,<start>,<end>");
		System.out.println(strGetDataTransactionPayFeesByRequester);
		*/
		
		/*
		System.out.println("��ȡ��ָ��ʱ���ڹ���ָ����Ʒ�Ĳ�Ʒ���� params <product_id> <start> <end>");
		String strGetDataTransactionProductCostsByProductId = test.GXBAPIRequest("getdatatransactionproductcostsbyproductid", "<product_id>,<start>,<end>");
		System.out.println(strGetDataTransactionProductCostsByProductId);
		*/
		
		/*
		System.out.println("��ȡ��ָ��ʱ���ڹ���ָ����Ʒ�Ĵ��� params <product_id> <start> <end>");
		String strGetDataTransactionTotalCountByProductId = test.GXBAPIRequest("getdatatransactiontotalcountbyproductid", "<product_id>,<start>,<end>");
		System.out.println(strGetDataTransactionTotalCountByProductId);
		*/
		
		/*
		System.out.println("��ѯ�ʻ��Ľ�����ʷ������start/stopΪoperation_history_id�� idΪ1.11.x  params <account_id> <start> <limit> <stop>");
		String strGetAccountHistory = test.GXBAPIRequest("getaccounthistory", "<account_id>,<start>,<limit>,<stop>");
		System.out.println(strGetAccountHistory);
		*/
		
		/*
		System.out.println("��ѯ�ʻ��Ľ�����ʷ������operations_idsɸѡָ�����͵Ľ�����ʷ������startΪ��ţ���1��ʼ params <account_id> <operation_ids> <start> <limit>");
		String strGetAccountHistoryByOperations = test.GXBAPIRequest("getaccounthistorybyoperations", "<account_id>,<operation_ids>,<start>,<limit>");
		System.out.println(strGetAccountHistoryByOperations);
		*/
	}
}