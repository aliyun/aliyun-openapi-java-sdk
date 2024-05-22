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

import com.aliyuncs.quickbi_public.model.v20220101.QueryOrganizationRoleConfigResponse;
import com.aliyuncs.quickbi_public.model.v20220101.QueryOrganizationRoleConfigResponse.Result;
import com.aliyuncs.quickbi_public.model.v20220101.QueryOrganizationRoleConfigResponse.Result.AuthConfigListItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryOrganizationRoleConfigResponseUnmarshaller {

	public static QueryOrganizationRoleConfigResponse unmarshall(QueryOrganizationRoleConfigResponse queryOrganizationRoleConfigResponse, UnmarshallerContext _ctx) {
		
		queryOrganizationRoleConfigResponse.setRequestId(_ctx.stringValue("QueryOrganizationRoleConfigResponse.RequestId"));
		queryOrganizationRoleConfigResponse.setSuccess(_ctx.booleanValue("QueryOrganizationRoleConfigResponse.Success"));

		Result result = new Result();
		result.setRoleId(_ctx.longValue("QueryOrganizationRoleConfigResponse.Result.RoleId"));
		result.setRoleName(_ctx.stringValue("QueryOrganizationRoleConfigResponse.Result.RoleName"));
		result.setIsSystemRole(_ctx.booleanValue("QueryOrganizationRoleConfigResponse.Result.IsSystemRole"));

		List<AuthConfigListItem> authConfigList = new ArrayList<AuthConfigListItem>();
		for (int i = 0; i < _ctx.lengthValue("QueryOrganizationRoleConfigResponse.Result.AuthConfigList.Length"); i++) {
			AuthConfigListItem authConfigListItem = new AuthConfigListItem();
			authConfigListItem.setAuthKey(_ctx.stringValue("QueryOrganizationRoleConfigResponse.Result.AuthConfigList["+ i +"].AuthKey"));

			authConfigList.add(authConfigListItem);
		}
		result.setAuthConfigList(authConfigList);
		queryOrganizationRoleConfigResponse.setResult(result);
	 
	 	return queryOrganizationRoleConfigResponse;
	}
}