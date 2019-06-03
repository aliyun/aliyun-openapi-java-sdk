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

	public static GetCustomerAccountInfoResponse unmarshall(GetCustomerAccountInfoResponse getCustomerAccountInfoResponse, UnmarshallerContext context) {
		
		getCustomerAccountInfoResponse.setRequestId(context.stringValue("GetCustomerAccountInfoResponse.RequestId"));
		getCustomerAccountInfoResponse.setSuccess(context.booleanValue("GetCustomerAccountInfoResponse.Success"));
		getCustomerAccountInfoResponse.setCode(context.stringValue("GetCustomerAccountInfoResponse.Code"));
		getCustomerAccountInfoResponse.setMessage(context.stringValue("GetCustomerAccountInfoResponse.Message"));

		Data data = new Data();
		data.setLoginEmail(context.stringValue("GetCustomerAccountInfoResponse.Data.LoginEmail"));
		data.setAccountType(context.stringValue("GetCustomerAccountInfoResponse.Data.AccountType"));
		data.setMpk(context.longValue("GetCustomerAccountInfoResponse.Data.Mpk"));
		data.setHostingStatus(context.stringValue("GetCustomerAccountInfoResponse.Data.HostingStatus"));
		data.setCreditLimitStatus(context.stringValue("GetCustomerAccountInfoResponse.Data.CreditLimitStatus"));
		data.setIsCertified(context.booleanValue("GetCustomerAccountInfoResponse.Data.IsCertified"));
		getCustomerAccountInfoResponse.setData(data);
	 
	 	return getCustomerAccountInfoResponse;
	}
}