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

package com.aliyuncs.cloudesl.transform.v20200201;

import com.aliyuncs.cloudesl.model.v20200201.AddRoleActionsResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class AddRoleActionsResponseUnmarshaller {

	public static AddRoleActionsResponse unmarshall(AddRoleActionsResponse addRoleActionsResponse, UnmarshallerContext _ctx) {
		
		addRoleActionsResponse.setRequestId(_ctx.stringValue("AddRoleActionsResponse.RequestId"));
		addRoleActionsResponse.setErrorMessage(_ctx.stringValue("AddRoleActionsResponse.ErrorMessage"));
		addRoleActionsResponse.setErrorCode(_ctx.stringValue("AddRoleActionsResponse.ErrorCode"));
		addRoleActionsResponse.setMessage(_ctx.stringValue("AddRoleActionsResponse.Message"));
		addRoleActionsResponse.setDynamicCode(_ctx.stringValue("AddRoleActionsResponse.DynamicCode"));
		addRoleActionsResponse.setCode(_ctx.stringValue("AddRoleActionsResponse.Code"));
		addRoleActionsResponse.setDynamicMessage(_ctx.stringValue("AddRoleActionsResponse.DynamicMessage"));
		addRoleActionsResponse.setSuccess(_ctx.booleanValue("AddRoleActionsResponse.Success"));
	 
	 	return addRoleActionsResponse;
	}
}