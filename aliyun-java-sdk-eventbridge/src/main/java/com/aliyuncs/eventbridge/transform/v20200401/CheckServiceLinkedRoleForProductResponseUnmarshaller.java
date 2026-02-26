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

package com.aliyuncs.eventbridge.transform.v20200401;

import com.aliyuncs.eventbridge.model.v20200401.CheckServiceLinkedRoleForProductResponse;
import com.aliyuncs.eventbridge.model.v20200401.CheckServiceLinkedRoleForProductResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class CheckServiceLinkedRoleForProductResponseUnmarshaller {

	public static CheckServiceLinkedRoleForProductResponse unmarshall(CheckServiceLinkedRoleForProductResponse checkServiceLinkedRoleForProductResponse, UnmarshallerContext _ctx) {
		
		checkServiceLinkedRoleForProductResponse.setRequestId(_ctx.stringValue("CheckServiceLinkedRoleForProductResponse.RequestId"));
		checkServiceLinkedRoleForProductResponse.setMessage(_ctx.stringValue("CheckServiceLinkedRoleForProductResponse.Message"));
		checkServiceLinkedRoleForProductResponse.setCode(_ctx.stringValue("CheckServiceLinkedRoleForProductResponse.Code"));
		checkServiceLinkedRoleForProductResponse.setSuccess(_ctx.booleanValue("CheckServiceLinkedRoleForProductResponse.Success"));

		Data data = new Data();
		data.setStsRoleName(_ctx.stringValue("CheckServiceLinkedRoleForProductResponse.Data.StsRoleName"));
		data.setStsRoleAuthURL(_ctx.stringValue("CheckServiceLinkedRoleForProductResponse.Data.StsRoleAuthURL"));
		data.setCheckPass(_ctx.booleanValue("CheckServiceLinkedRoleForProductResponse.Data.CheckPass"));
		checkServiceLinkedRoleForProductResponse.setData(data);
	 
	 	return checkServiceLinkedRoleForProductResponse;
	}
}