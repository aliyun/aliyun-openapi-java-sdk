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

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.quickbi_public.model.v20200803.QueryWorkspaceUserListResponse;
import com.aliyuncs.quickbi_public.model.v20200803.QueryWorkspaceUserListResponse.Result;
import com.aliyuncs.quickbi_public.model.v20200803.QueryWorkspaceUserListResponse.Result.DataItem;
import com.aliyuncs.quickbi_public.model.v20200803.QueryWorkspaceUserListResponse.Result.DataItem.Role;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryWorkspaceUserListResponseUnmarshaller {

	public static QueryWorkspaceUserListResponse unmarshall(QueryWorkspaceUserListResponse queryWorkspaceUserListResponse, UnmarshallerContext _ctx) {
		
		queryWorkspaceUserListResponse.setRequestId(_ctx.stringValue("QueryWorkspaceUserListResponse.RequestId"));
		queryWorkspaceUserListResponse.setSuccess(_ctx.booleanValue("QueryWorkspaceUserListResponse.Success"));

		Result result = new Result();
		result.setTotalNum(_ctx.integerValue("QueryWorkspaceUserListResponse.Result.TotalNum"));
		result.setTotalPages(_ctx.integerValue("QueryWorkspaceUserListResponse.Result.TotalPages"));
		result.setPageSize(_ctx.integerValue("QueryWorkspaceUserListResponse.Result.PageSize"));
		result.setPageNum(_ctx.integerValue("QueryWorkspaceUserListResponse.Result.PageNum"));

		List<DataItem> data = new ArrayList<DataItem>();
		for (int i = 0; i < _ctx.lengthValue("QueryWorkspaceUserListResponse.Result.Data.Length"); i++) {
			DataItem dataItem = new DataItem();
			dataItem.setUserId(_ctx.stringValue("QueryWorkspaceUserListResponse.Result.Data["+ i +"].UserId"));
			dataItem.setAccountName(_ctx.stringValue("QueryWorkspaceUserListResponse.Result.Data["+ i +"].AccountName"));
			dataItem.setPhone(_ctx.stringValue("QueryWorkspaceUserListResponse.Result.Data["+ i +"].Phone"));
			dataItem.setNickName(_ctx.stringValue("QueryWorkspaceUserListResponse.Result.Data["+ i +"].NickName"));
			dataItem.setEmail(_ctx.stringValue("QueryWorkspaceUserListResponse.Result.Data["+ i +"].Email"));
			dataItem.setAccountId(_ctx.stringValue("QueryWorkspaceUserListResponse.Result.Data["+ i +"].AccountId"));

			Role role = new Role();
			role.setRoleName(_ctx.stringValue("QueryWorkspaceUserListResponse.Result.Data["+ i +"].Role.RoleName"));
			role.setRoleId(_ctx.longValue("QueryWorkspaceUserListResponse.Result.Data["+ i +"].Role.RoleId"));
			role.setRoleCode(_ctx.stringValue("QueryWorkspaceUserListResponse.Result.Data["+ i +"].Role.RoleCode"));
			dataItem.setRole(role);

			data.add(dataItem);
		}
		result.setData(data);
		queryWorkspaceUserListResponse.setResult(result);
	 
	 	return queryWorkspaceUserListResponse;
	}
}