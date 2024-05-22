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

import com.aliyuncs.quickbi_public.model.v20220101.ListWorkspaceRoleUsersResponse;
import com.aliyuncs.quickbi_public.model.v20220101.ListWorkspaceRoleUsersResponse.Result;
import com.aliyuncs.quickbi_public.model.v20220101.ListWorkspaceRoleUsersResponse.Result.DataItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListWorkspaceRoleUsersResponseUnmarshaller {

	public static ListWorkspaceRoleUsersResponse unmarshall(ListWorkspaceRoleUsersResponse listWorkspaceRoleUsersResponse, UnmarshallerContext _ctx) {
		
		listWorkspaceRoleUsersResponse.setRequestId(_ctx.stringValue("ListWorkspaceRoleUsersResponse.RequestId"));
		listWorkspaceRoleUsersResponse.setSuccess(_ctx.booleanValue("ListWorkspaceRoleUsersResponse.Success"));

		Result result = new Result();
		result.setTotalNum(_ctx.integerValue("ListWorkspaceRoleUsersResponse.Result.TotalNum"));
		result.setTotalPages(_ctx.integerValue("ListWorkspaceRoleUsersResponse.Result.TotalPages"));
		result.setPageNum(_ctx.integerValue("ListWorkspaceRoleUsersResponse.Result.PageNum"));
		result.setPageSize(_ctx.integerValue("ListWorkspaceRoleUsersResponse.Result.PageSize"));

		List<DataItem> data = new ArrayList<DataItem>();
		for (int i = 0; i < _ctx.lengthValue("ListWorkspaceRoleUsersResponse.Result.Data.Length"); i++) {
			DataItem dataItem = new DataItem();
			dataItem.setUserId(_ctx.stringValue("ListWorkspaceRoleUsersResponse.Result.Data["+ i +"].UserId"));
			dataItem.setNickName(_ctx.stringValue("ListWorkspaceRoleUsersResponse.Result.Data["+ i +"].NickName"));
			dataItem.setWorkspaceName(_ctx.stringValue("ListWorkspaceRoleUsersResponse.Result.Data["+ i +"].WorkspaceName"));
			dataItem.setWorkspaceId(_ctx.stringValue("ListWorkspaceRoleUsersResponse.Result.Data["+ i +"].WorkspaceId"));

			data.add(dataItem);
		}
		result.setData(data);
		listWorkspaceRoleUsersResponse.setResult(result);
	 
	 	return listWorkspaceRoleUsersResponse;
	}
}