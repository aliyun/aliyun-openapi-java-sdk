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

import com.aliyuncs.quickbi_public.model.v20200807.QueryWorksByWorkspaceResponse;
import com.aliyuncs.quickbi_public.model.v20200807.QueryWorksByWorkspaceResponse.Result;
import com.aliyuncs.quickbi_public.model.v20200807.QueryWorksByWorkspaceResponse.Result.DataItem;
import com.aliyuncs.quickbi_public.model.v20200807.QueryWorksByWorkspaceResponse.Result.DataItem.Directory;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryWorksByWorkspaceResponseUnmarshaller {

	public static QueryWorksByWorkspaceResponse unmarshall(QueryWorksByWorkspaceResponse queryWorksByWorkspaceResponse, UnmarshallerContext _ctx) {
		
		queryWorksByWorkspaceResponse.setRequestId(_ctx.stringValue("QueryWorksByWorkspaceResponse.RequestId"));
		queryWorksByWorkspaceResponse.setSuccess(_ctx.booleanValue("QueryWorksByWorkspaceResponse.Success"));

		Result result = new Result();
		result.setTotalNum(_ctx.integerValue("QueryWorksByWorkspaceResponse.Result.TotalNum"));
		result.setTotalPages(_ctx.integerValue("QueryWorksByWorkspaceResponse.Result.TotalPages"));
		result.setPageNum(_ctx.integerValue("QueryWorksByWorkspaceResponse.Result.PageNum"));
		result.setPageSize(_ctx.integerValue("QueryWorksByWorkspaceResponse.Result.PageSize"));

		List<DataItem> data = new ArrayList<DataItem>();
		for (int i = 0; i < _ctx.lengthValue("QueryWorksByWorkspaceResponse.Result.Data.Length"); i++) {
			DataItem dataItem = new DataItem();
			dataItem.setWorksId(_ctx.stringValue("QueryWorksByWorkspaceResponse.Result.Data["+ i +"].WorksId"));
			dataItem.setWorkType(_ctx.stringValue("QueryWorksByWorkspaceResponse.Result.Data["+ i +"].WorkType"));
			dataItem.setWorkName(_ctx.stringValue("QueryWorksByWorkspaceResponse.Result.Data["+ i +"].WorkName"));
			dataItem.setWorkspaceId(_ctx.stringValue("QueryWorksByWorkspaceResponse.Result.Data["+ i +"].WorkspaceId"));
			dataItem.setSecurityLevel(_ctx.stringValue("QueryWorksByWorkspaceResponse.Result.Data["+ i +"].SecurityLevel"));
			dataItem.setDescription(_ctx.stringValue("QueryWorksByWorkspaceResponse.Result.Data["+ i +"].Description"));
			dataItem.setOwnerId(_ctx.stringValue("QueryWorksByWorkspaceResponse.Result.Data["+ i +"].OwnerId"));
			dataItem.setOwnerName(_ctx.stringValue("QueryWorksByWorkspaceResponse.Result.Data["+ i +"].OwnerName"));
			dataItem.setModifyName(_ctx.stringValue("QueryWorksByWorkspaceResponse.Result.Data["+ i +"].ModifyName"));
			dataItem.setGmtCreate(_ctx.stringValue("QueryWorksByWorkspaceResponse.Result.Data["+ i +"].GmtCreate"));
			dataItem.setGmtModify(_ctx.stringValue("QueryWorksByWorkspaceResponse.Result.Data["+ i +"].GmtModify"));
			dataItem.setAuth3rdFlag(_ctx.integerValue("QueryWorksByWorkspaceResponse.Result.Data["+ i +"].Auth3rdFlag"));
			dataItem.setStatus(_ctx.integerValue("QueryWorksByWorkspaceResponse.Result.Data["+ i +"].Status"));
			dataItem.setWorkspaceName(_ctx.stringValue("QueryWorksByWorkspaceResponse.Result.Data["+ i +"].WorkspaceName"));

			Directory directory = new Directory();
			directory.setId(_ctx.stringValue("QueryWorksByWorkspaceResponse.Result.Data["+ i +"].Directory.Id"));
			directory.setName(_ctx.stringValue("QueryWorksByWorkspaceResponse.Result.Data["+ i +"].Directory.Name"));
			directory.setPathId(_ctx.stringValue("QueryWorksByWorkspaceResponse.Result.Data["+ i +"].Directory.PathId"));
			directory.setPathName(_ctx.stringValue("QueryWorksByWorkspaceResponse.Result.Data["+ i +"].Directory.PathName"));
			dataItem.setDirectory(directory);

			data.add(dataItem);
		}
		result.setData(data);
		queryWorksByWorkspaceResponse.setResult(result);
	 
	 	return queryWorksByWorkspaceResponse;
	}
}