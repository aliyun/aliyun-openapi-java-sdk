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

package com.aliyuncs.quickbi_public.transform.v20220101;

import com.aliyuncs.quickbi_public.model.v20220101.UpdateWorkspaceUsersRoleResponse;
import com.aliyuncs.quickbi_public.model.v20220101.UpdateWorkspaceUsersRoleResponse.Result;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class UpdateWorkspaceUsersRoleResponseUnmarshaller {

	public static UpdateWorkspaceUsersRoleResponse unmarshall(UpdateWorkspaceUsersRoleResponse updateWorkspaceUsersRoleResponse, UnmarshallerContext _ctx) {
		
		updateWorkspaceUsersRoleResponse.setRequestId(_ctx.stringValue("UpdateWorkspaceUsersRoleResponse.RequestId"));
		updateWorkspaceUsersRoleResponse.setSuccess(_ctx.booleanValue("UpdateWorkspaceUsersRoleResponse.Success"));

		Result result = new Result();
		result.setFailure(_ctx.integerValue("UpdateWorkspaceUsersRoleResponse.Result.Failure"));
		result.setFailureDetail(_ctx.mapValue("UpdateWorkspaceUsersRoleResponse.Result.FailureDetail"));
		result.setSuccess(_ctx.integerValue("UpdateWorkspaceUsersRoleResponse.Result.Success"));
		result.setTotal(_ctx.integerValue("UpdateWorkspaceUsersRoleResponse.Result.Total"));
		updateWorkspaceUsersRoleResponse.setResult(result);
	 
	 	return updateWorkspaceUsersRoleResponse;
	}
}