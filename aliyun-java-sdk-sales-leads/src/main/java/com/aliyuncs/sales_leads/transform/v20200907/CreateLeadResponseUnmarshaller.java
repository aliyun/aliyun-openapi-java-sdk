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

package com.aliyuncs.sales_leads.transform.v20200907;

import com.aliyuncs.sales_leads.model.v20200907.CreateLeadResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateLeadResponseUnmarshaller {

	public static CreateLeadResponse unmarshall(CreateLeadResponse createLeadResponse, UnmarshallerContext _ctx) {
		
		createLeadResponse.setRequestId(_ctx.stringValue("CreateLeadResponse.RequestId"));
		createLeadResponse.setData(_ctx.booleanValue("CreateLeadResponse.Data"));
		createLeadResponse.setSuccess(_ctx.booleanValue("CreateLeadResponse.Success"));
		createLeadResponse.setErrorMessage(_ctx.stringValue("CreateLeadResponse.ErrorMessage"));
		createLeadResponse.setErrorCode(_ctx.stringValue("CreateLeadResponse.ErrorCode"));
	 
	 	return createLeadResponse;
	}
}