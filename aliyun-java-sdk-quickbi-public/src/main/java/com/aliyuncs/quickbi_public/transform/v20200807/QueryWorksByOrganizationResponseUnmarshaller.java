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

package com.aliyuncs.quickbi_public.transform.v20200807;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.quickbi_public.model.v20200807.QueryWorksByOrganizationResponse;
import com.aliyuncs.quickbi_public.model.v20200807.QueryWorksByOrganizationResponse.Result;
import com.aliyuncs.quickbi_public.model.v20200807.QueryWorksByOrganizationResponse.Result.DataItem;
import com.aliyuncs.quickbi_public.model.v20200807.QueryWorksByOrganizationResponse.Result.DataItem.Directory;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryWorksByOrganizationResponseUnmarshaller {

	public static QueryWorksByOrganizationResponse unmarshall(QueryWorksByOrganizationResponse queryWorksByOrganizationResponse, UnmarshallerContext _ctx) {
		
		queryWorksByOrganizationResponse.setRequestId(_ctx.stringValue("QueryWorksByOrganizationResponse.RequestId"));
		queryWorksByOrganizationResponse.setSuccess(_ctx.booleanValue("QueryWorksByOrganizationResponse.Success"));

		Result result = new Result();
		result.setPageNum(_ctx.integerValue("QueryWorksByOrganizationResponse.Result.PageNum"));
		result.setPageSize(_ctx.integerValue("QueryWorksByOrganizationResponse.Result.PageSize"));
		result.setTotalNum(_ctx.integerValue("QueryWorksByOrganizationResponse.Result.TotalNum"));
		result.setTotalPages(_ctx.integerValue("QueryWorksByOrganizationResponse.Result.TotalPages"));

		List<DataItem> data = new ArrayList<DataItem>();
		for (int i = 0; i < _ctx.lengthValue("QueryWorksByOrganizationResponse.Result.Data.Length"); i++) {
			DataItem dataItem = new DataItem();
			dataItem.setAuth3rdFlag(_ctx.integerValue("QueryWorksByOrganizationResponse.Result.Data["+ i +"].Auth3rdFlag"));
			dataItem.setDescription(_ctx.stringValue("QueryWorksByOrganizationResponse.Result.Data["+ i +"].Description"));
			dataItem.setGmtCreate(_ctx.stringValue("QueryWorksByOrganizationResponse.Result.Data["+ i +"].GmtCreate"));
			dataItem.setGmtModify(_ctx.stringValue("QueryWorksByOrganizationResponse.Result.Data["+ i +"].GmtModify"));
			dataItem.setModifyName(_ctx.stringValue("QueryWorksByOrganizationResponse.Result.Data["+ i +"].ModifyName"));
			dataItem.setOwnerId(_ctx.stringValue("QueryWorksByOrganizationResponse.Result.Data["+ i +"].OwnerId"));
			dataItem.setOwnerName(_ctx.stringValue("QueryWorksByOrganizationResponse.Result.Data["+ i +"].OwnerName"));
			dataItem.setSecurityLevel(_ctx.stringValue("QueryWorksByOrganizationResponse.Result.Data["+ i +"].SecurityLevel"));
			dataItem.setStatus(_ctx.integerValue("QueryWorksByOrganizationResponse.Result.Data["+ i +"].Status"));
			dataItem.setWorkName(_ctx.stringValue("QueryWorksByOrganizationResponse.Result.Data["+ i +"].WorkName"));
			dataItem.setWorkType(_ctx.stringValue("QueryWorksByOrganizationResponse.Result.Data["+ i +"].WorkType"));
			dataItem.setWorksId(_ctx.stringValue("QueryWorksByOrganizationResponse.Result.Data["+ i +"].WorksId"));
			dataItem.setWorkspaceId(_ctx.stringValue("QueryWorksByOrganizationResponse.Result.Data["+ i +"].WorkspaceId"));
			dataItem.setWorkspaceName(_ctx.stringValue("QueryWorksByOrganizationResponse.Result.Data["+ i +"].WorkspaceName"));

			Directory directory = new Directory();
			directory.setId(_ctx.stringValue("QueryWorksByOrganizationResponse.Result.Data["+ i +"].Directory.Id"));
			directory.setName(_ctx.stringValue("QueryWorksByOrganizationResponse.Result.Data["+ i +"].Directory.Name"));
			directory.setPathId(_ctx.stringValue("QueryWorksByOrganizationResponse.Result.Data["+ i +"].Directory.PathId"));
			directory.setPathName(_ctx.stringValue("QueryWorksByOrganizationResponse.Result.Data["+ i +"].Directory.PathName"));
			dataItem.setDirectory(directory);

			data.add(dataItem);
		}
		result.setData(data);
		queryWorksByOrganizationResponse.setResult(result);
	 
	 	return queryWorksByOrganizationResponse;
	}
}