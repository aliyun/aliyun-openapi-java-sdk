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

import com.aliyuncs.account_crm.model.v20160606.FindCustomerInfoResponse;
import com.aliyuncs.account_crm.model.v20160606.FindCustomerInfoResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class FindCustomerInfoResponseUnmarshaller {

	public static FindCustomerInfoResponse unmarshall(FindCustomerInfoResponse findCustomerInfoResponse, UnmarshallerContext _ctx) {
		
		findCustomerInfoResponse.setRequestId(_ctx.stringValue("FindCustomerInfoResponse.RequestId"));
		findCustomerInfoResponse.setCode(_ctx.stringValue("FindCustomerInfoResponse.Code"));
		findCustomerInfoResponse.setMessage(_ctx.stringValue("FindCustomerInfoResponse.Message"));
		findCustomerInfoResponse.setSuccess(_ctx.booleanValue("FindCustomerInfoResponse.Success"));

		Data data = new Data();
		data.setBiz(_ctx.stringValue("FindCustomerInfoResponse.Data.Biz"));
		data.setWebsite(_ctx.stringValue("FindCustomerInfoResponse.Data.Website"));
		findCustomerInfoResponse.setData(data);
	 
	 	return findCustomerInfoResponse;
	}
}