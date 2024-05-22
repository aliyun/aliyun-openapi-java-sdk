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

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.quickbi_public.model.v20220101.QueryWorkspaceRoleConfigResponse;
import com.aliyuncs.quickbi_public.model.v20220101.QueryWorkspaceRoleConfigResponse.Result;
import com.aliyuncs.quickbi_public.model.v20220101.QueryWorkspaceRoleConfigResponse.Result.AuthConfigListItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryWorkspaceRoleConfigResponseUnmarshaller {

	public static QueryWorkspaceRoleConfigResponse unmarshall(QueryWorkspaceRoleConfigResponse queryWorkspaceRoleConfigResponse, UnmarshallerContext _ctx) {
		
		queryWorkspaceRoleConfigResponse.setRequestId(_ctx.stringValue("QueryWorkspaceRoleConfigResponse.RequestId"));
		queryWorkspaceRoleConfigResponse.setSuccess(_ctx.booleanValue("QueryWorkspaceRoleConfigResponse.Success"));

		Result result = new Result();
		result.setRoleId(_ctx.longValue("QueryWorkspaceRoleConfigResponse.Result.RoleId"));
		result.setRoleName(_ctx.stringValue("QueryWorkspaceRoleConfigResponse.Result.RoleName"));
		result.setIsSystemRole(_ctx.booleanValue("QueryWorkspaceRoleConfigResponse.Result.IsSystemRole"));

		List<AuthConfigListItem> authConfigList = new ArrayList<AuthConfigListItem>();
		for (int i = 0; i < _ctx.lengthValue("QueryWorkspaceRoleConfigResponse.Result.AuthConfigList.Length"); i++) {
			AuthConfigListItem authConfigListItem = new AuthConfigListItem();
			authConfigListItem.setAuthKey(_ctx.stringValue("QueryWorkspaceRoleConfigResponse.Result.AuthConfigList["+ i +"].AuthKey"));

			List<String> actionAuthKeys = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("QueryWorkspaceRoleConfigResponse.Result.AuthConfigList["+ i +"].ActionAuthKeys.Length"); j++) {
				actionAuthKeys.add(_ctx.stringValue("QueryWorkspaceRoleConfigResponse.Result.AuthConfigList["+ i +"].ActionAuthKeys["+ j +"]"));
			}
			authConfigListItem.setActionAuthKeys(actionAuthKeys);

			authConfigList.add(authConfigListItem);
		}
		result.setAuthConfigList(authConfigList);
		queryWorkspaceRoleConfigResponse.setResult(result);
	 
	 	return queryWorkspaceRoleConfigResponse;
	}
}