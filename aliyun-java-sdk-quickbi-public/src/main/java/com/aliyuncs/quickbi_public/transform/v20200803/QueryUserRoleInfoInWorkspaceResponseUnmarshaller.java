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

package com.aliyuncs.quickbi_public.transform.v20200803;

import com.aliyuncs.quickbi_public.model.v20200803.QueryUserRoleInfoInWorkspaceResponse;
import com.aliyuncs.quickbi_public.model.v20200803.QueryUserRoleInfoInWorkspaceResponse.Result;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryUserRoleInfoInWorkspaceResponseUnmarshaller {

	public static QueryUserRoleInfoInWorkspaceResponse unmarshall(QueryUserRoleInfoInWorkspaceResponse queryUserRoleInfoInWorkspaceResponse, UnmarshallerContext _ctx) {
		
		queryUserRoleInfoInWorkspaceResponse.setRequestId(_ctx.stringValue("QueryUserRoleInfoInWorkspaceResponse.RequestId"));
		queryUserRoleInfoInWorkspaceResponse.setSuccess(_ctx.booleanValue("QueryUserRoleInfoInWorkspaceResponse.Success"));

		Result result = new Result();
		result.setRoleId(_ctx.longValue("QueryUserRoleInfoInWorkspaceResponse.Result.RoleId"));
		result.setRoleCode(_ctx.stringValue("QueryUserRoleInfoInWorkspaceResponse.Result.RoleCode"));
		result.setRoleName(_ctx.stringValue("QueryUserRoleInfoInWorkspaceResponse.Result.RoleName"));
		queryUserRoleInfoInWorkspaceResponse.setResult(result);
	 
	 	return queryUserRoleInfoInWorkspaceResponse;
	}
}