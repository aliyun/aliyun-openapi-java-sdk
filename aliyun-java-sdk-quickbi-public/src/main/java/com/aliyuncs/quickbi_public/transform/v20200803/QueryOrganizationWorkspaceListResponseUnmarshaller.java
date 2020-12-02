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

import com.aliyuncs.quickbi_public.model.v20200803.QueryOrganizationWorkspaceListResponse;
import com.aliyuncs.quickbi_public.model.v20200803.QueryOrganizationWorkspaceListResponse.Result;
import com.aliyuncs.quickbi_public.model.v20200803.QueryOrganizationWorkspaceListResponse.Result.DataItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryOrganizationWorkspaceListResponseUnmarshaller {

	public static QueryOrganizationWorkspaceListResponse unmarshall(QueryOrganizationWorkspaceListResponse queryOrganizationWorkspaceListResponse, UnmarshallerContext _ctx) {
		
		queryOrganizationWorkspaceListResponse.setRequestId(_ctx.stringValue("QueryOrganizationWorkspaceListResponse.RequestId"));
		queryOrganizationWorkspaceListResponse.setSuccess(_ctx.booleanValue("QueryOrganizationWorkspaceListResponse.Success"));

		Result result = new Result();
		result.setTotalNum(_ctx.integerValue("QueryOrganizationWorkspaceListResponse.Result.TotalNum"));
		result.setTotalPages(_ctx.integerValue("QueryOrganizationWorkspaceListResponse.Result.TotalPages"));
		result.setPageNum(_ctx.integerValue("QueryOrganizationWorkspaceListResponse.Result.PageNum"));
		result.setPageSize(_ctx.integerValue("QueryOrganizationWorkspaceListResponse.Result.PageSize"));

		List<DataItem> data = new ArrayList<DataItem>();
		for (int i = 0; i < _ctx.lengthValue("QueryOrganizationWorkspaceListResponse.Result.Data.Length"); i++) {
			DataItem dataItem = new DataItem();
			dataItem.setWorkspaceId(_ctx.stringValue("QueryOrganizationWorkspaceListResponse.Result.Data["+ i +"].WorkspaceId"));
			dataItem.setWorkspaceName(_ctx.stringValue("QueryOrganizationWorkspaceListResponse.Result.Data["+ i +"].WorkspaceName"));
			dataItem.setWorkspaceDescription(_ctx.stringValue("QueryOrganizationWorkspaceListResponse.Result.Data["+ i +"].WorkspaceDescription"));
			dataItem.setOrganizationId(_ctx.stringValue("QueryOrganizationWorkspaceListResponse.Result.Data["+ i +"].OrganizationId"));
			dataItem.setOwner(_ctx.stringValue("QueryOrganizationWorkspaceListResponse.Result.Data["+ i +"].Owner"));
			dataItem.setOwnerAccountName(_ctx.stringValue("QueryOrganizationWorkspaceListResponse.Result.Data["+ i +"].OwnerAccountName"));
			dataItem.setCreateUser(_ctx.stringValue("QueryOrganizationWorkspaceListResponse.Result.Data["+ i +"].CreateUser"));
			dataItem.setCreateUserAccountName(_ctx.stringValue("QueryOrganizationWorkspaceListResponse.Result.Data["+ i +"].CreateUserAccountName"));
			dataItem.setModifyUser(_ctx.stringValue("QueryOrganizationWorkspaceListResponse.Result.Data["+ i +"].ModifyUser"));
			dataItem.setModifyUserAccountName(_ctx.stringValue("QueryOrganizationWorkspaceListResponse.Result.Data["+ i +"].ModifyUserAccountName"));
			dataItem.setCreateTime(_ctx.stringValue("QueryOrganizationWorkspaceListResponse.Result.Data["+ i +"].CreateTime"));
			dataItem.setModifiedTime(_ctx.stringValue("QueryOrganizationWorkspaceListResponse.Result.Data["+ i +"].ModifiedTime"));
			dataItem.setAllowShareOperation(_ctx.booleanValue("QueryOrganizationWorkspaceListResponse.Result.Data["+ i +"].AllowShareOperation"));
			dataItem.setAllowPublishOperation(_ctx.booleanValue("QueryOrganizationWorkspaceListResponse.Result.Data["+ i +"].AllowPublishOperation"));

			data.add(dataItem);
		}
		result.setData(data);
		queryOrganizationWorkspaceListResponse.setResult(result);
	 
	 	return queryOrganizationWorkspaceListResponse;
	}
}