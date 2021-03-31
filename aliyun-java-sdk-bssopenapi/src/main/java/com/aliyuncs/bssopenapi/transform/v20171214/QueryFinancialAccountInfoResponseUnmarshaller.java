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

import com.aliyuncs.bssopenapi.model.v20171214.QueryFinancialAccountInfoResponse;
import com.aliyuncs.bssopenapi.model.v20171214.QueryFinancialAccountInfoResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryFinancialAccountInfoResponseUnmarshaller {

	public static QueryFinancialAccountInfoResponse unmarshall(QueryFinancialAccountInfoResponse queryFinancialAccountInfoResponse, UnmarshallerContext _ctx) {
		
		queryFinancialAccountInfoResponse.setRequestId(_ctx.stringValue("QueryFinancialAccountInfoResponse.RequestId"));
		queryFinancialAccountInfoResponse.setCode(_ctx.stringValue("QueryFinancialAccountInfoResponse.Code"));
		queryFinancialAccountInfoResponse.setSuccess(_ctx.booleanValue("QueryFinancialAccountInfoResponse.Success"));
		queryFinancialAccountInfoResponse.setMessage(_ctx.stringValue("QueryFinancialAccountInfoResponse.Message"));

		Data data = new Data();
		data.setUserName(_ctx.stringValue("QueryFinancialAccountInfoResponse.Data.UserName"));
		data.setIsFinancialAccount(_ctx.booleanValue("QueryFinancialAccountInfoResponse.Data.IsFinancialAccount"));
		data.setAccountType(_ctx.stringValue("QueryFinancialAccountInfoResponse.Data.AccountType"));
		data.setMemberNickName(_ctx.stringValue("QueryFinancialAccountInfoResponse.Data.MemberNickName"));
		data.setMemberGroupId(_ctx.longValue("QueryFinancialAccountInfoResponse.Data.MemberGroupId"));
		data.setMemberGroupName(_ctx.stringValue("QueryFinancialAccountInfoResponse.Data.MemberGroupName"));
		queryFinancialAccountInfoResponse.setData(data);
	 
	 	return queryFinancialAccountInfoResponse;
	}
}