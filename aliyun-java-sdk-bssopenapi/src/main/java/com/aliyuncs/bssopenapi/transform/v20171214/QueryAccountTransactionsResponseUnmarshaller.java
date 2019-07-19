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

import com.aliyuncs.bssopenapi.model.v20171214.QueryAccountTransactionsResponse;
import com.aliyuncs.bssopenapi.model.v20171214.QueryAccountTransactionsResponse.Data;
import com.aliyuncs.bssopenapi.model.v20171214.QueryAccountTransactionsResponse.Data.AccountTransactionsListItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryAccountTransactionsResponseUnmarshaller {

	public static QueryAccountTransactionsResponse unmarshall(QueryAccountTransactionsResponse queryAccountTransactionsResponse, UnmarshallerContext _ctx) {
		
		queryAccountTransactionsResponse.setRequestId(_ctx.stringValue("QueryAccountTransactionsResponse.RequestId"));
		queryAccountTransactionsResponse.setSuccess(_ctx.booleanValue("QueryAccountTransactionsResponse.Success"));
		queryAccountTransactionsResponse.setCode(_ctx.stringValue("QueryAccountTransactionsResponse.Code"));
		queryAccountTransactionsResponse.setMessage(_ctx.stringValue("QueryAccountTransactionsResponse.Message"));

		Data data = new Data();
		data.setAccountName(_ctx.stringValue("QueryAccountTransactionsResponse.Data.AccountName"));
		data.setTotalCount(_ctx.integerValue("QueryAccountTransactionsResponse.Data.TotalCount"));
		data.setPageNum(_ctx.integerValue("QueryAccountTransactionsResponse.Data.PageNum"));
		data.setPageSize(_ctx.integerValue("QueryAccountTransactionsResponse.Data.PageSize"));

		List<AccountTransactionsListItem> accountTransactionsList = new ArrayList<AccountTransactionsListItem>();
		for (int i = 0; i < _ctx.lengthValue("QueryAccountTransactionsResponse.Data.AccountTransactionsList.Length"); i++) {
			AccountTransactionsListItem accountTransactionsListItem = new AccountTransactionsListItem();
			accountTransactionsListItem.setTransactionNumber(_ctx.stringValue("QueryAccountTransactionsResponse.Data.AccountTransactionsList["+ i +"].TransactionNumber"));
			accountTransactionsListItem.setTransactionTime(_ctx.stringValue("QueryAccountTransactionsResponse.Data.AccountTransactionsList["+ i +"].TransactionTime"));
			accountTransactionsListItem.setTransactionFlow(_ctx.stringValue("QueryAccountTransactionsResponse.Data.AccountTransactionsList["+ i +"].TransactionFlow"));
			accountTransactionsListItem.setTransactionType(_ctx.stringValue("QueryAccountTransactionsResponse.Data.AccountTransactionsList["+ i +"].TransactionType"));
			accountTransactionsListItem.setTransactionChannel(_ctx.stringValue("QueryAccountTransactionsResponse.Data.AccountTransactionsList["+ i +"].TransactionChannel"));
			accountTransactionsListItem.setTransactionChannelSN(_ctx.stringValue("QueryAccountTransactionsResponse.Data.AccountTransactionsList["+ i +"].TransactionChannelSN"));
			accountTransactionsListItem.setFundType(_ctx.stringValue("QueryAccountTransactionsResponse.Data.AccountTransactionsList["+ i +"].FundType"));
			accountTransactionsListItem.setRecordID(_ctx.stringValue("QueryAccountTransactionsResponse.Data.AccountTransactionsList["+ i +"].RecordID"));
			accountTransactionsListItem.setRemarks(_ctx.stringValue("QueryAccountTransactionsResponse.Data.AccountTransactionsList["+ i +"].Remarks"));
			accountTransactionsListItem.setBillingCycle(_ctx.stringValue("QueryAccountTransactionsResponse.Data.AccountTransactionsList["+ i +"].BillingCycle"));
			accountTransactionsListItem.setAmount(_ctx.stringValue("QueryAccountTransactionsResponse.Data.AccountTransactionsList["+ i +"].Amount"));
			accountTransactionsListItem.setBalance(_ctx.stringValue("QueryAccountTransactionsResponse.Data.AccountTransactionsList["+ i +"].Balance"));
			accountTransactionsListItem.setTransactionAccount(_ctx.stringValue("QueryAccountTransactionsResponse.Data.AccountTransactionsList["+ i +"].TransactionAccount"));

			accountTransactionsList.add(accountTransactionsListItem);
		}
		data.setAccountTransactionsList(accountTransactionsList);
		queryAccountTransactionsResponse.setData(data);
	 
	 	return queryAccountTransactionsResponse;
	}
}