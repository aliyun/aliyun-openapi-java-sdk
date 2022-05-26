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

import com.aliyuncs.account_crm.model.v20160606.GetCustomerInformationResponse;
import com.aliyuncs.account_crm.model.v20160606.GetCustomerInformationResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetCustomerInformationResponseUnmarshaller {

	public static GetCustomerInformationResponse unmarshall(GetCustomerInformationResponse getCustomerInformationResponse, UnmarshallerContext _ctx) {
		
		getCustomerInformationResponse.setRequestId(_ctx.stringValue("GetCustomerInformationResponse.RequestId"));
		getCustomerInformationResponse.setCode(_ctx.stringValue("GetCustomerInformationResponse.Code"));
		getCustomerInformationResponse.setMessage(_ctx.stringValue("GetCustomerInformationResponse.Message"));
		getCustomerInformationResponse.setSuccess(_ctx.booleanValue("GetCustomerInformationResponse.Success"));

		Data data = new Data();
		data.setBiz(_ctx.stringValue("GetCustomerInformationResponse.Data.Biz"));
		data.setWebsite(_ctx.stringValue("GetCustomerInformationResponse.Data.Website"));
		getCustomerInformationResponse.setData(data);
	 
	 	return getCustomerInformationResponse;
	}
}