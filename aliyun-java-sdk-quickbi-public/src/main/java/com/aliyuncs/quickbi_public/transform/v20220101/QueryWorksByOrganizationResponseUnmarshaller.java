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

import com.aliyuncs.quickbi_public.model.v20220101.QueryWorksByOrganizationResponse;
import com.aliyuncs.quickbi_public.model.v20220101.QueryWorksByOrganizationResponse.Result;
import com.aliyuncs.quickbi_public.model.v20220101.QueryWorksByOrganizationResponse.Result.DataItem;
import com.aliyuncs.quickbi_public.model.v20220101.QueryWorksByOrganizationResponse.Result.DataItem.Directory;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryWorksByOrganizationResponseUnmarshaller {

	public static QueryWorksByOrganizationResponse unmarshall(QueryWorksByOrganizationResponse queryWorksByOrganizationResponse, UnmarshallerContext _ctx) {
		
		queryWorksByOrganizationResponse.setRequestId(_ctx.stringValue("QueryWorksByOrganizationResponse.RequestId"));
		queryWorksByOrganizationResponse.setSuccess(_ctx.booleanValue("QueryWorksByOrganizationResponse.Success"));

		Result result = new Result();
		result.setTotalPages(_ctx.integerValue("QueryWorksByOrganizationResponse.Result.TotalPages"));
		result.setPageNum(_ctx.integerValue("QueryWorksByOrganizationResponse.Result.PageNum"));
		result.setPageSize(_ctx.integerValue("QueryWorksByOrganizationResponse.Result.PageSize"));
		result.setTotalNum(_ctx.integerValue("QueryWorksByOrganizationResponse.Result.TotalNum"));

		List<DataItem> data = new ArrayList<DataItem>();
		for (int i = 0; i < _ctx.lengthValue("QueryWorksByOrganizationResponse.Result.Data.Length"); i++) {
			DataItem dataItem = new DataItem();
			dataItem.setStatus(_ctx.integerValue("QueryWorksByOrganizationResponse.Result.Data["+ i +"].Status"));
			dataItem.setAuth3rdFlag(_ctx.integerValue("QueryWorksByOrganizationResponse.Result.Data["+ i +"].Auth3rdFlag"));
			dataItem.setGmtModify(_ctx.stringValue("QueryWorksByOrganizationResponse.Result.Data["+ i +"].GmtModify"));
			dataItem.setWorksId(_ctx.stringValue("QueryWorksByOrganizationResponse.Result.Data["+ i +"].WorksId"));
			dataItem.setWorkType(_ctx.stringValue("QueryWorksByOrganizationResponse.Result.Data["+ i +"].WorkType"));
			dataItem.setOwnerName(_ctx.stringValue("QueryWorksByOrganizationResponse.Result.Data["+ i +"].OwnerName"));
			dataItem.setWorkspaceName(_ctx.stringValue("QueryWorksByOrganizationResponse.Result.Data["+ i +"].WorkspaceName"));
			dataItem.setOwnerId(_ctx.stringValue("QueryWorksByOrganizationResponse.Result.Data["+ i +"].OwnerId"));
			dataItem.setModifyName(_ctx.stringValue("QueryWorksByOrganizationResponse.Result.Data["+ i +"].ModifyName"));
			dataItem.setWorkspaceId(_ctx.stringValue("QueryWorksByOrganizationResponse.Result.Data["+ i +"].WorkspaceId"));
			dataItem.setSecurityLevel(_ctx.stringValue("QueryWorksByOrganizationResponse.Result.Data["+ i +"].SecurityLevel"));
			dataItem.setDescription(_ctx.stringValue("QueryWorksByOrganizationResponse.Result.Data["+ i +"].Description"));
			dataItem.setWorkName(_ctx.stringValue("QueryWorksByOrganizationResponse.Result.Data["+ i +"].WorkName"));
			dataItem.setGmtCreate(_ctx.stringValue("QueryWorksByOrganizationResponse.Result.Data["+ i +"].GmtCreate"));
			dataItem.setPublicFlag(_ctx.booleanValue("QueryWorksByOrganizationResponse.Result.Data["+ i +"].PublicFlag"));
			dataItem.setPublicInvalidTime(_ctx.longValue("QueryWorksByOrganizationResponse.Result.Data["+ i +"].PublicInvalidTime"));

			Directory directory = new Directory();
			directory.setPathId(_ctx.stringValue("QueryWorksByOrganizationResponse.Result.Data["+ i +"].Directory.PathId"));
			directory.setPathName(_ctx.stringValue("QueryWorksByOrganizationResponse.Result.Data["+ i +"].Directory.PathName"));
			directory.setName(_ctx.stringValue("QueryWorksByOrganizationResponse.Result.Data["+ i +"].Directory.Name"));
			directory.setId(_ctx.stringValue("QueryWorksByOrganizationResponse.Result.Data["+ i +"].Directory.Id"));
			dataItem.setDirectory(directory);

			data.add(dataItem);
		}
		result.setData(data);
		queryWorksByOrganizationResponse.setResult(result);
	 
	 	return queryWorksByOrganizationResponse;
	}
}