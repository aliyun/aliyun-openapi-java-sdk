/*
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.aliyuncs.bssopenapi.transform.v20171214;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.bssopenapi.model.v20171214.QueryAccountTransactionDetailsResponse;
import com.aliyuncs.bssopenapi.model.v20171214.QueryAccountTransactionDetailsResponse.Data;
import com.aliyuncs.bssopenapi.model.v20171214.QueryAccountTransactionDetailsResponse.Data.AccountTransactionsListItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryAccountTransactionDetailsResponseUnmarshaller {

	public static QueryAccountTransactionDetailsResponse unmarshall(QueryAccountTransactionDetailsResponse queryAccountTransactionDetailsResponse, UnmarshallerContext _ctx) {
		
		queryAccountTransactionDetailsResponse.setRequestId(_ctx.stringValue("QueryAccountTransactionDetailsResponse.RequestId"));
		queryAccountTransactionDetailsResponse.setSuccess(_ctx.booleanValue("QueryAccountTransactionDetailsResponse.Success"));
		queryAccountTransactionDetailsResponse.setCode(_ctx.stringValue("QueryAccountTransactionDetailsResponse.Code"));
		queryAccountTransactionDetailsResponse.setMessage(_ctx.stringValue("QueryAccountTransactionDetailsResponse.Message"));

		Data data = new Data();
		data.setAccountName(_ctx.stringValue("QueryAccountTransactionDetailsResponse.Data.AccountName"));
		data.setTotalCount(_ctx.integerValue("QueryAccountTransactionDetailsResponse.Data.TotalCount"));
		data.setNextToken(_ctx.stringValue("QueryAccountTransactionDetailsResponse.Data.NextToken"));
		data.setMaxResults(_ctx.integerValue("QueryAccountTransactionDetailsResponse.Data.MaxResults"));

		List<AccountTransactionsListItem> accountTransactionsList = new ArrayList<AccountTransactionsListItem>();
		for (int i = 0; i < _ctx.lengthValue("QueryAccountTransactionDetailsResponse.Data.AccountTransactionsList.Length"); i++) {
			AccountTransactionsListItem accountTransactionsListItem = new AccountTransactionsListItem();
			accountTransactionsListItem.setTransactionNumber(_ctx.stringValue("QueryAccountTransactionDetailsResponse.Data.AccountTransactionsList["+ i +"].TransactionNumber"));
			accountTransactionsListItem.setTransactionTime(_ctx.stringValue("QueryAccountTransactionDetailsResponse.Data.AccountTransactionsList["+ i +"].TransactionTime"));
			accountTransactionsListItem.setTransactionFlow(_ctx.stringValue("QueryAccountTransactionDetailsResponse.Data.AccountTransactionsList["+ i +"].TransactionFlow"));
			accountTransactionsListItem.setTransactionType(_ctx.stringValue("QueryAccountTransactionDetailsResponse.Data.AccountTransactionsList["+ i +"].TransactionType"));
			accountTransactionsListItem.setTransactionChannel(_ctx.stringValue("QueryAccountTransactionDetailsResponse.Data.AccountTransactionsList["+ i +"].TransactionChannel"));
			accountTransactionsListItem.setTransactionChannelSN(_ctx.stringValue("QueryAccountTransactionDetailsResponse.Data.AccountTransactionsList["+ i +"].TransactionChannelSN"));
			accountTransactionsListItem.setFundType(_ctx.stringValue("QueryAccountTransactionDetailsResponse.Data.AccountTransactionsList["+ i +"].FundType"));
			accountTransactionsListItem.setRecordID(_ctx.stringValue("QueryAccountTransactionDetailsResponse.Data.AccountTransactionsList["+ i +"].RecordID"));
			accountTransactionsListItem.setRemarks(_ctx.stringValue("QueryAccountTransactionDetailsResponse.Data.AccountTransactionsList["+ i +"].Remarks"));
			accountTransactionsListItem.setBillingCycle(_ctx.stringValue("QueryAccountTransactionDetailsResponse.Data.AccountTransactionsList["+ i +"].BillingCycle"));
			accountTransactionsListItem.setAmount(_ctx.stringValue("QueryAccountTransactionDetailsResponse.Data.AccountTransactionsList["+ i +"].Amount"));
			accountTransactionsListItem.setBalance(_ctx.stringValue("QueryAccountTransactionDetailsResponse.Data.AccountTransactionsList["+ i +"].Balance"));
			accountTransactionsListItem.setTransactionAccount(_ctx.stringValue("QueryAccountTransactionDetailsResponse.Data.AccountTransactionsList["+ i +"].TransactionAccount"));

			accountTransactionsList.add(accountTransactionsListItem);
		}
		data.setAccountTransactionsList(accountTransactionsList);
		queryAccountTransactionDetailsResponse.setData(data);
	 
	 	return queryAccountTransactionDetailsResponse;
	}
}