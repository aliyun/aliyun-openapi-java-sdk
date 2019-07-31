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

	public static QueryAccountBalanceResponse unmarshall(QueryAccountBalanceResponse queryAccountBalanceResponse, UnmarshallerContext _ctx) {
		
		queryAccountBalanceResponse.setRequestId(_ctx.stringValue("QueryAccountBalanceResponse.RequestId"));
		queryAccountBalanceResponse.setSuccess(_ctx.booleanValue("QueryAccountBalanceResponse.Success"));
		queryAccountBalanceResponse.setCode(_ctx.stringValue("QueryAccountBalanceResponse.Code"));
		queryAccountBalanceResponse.setMessage(_ctx.stringValue("QueryAccountBalanceResponse.Message"));

		Data data = new Data();
		data.setAvailableAmount(_ctx.stringValue("QueryAccountBalanceResponse.Data.AvailableAmount"));
		data.setAvailableCashAmount(_ctx.stringValue("QueryAccountBalanceResponse.Data.AvailableCashAmount"));
		data.setCreditAmount(_ctx.stringValue("QueryAccountBalanceResponse.Data.CreditAmount"));
		data.setMybankCreditAmount(_ctx.stringValue("QueryAccountBalanceResponse.Data.MybankCreditAmount"));
		data.setCurrency(_ctx.stringValue("QueryAccountBalanceResponse.Data.Currency"));
		queryAccountBalanceResponse.setData(data);
	 
	 	return queryAccountBalanceResponse;
	}
}