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

import com.aliyuncs.bssopenapi.model.v20171214.QueryAccountBalanceResponse;
import com.aliyuncs.bssopenapi.model.v20171214.QueryAccountBalanceResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryAccountBalanceResponseUnmarshaller {

	public static QueryAccountBalanceResponse unmarshall(QueryAccountBalanceResponse queryAccountBalanceResponse, UnmarshallerContext context) {
		
		queryAccountBalanceResponse.setRequestId(context.stringValue("QueryAccountBalanceResponse.RequestId"));
		queryAccountBalanceResponse.setSuccess(context.booleanValue("QueryAccountBalanceResponse.Success"));
		queryAccountBalanceResponse.setCode(context.stringValue("QueryAccountBalanceResponse.Code"));
		queryAccountBalanceResponse.setMessage(context.stringValue("QueryAccountBalanceResponse.Message"));

		Data data = new Data();
		data.setAvailableAmount(context.stringValue("QueryAccountBalanceResponse.Data.AvailableAmount"));
		data.setAvailableCashAmount(context.stringValue("QueryAccountBalanceResponse.Data.AvailableCashAmount"));
		data.setCreditAmount(context.stringValue("QueryAccountBalanceResponse.Data.CreditAmount"));
		data.setMybankCreditAmount(context.stringValue("QueryAccountBalanceResponse.Data.MybankCreditAmount"));
		data.setCurrency(context.stringValue("QueryAccountBalanceResponse.Data.Currency"));
		queryAccountBalanceResponse.setData(data);
	 
	 	return queryAccountBalanceResponse;
	}
}