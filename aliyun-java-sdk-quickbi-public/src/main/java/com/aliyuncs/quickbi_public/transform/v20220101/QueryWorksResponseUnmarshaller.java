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

import com.aliyuncs.quickbi_public.model.v20220101.QueryWorksResponse;
import com.aliyuncs.quickbi_public.model.v20220101.QueryWorksResponse.Result;
import com.aliyuncs.quickbi_public.model.v20220101.QueryWorksResponse.Result.Directory;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryWorksResponseUnmarshaller {

	public static QueryWorksResponse unmarshall(QueryWorksResponse queryWorksResponse, UnmarshallerContext _ctx) {
		
		queryWorksResponse.setRequestId(_ctx.stringValue("QueryWorksResponse.RequestId"));
		queryWorksResponse.setSuccess(_ctx.booleanValue("QueryWorksResponse.Success"));

		Result result = new Result();
		result.setWorksId(_ctx.stringValue("QueryWorksResponse.Result.WorksId"));
		result.setWorkType(_ctx.stringValue("QueryWorksResponse.Result.WorkType"));
		result.setWorkName(_ctx.stringValue("QueryWorksResponse.Result.WorkName"));
		result.setWorkspaceId(_ctx.stringValue("QueryWorksResponse.Result.WorkspaceId"));
		result.setWorkspaceName(_ctx.stringValue("QueryWorksResponse.Result.WorkspaceName"));
		result.setSecurityLevel(_ctx.stringValue("QueryWorksResponse.Result.SecurityLevel"));
		result.setAuth3rdFlag(_ctx.integerValue("QueryWorksResponse.Result.Auth3rdFlag"));
		result.setDescription(_ctx.stringValue("QueryWorksResponse.Result.Description"));
		result.setOwnerId(_ctx.stringValue("QueryWorksResponse.Result.OwnerId"));
		result.setOwnerName(_ctx.stringValue("QueryWorksResponse.Result.OwnerName"));
		result.setModifyName(_ctx.stringValue("QueryWorksResponse.Result.ModifyName"));
		result.setGmtCreate(_ctx.stringValue("QueryWorksResponse.Result.GmtCreate"));
		result.setGmtModify(_ctx.stringValue("QueryWorksResponse.Result.GmtModify"));
		result.setStatus(_ctx.integerValue("QueryWorksResponse.Result.Status"));

		Directory directory = new Directory();
		directory.setId(_ctx.stringValue("QueryWorksResponse.Result.Directory.Id"));
		directory.setName(_ctx.stringValue("QueryWorksResponse.Result.Directory.Name"));
		directory.setPathId(_ctx.stringValue("QueryWorksResponse.Result.Directory.PathId"));
		directory.setPathName(_ctx.stringValue("QueryWorksResponse.Result.Directory.PathName"));
		result.setDirectory(directory);
		queryWorksResponse.setResult(result);
	 
	 	return queryWorksResponse;
	}
}