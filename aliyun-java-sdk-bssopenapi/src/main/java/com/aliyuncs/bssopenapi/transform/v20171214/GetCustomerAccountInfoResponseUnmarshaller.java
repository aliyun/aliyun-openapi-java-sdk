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

import com.aliyuncs.bssopenapi.model.v20171214.GetCustomerAccountInfoResponse;
import com.aliyuncs.bssopenapi.model.v20171214.GetCustomerAccountInfoResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetCustomerAccountInfoResponseUnmarshaller {

	public static GetCustomerAccountInfoResponse unmarshall(GetCustomerAccountInfoResponse getCustomerAccountInfoResponse, UnmarshallerContext _ctx) {
		
		getCustomerAccountInfoResponse.setRequestId(_ctx.stringValue("GetCustomerAccountInfoResponse.RequestId"));
		getCustomerAccountInfoResponse.setSuccess(_ctx.booleanValue("GetCustomerAccountInfoResponse.Success"));
		getCustomerAccountInfoResponse.setCode(_ctx.stringValue("GetCustomerAccountInfoResponse.Code"));
		getCustomerAccountInfoResponse.setMessage(_ctx.stringValue("GetCustomerAccountInfoResponse.Message"));

		Data data = new Data();
		data.setLoginEmail(_ctx.stringValue("GetCustomerAccountInfoResponse.Data.LoginEmail"));
		data.setAccountType(_ctx.stringValue("GetCustomerAccountInfoResponse.Data.AccountType"));
		data.setMpk(_ctx.longValue("GetCustomerAccountInfoResponse.Data.Mpk"));
		data.setHostingStatus(_ctx.stringValue("GetCustomerAccountInfoResponse.Data.HostingStatus"));
		data.setCreditLimitStatus(_ctx.stringValue("GetCustomerAccountInfoResponse.Data.CreditLimitStatus"));
		data.setIsCertified(_ctx.booleanValue("GetCustomerAccountInfoResponse.Data.IsCertified"));
		getCustomerAccountInfoResponse.setData(data);
	 
	 	return getCustomerAccountInfoResponse;
	}
}