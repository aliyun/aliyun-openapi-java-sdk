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

import com.aliyuncs.cloudesl.model.v20200201.DeleteRoleActionsResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DeleteRoleActionsResponseUnmarshaller {

	public static DeleteRoleActionsResponse unmarshall(DeleteRoleActionsResponse deleteRoleActionsResponse, UnmarshallerContext _ctx) {
		
		deleteRoleActionsResponse.setRequestId(_ctx.stringValue("DeleteRoleActionsResponse.RequestId"));
		deleteRoleActionsResponse.setErrorMessage(_ctx.stringValue("DeleteRoleActionsResponse.ErrorMessage"));
		deleteRoleActionsResponse.setErrorCode(_ctx.stringValue("DeleteRoleActionsResponse.ErrorCode"));
		deleteRoleActionsResponse.setMessage(_ctx.stringValue("DeleteRoleActionsResponse.Message"));
		deleteRoleActionsResponse.setDynamicCode(_ctx.stringValue("DeleteRoleActionsResponse.DynamicCode"));
		deleteRoleActionsResponse.setCode(_ctx.stringValue("DeleteRoleActionsResponse.Code"));
		deleteRoleActionsResponse.setDynamicMessage(_ctx.stringValue("DeleteRoleActionsResponse.DynamicMessage"));
		deleteRoleActionsResponse.setSuccess(_ctx.booleanValue("DeleteRoleActionsResponse.Success"));
	 
	 	return deleteRoleActionsResponse;
	}
}