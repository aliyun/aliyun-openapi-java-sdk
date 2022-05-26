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

package com.aliyuncs.account_crm.transform.v20160606;

import com.aliyuncs.account_crm.model.v20160606.GetIdentityRegistrationByCustomerResponse;
import com.aliyuncs.account_crm.model.v20160606.GetIdentityRegistrationByCustomerResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetIdentityRegistrationByCustomerResponseUnmarshaller {

	public static GetIdentityRegistrationByCustomerResponse unmarshall(GetIdentityRegistrationByCustomerResponse getIdentityRegistrationByCustomerResponse, UnmarshallerContext _ctx) {
		
		getIdentityRegistrationByCustomerResponse.setRequestId(_ctx.stringValue("GetIdentityRegistrationByCustomerResponse.RequestId"));
		getIdentityRegistrationByCustomerResponse.setCode(_ctx.stringValue("GetIdentityRegistrationByCustomerResponse.Code"));
		getIdentityRegistrationByCustomerResponse.setMessage(_ctx.stringValue("GetIdentityRegistrationByCustomerResponse.Message"));
		getIdentityRegistrationByCustomerResponse.setSuccess(_ctx.booleanValue("GetIdentityRegistrationByCustomerResponse.Success"));

		Data data = new Data();
		data.setDocBackPic(_ctx.stringValue("GetIdentityRegistrationByCustomerResponse.Data.DocBackPic"));
		data.setFullName(_ctx.stringValue("GetIdentityRegistrationByCustomerResponse.Data.FullName"));
		data.setDocFrontPic(_ctx.stringValue("GetIdentityRegistrationByCustomerResponse.Data.DocFrontPic"));
		data.setTel(_ctx.stringValue("GetIdentityRegistrationByCustomerResponse.Data.Tel"));
		data.setAccountType(_ctx.integerValue("GetIdentityRegistrationByCustomerResponse.Data.AccountType"));
		data.setAuditCode(_ctx.stringValue("GetIdentityRegistrationByCustomerResponse.Data.AuditCode"));
		data.setRegisteredCountry(_ctx.stringValue("GetIdentityRegistrationByCustomerResponse.Data.RegisteredCountry"));
		data.setRegisteredNum(_ctx.stringValue("GetIdentityRegistrationByCustomerResponse.Data.RegisteredNum"));
		data.setEmail(_ctx.stringValue("GetIdentityRegistrationByCustomerResponse.Data.Email"));
		data.setApplyStatus(_ctx.stringValue("GetIdentityRegistrationByCustomerResponse.Data.ApplyStatus"));
		data.setRegisteredAddress(_ctx.stringValue("GetIdentityRegistrationByCustomerResponse.Data.RegisteredAddress"));
		data.setDocNum(_ctx.stringValue("GetIdentityRegistrationByCustomerResponse.Data.DocNum"));
		data.setCustomerId(_ctx.longValue("GetIdentityRegistrationByCustomerResponse.Data.CustomerId"));
		data.setDocType(_ctx.stringValue("GetIdentityRegistrationByCustomerResponse.Data.DocType"));
		data.setApplicationId(_ctx.longValue("GetIdentityRegistrationByCustomerResponse.Data.ApplicationId"));
		getIdentityRegistrationByCustomerResponse.setData(data);
	 
	 	return getIdentityRegistrationByCustomerResponse;
	}
}