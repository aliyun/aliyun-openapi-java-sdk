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

package com.aliyuncs.mpaas.transform.v20200415;

import com.aliyuncs.mpaas.model.v20200415.AssignMpaasUsersResponse;
import com.aliyuncs.mpaas.model.v20200415.AssignMpaasUsersResponse.AssignUserResult;
import com.aliyuncs.transform.UnmarshallerContext;


public class AssignMpaasUsersResponseUnmarshaller {

	public static AssignMpaasUsersResponse unmarshall(AssignMpaasUsersResponse assignMpaasUsersResponse, UnmarshallerContext _ctx) {
		
		assignMpaasUsersResponse.setRequestId(_ctx.stringValue("AssignMpaasUsersResponse.RequestId"));
		assignMpaasUsersResponse.setResultMessage(_ctx.stringValue("AssignMpaasUsersResponse.ResultMessage"));
		assignMpaasUsersResponse.setResultCode(_ctx.stringValue("AssignMpaasUsersResponse.ResultCode"));

		AssignUserResult assignUserResult = new AssignUserResult();
		assignUserResult.setSuccess(_ctx.booleanValue("AssignMpaasUsersResponse.AssignUserResult.Success"));
		assignUserResult.setResultMsg(_ctx.stringValue("AssignMpaasUsersResponse.AssignUserResult.ResultMsg"));
		assignMpaasUsersResponse.setAssignUserResult(assignUserResult);
	 
	 	return assignMpaasUsersResponse;
	}
}